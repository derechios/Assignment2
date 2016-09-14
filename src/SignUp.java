import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageFilter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.BorderLayout;

import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;


public class SignUp {

	private JFrame frmSignUp;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmailAddress;
	private JTextField txtSocialSecurityNumber;
	private JTextField txtDateOfBirth;
	private JTextField txtGender;
	private JTextField txtPhoneNumber;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtRepeatPassword;
	private JTextField txtUserPhoto;
	private JTextField first_Name_Field;
	private JTextField last_Name_Field;
	private JTextField email_Field;
	private JTextField SSN_Field;
	private JTextField phone_Number_Field;
	private JTextField user_Name_Field;
	private JPasswordField password_Field_2;
	private JPasswordField password_Field;
	private JButton btnCancel;
	private String filePath = "";
	DataStore data; 
	private JLabel lbl_Banner;
	private Welcome parent;
	
	/**
	 * Create the application.
	 */
	public SignUp(Welcome p) {
		parent = p;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUp = new JFrame();
		frmSignUp.setTitle("Sign Up");
		frmSignUp.setBounds(100, 100, 500, 600);
		// frmSignUp.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE) ;
		
		data= new DataStore();
		if(! data.loadData())
		{
			JOptionPane.showMessageDialog(frmSignUp, "Error Connecting to Database");
			frmSignUp.setVisible(false);
			parent.focus();
		}else
		{
		}
		frmSignUp.setVisible(true);
		txtFirstName = new JTextField();
		txtFirstName.setEditable(false);
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(10, 50, 140, 20);
		frmSignUp.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setEditable(false);
		txtLastName.setText("Last Name");
		txtLastName.setColumns(10);
		txtLastName.setBounds(10, 80, 140, 20);
		frmSignUp.getContentPane().add(txtLastName);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setEditable(false);
		txtEmailAddress.setText("Email Address");
		txtEmailAddress.setColumns(10);
		txtEmailAddress.setBounds(10, 110, 140, 20);
		frmSignUp.getContentPane().add(txtEmailAddress);
		
		txtSocialSecurityNumber = new JTextField();
		txtSocialSecurityNumber.setEditable(false);
		txtSocialSecurityNumber.setText("Social Security Number");
		txtSocialSecurityNumber.setColumns(10);
		txtSocialSecurityNumber.setBounds(10, 140, 140, 20);
		frmSignUp.getContentPane().add(txtSocialSecurityNumber);
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setEditable(false);
		txtDateOfBirth.setText("Date of Birth");
		txtDateOfBirth.setColumns(10);
		txtDateOfBirth.setBounds(10, 170, 140, 20);
		frmSignUp.getContentPane().add(txtDateOfBirth);
		
		txtGender = new JTextField();
		txtGender.setEditable(false);
		txtGender.setText("Gender");
		txtGender.setColumns(10);
		txtGender.setBounds(10, 200, 140, 20);
		frmSignUp.getContentPane().add(txtGender);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setEditable(false);
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(10, 230, 140, 20);
		frmSignUp.getContentPane().add(txtPhoneNumber);
		
		txtUsername = new JTextField();
		txtUsername.setEditable(false);
		txtUsername.setText("Username");
		txtUsername.setColumns(10);
		txtUsername.setBounds(10, 260, 140, 20);
		frmSignUp.getContentPane().add(txtUsername);
		
		txtPassword = new JTextField();
		txtPassword.setEditable(false);
		txtPassword.setText("Password");
		txtPassword.setColumns(10);
		txtPassword.setBounds(10, 290, 140, 20);
		frmSignUp.getContentPane().add(txtPassword);
		
		txtRepeatPassword = new JTextField();
		txtRepeatPassword.setEditable(false);
		txtRepeatPassword.setText("Repeat Password");
		txtRepeatPassword.setColumns(10);
		txtRepeatPassword.setBounds(10, 320, 140, 20);
		frmSignUp.getContentPane().add(txtRepeatPassword);
		
		txtUserPhoto = new JTextField();
		txtUserPhoto.setEditable(false);
		txtUserPhoto.setText("User Photo");
		txtUserPhoto.setColumns(10);
		txtUserPhoto.setBounds(10, 350, 140, 20);
		frmSignUp.getContentPane().add(txtUserPhoto);
		
		first_Name_Field = new JTextField();
		first_Name_Field.setColumns(10);
		first_Name_Field.setBounds(200, 50, 185, 20);
		frmSignUp.getContentPane().add(first_Name_Field);
		
		last_Name_Field = new JTextField();
		last_Name_Field.setColumns(10);
		last_Name_Field.setBounds(200, 80, 185, 20);
		frmSignUp.getContentPane().add(last_Name_Field);
		
		email_Field = new JTextField();
		email_Field.setColumns(10);
		email_Field.setBounds(200, 110, 185, 20);
		frmSignUp.getContentPane().add(email_Field);
		
		SSN_Field = new JTextField();
		SSN_Field.setColumns(10);
		SSN_Field.setBounds(200, 140, 185, 20);
		frmSignUp.getContentPane().add(SSN_Field);
		
		phone_Number_Field = new JTextField();
		phone_Number_Field.setColumns(10);
		phone_Number_Field.setBounds(200, 230, 185, 20);
		frmSignUp.getContentPane().add(phone_Number_Field);
		
		user_Name_Field = new JTextField();
		user_Name_Field.setColumns(10);
		user_Name_Field.setBounds(200, 260, 185, 20);
		frmSignUp.getContentPane().add(user_Name_Field);
		
		
		
		
		Choice choice_Month = new Choice();
		choice_Month.setBounds(200, 170, 80, 20);
		choice_Month.add("January");
		choice_Month.add("February");
		choice_Month.add("March");
		choice_Month.add("April");
		choice_Month.add("May");
		choice_Month.add("June");
		choice_Month.add("July");
		choice_Month.add("August");
		choice_Month.add("September");
		choice_Month.add("October");
		choice_Month.add("November");
		choice_Month.add("December");
		frmSignUp.getContentPane().add(choice_Month);
		
		Choice choice_Gender = new Choice();
		choice_Gender.setBounds(200, 200, 185, 20);
		choice_Gender.add("Male");
		choice_Gender.add("Female");
		choice_Gender.add("Other");
		frmSignUp.getContentPane().add(choice_Gender);
		
		Choice choice_Day = new Choice();
		choice_Day.setBounds(280, 170, 45, 20);
		for (int x = 1; x< 31; x++)
		{
			choice_Day.add(Integer.toString(x));
		}
		frmSignUp.getContentPane().add(choice_Day);
		
		Choice choice_Year = new Choice();
		choice_Year.setBounds(325, 170, 60, 20);
		for(int x = 1900; x<=2016; x++)
		{
			choice_Year.add(Integer.toString(x));
		}
		frmSignUp.getContentPane().add(choice_Year);
		
		password_Field_2 = new JPasswordField();
		password_Field_2.setEchoChar('*');
		password_Field_2.setBounds(200, 320, 185, 20);
		frmSignUp.getContentPane().add(password_Field_2);
		
		password_Field = new JPasswordField();
		password_Field.setEchoChar('*');
		password_Field.setBounds(200, 290, 185, 20);
		frmSignUp.getContentPane().add(password_Field);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(200, 349, 89, 23);
	
		frmSignUp.getContentPane().add(btnBrowse);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(51, 425, 89, 23);
		frmSignUp.getContentPane().add(btnCancel);
		
		TextField error_Text_Field = new TextField();
		error_Text_Field.setBackground(Color.WHITE);
		error_Text_Field.setForeground(Color.RED);
		error_Text_Field.setFont(new Font("DokChampa", Font.BOLD, 10));
		error_Text_Field.setText("ERROR! Something went wrong. Please check your information carefully!");
		error_Text_Field.setEnabled(false);
		error_Text_Field.setEditable(false);
		error_Text_Field.setVisible(false);
		error_Text_Field.setBounds(10, 376, 360, 23);
		frmSignUp.getContentPane().add(error_Text_Field);
		btnCancel.addActionListener(new ActionListener() 
			{  public void actionPerformed(ActionEvent e) 
				{
				frmSignUp.setVisible(false);
				parent.focus();
				}
			}
		);
		JFileChooser browse = new JFileChooser();
	
		//ImageFilter  imageFilter = new ImageFilter();
		//browse.addChoosableFileFilter(new ImageFilter());//////////////////////////////////////set so can only pic images
		//browse.setFileFilter(imageFilter);
		browse.setAcceptAllFileFilterUsed(false);
		browse.setFileSelectionMode(JFileChooser.FILES_ONLY);
		browse.setSelectedFile(new File(""));
		btnBrowse.addActionListener(new ActionListener() 
			{  @SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) 
				{
					if (browse.getSelectedFile().getPath().equals("")&& browse.showOpenDialog(null) == browse.APPROVE_OPTION)
					{
						File file1 = browse.getSelectedFile();
						File out = new File("TEMPORARY_"+file1.getName().substring(file1.getName().lastIndexOf("."), file1.getName().length()));
						out.deleteOnExit();
						filePath = "TEMPORARY_"+file1.getName().substring(file1.getName().lastIndexOf("."), file1.getName().length());
						try {
							Files.deleteIfExists(out.toPath());
							Files.copy(file1.toPath(), out.toPath());

						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				} 
			}
		);
		JButton btnSubmit = new JButton("Submit!");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSubmit.setBackground(Color.BLUE);
		btnSubmit.setBounds(200, 425, 89, 23);
		frmSignUp.getContentPane().add(btnSubmit, BorderLayout.NORTH);
		
		lbl_Banner = new JLabel("Sign Up Here!");
		lbl_Banner.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Banner.setFont(new Font("Times New Roman", Font.BOLD, 18));
		frmSignUp.getContentPane().add(lbl_Banner, BorderLayout.NORTH);
		frmSignUp.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{first_Name_Field, last_Name_Field, email_Field, SSN_Field, choice_Month,  choice_Day, choice_Year, choice_Gender, phone_Number_Field, user_Name_Field,  password_Field, password_Field_2, btnBrowse, btnCancel, btnSubmit}));
		btnSubmit.addActionListener(new ActionListener() 
		{  @SuppressWarnings("unused")
		public void actionPerformed(ActionEvent r) 
			{
			boolean ready = true;
			if(email_Field.getText().toString().length()>12) //email must be at least 12 characters long; XXX@mail.xxx
			{
				String temp =email_Field.getText().substring(email_Field.getText().length()-9, email_Field.getText().length()-3);
				if(temp.compareTo("@mail.")!= 0)
				{
					ready = false;System.out.println("1");
					JOptionPane.showMessageDialog(frmSignUp, "Invalid email address");
				}
			}else
			{
				ready = false;
				JOptionPane.showMessageDialog(frmSignUp, "Invalid email address");
			}	
			
			String pw = "";
			char[] chars = password_Field.getPassword();
			for(int x = 0; x<chars.length; x++)
			{
				pw += chars[x];
			}
			String pw2 = "";
			char[] chars2 = password_Field_2.getPassword();
			for(int x = 0; x<chars2.length; x++)
			{
				pw2 += chars2[x];
			}
			
			//I made all fields required, by the way. GIVE ME YOUR INFORMATION, USERS!
				 if(user_Name_Field.getText().length()==0 || user_Name_Field.getText().length()<4)
				{
					 ready = false;System.out.println("2");
					 JOptionPane.showMessageDialog(frmSignUp, "Usernames are required to be at least four characters long");
				}
				else if(phone_Number_Field.getText().length()==10 && phone_Number_Field.getText().matches("\\d"))//checks for numbers only
				{
					ready = false;System.out.println("3");
					JOptionPane.showMessageDialog(frmSignUp, "Phone numbers must be digits only;\n No spaces or dashes!");
				}
				else if(first_Name_Field.getText().length()<2)
				{
					ready = false;System.out.println("4");
					JOptionPane.showMessageDialog(frmSignUp, "First name too short");
				}
				else if(last_Name_Field.getText().length()<2)
				{
					ready = false;System.out.println("5");
					JOptionPane.showMessageDialog(frmSignUp, "Last name too short");
				}
				else if(SSN_Field.getText().length()!= 9 || SSN_Field.getText().matches("\\d"))//checks for length and # only
				{
					ready = false;System.out.println("6");
					JOptionPane.showMessageDialog(frmSignUp, "SSN must be nine numbers; no spaces or dashes");
				}
				else if(! pw.equals(pw2) || pw.length()<4) 
				{
					ready = false;System.out.println("7");
					JOptionPane.showMessageDialog(frmSignUp, "Passwords do not match or are too short");
					password_Field.setText("");
					password_Field_2.setText("");
				}
				else if(false)//( pw.matches("([0-9]+)([a-z]+)([A-Z]+)([!#$%&'*+,-./:;<=>?@^_`{|}~]+)"))//the regex always returns false, no idea why.
					//according to everything I can check, it should return true if the password has a lower and uppercase letter, a number, and a special character.
					//it does not, and I dont have time to fix yet
				{
					
					ready = false;System.out.println("8");
					JOptionPane.showMessageDialog(frmSignUp, "Password requires a lowercase letter, uppercase letter, a number, and a special character ($%^&)");
				}
				else if	(Integer.parseInt(choice_Year.getSelectedItem().toString()) < 1910)
				{
					ready = false;System.out.println("9");
					JOptionPane.showMessageDialog(frmSignUp, "You're not that old!");
				}
				 //checks for days larger than month allows
				else if((choice_Month.getSelectedItem().toString().equals("September")||
						choice_Month.getSelectedItem().toString().equals("April")||
						choice_Month.getSelectedItem().toString().equals("June")||
						choice_Month.getSelectedItem().toString().equals("November"))&&
						Integer.parseInt(choice_Day.getSelectedItem().toString())>30)
				{
					ready = false;System.out.println("10");
					JOptionPane.showMessageDialog(frmSignUp, "Invalid Date");
				}
				 //checks for February
				else if(choice_Month.getSelectedItem().toString().equals("February")&&
						Integer.parseInt(choice_Day.getSelectedItem().toString())>28)
				{
					ready = false;System.out.println("11");
					JOptionPane.showMessageDialog(frmSignUp, "Invalid Date");
				}
				 //check for leapyear
				else if(choice_Month.getSelectedItem().toString().equals("February")&&
						(Integer.parseInt(choice_Day.getSelectedItem().toString())>27 || 
						Integer.parseInt(choice_Year.getSelectedItem().toString()) % 4 == 0 ))
				{
					ready = false;System.out.println("12");
					JOptionPane.showMessageDialog(frmSignUp, "Invalid Date");
				}
				else if (! browse.getSelectedFile().getPath().equals("nullFile")&&(! browse.getSelectedFile().exists()))
				{
					ready = false;
					JOptionPane.showMessageDialog(frmSignUp, "Please choose a valid photo");
				}
				if(ready == false)
				{
					
				}
				else
				{
					error_Text_Field.setEnabled(false);
					error_Text_Field.setVisible(false);
					Date date = new Date(Integer.parseInt(choice_Year.getSelectedItem()),
					Integer.parseInt(choice_Day.getSelectedItem()),
					choice_Month.getSelectedIndex()+1);
					

					File pic = new File(user_Name_Field.getText()+browse.getSelectedFile().getName().substring(browse.getSelectedFile().getName().lastIndexOf("."), browse.getSelectedFile().getName().length()));
					
					if(!data.addPerson(new User(first_Name_Field.getText(), last_Name_Field.getText(),
							choice_Gender.getSelectedItem(), Long.parseLong(SSN_Field.getText()),
							date, user_Name_Field.getText(), password_Field.getText(), email_Field.getText(),
							Long.parseLong(phone_Number_Field.getText()), pic)))//fix files saving stuff
					{
						JOptionPane.showMessageDialog(frmSignUp, "Username Already Exsists");
					}
					else{
						
						File file1 = browse.getSelectedFile();
						File out = new File(user_Name_Field.getText()+file1.getName().substring(file1.getName().lastIndexOf("."), file1.getName().length()));
						try {
							Files.deleteIfExists(out.toPath());
							Files.copy(file1.toPath(), out.toPath());

						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						data.save();
						frmSignUp.setVisible(false);
						parent.focus();
					}
					
				}

			}
		});	
		
		
	}

}
