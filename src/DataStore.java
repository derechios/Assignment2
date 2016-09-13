
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class DataStore 
{
	TreeMap<String, User> data;
	Path path = Paths.get("Database");
	public DataStore()
	{
		data = new TreeMap<String, User>();
	}
	//make boolean for invalid path checking?
	public void setPath(Path p)
	{
		path = p;

	}
	public boolean loadData()
	{
		
		File f = new File(path.toString());
		if(f.exists())
		{
		try {
			Scanner in = new Scanner(f);
			while (in.hasNextLine())
			{
				String inputs = in.nextLine();
				String[] info = inputs.split("<>");
				if(info.length!= 10)
				{
					//bad input. fix eventually
				}else
				{
					Date incoming = new Date(Integer.parseInt(info[4].substring(0, 3)),
							Integer.parseInt(info[4].substring(3, 5)),
							Integer.parseInt(info[4].substring(5, 7)));
						User hey = new User(info[1], info[1], info[2], Long.parseLong(info[3]), 
								incoming, 
								info[5] ,info[6] ,info[7],
								Long.parseLong(info[8]), new File(info[9]));
						//check for duplicates and stuff
						data.put(hey.getUserName(), hey);
				}
			}
				in.close();
			} 
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
		{
			return true;//data not loaded
		}
		return true;
	}
	public boolean addPerson(User p)
	{
		if(data.containsKey(p.getUserName())){return false;}
		data.put(p.getUserName(), p);
		return true;
	}
	public TreeMap<String, User> getUsers()
	{
		return data;
	}
	public void save()
	{
		String d = "Database";//default path
		File s = new File(d);
		BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new FileWriter(s));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for(Entry<String, User> entry : data.entrySet())
		{
			
			try {
				writer.write(entry.getValue().values()+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
