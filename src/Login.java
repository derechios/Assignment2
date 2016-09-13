
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.JTextField;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.TextField;

import javax.swing.JButton;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JFileChooser;
import javax.swing.Popup;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.awt.Color;
import java.awt.Component;



public class Login {

	private JFrame login;
	private JTextField userNameField, userNameLabel, passwordLabel;
	private JPasswordField passwordField;
	private Welcome parent;
	private DataStore data;
	
	/**
	 * Create the application.
	 */
	public Login(Welcome p) {
		parent = p;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		
		data= new DataStore();
		data.loadData();		
		
		login = new JFrame();
		login.setTitle("Login");
		login.getContentPane().setEnabled(false);
		login.getContentPane().setLayout(null);
		login.setSize(500, 600);
		login.setVisible(true);
		
		
		userNameField = new JTextField();
		userNameField.setBounds(100, 100, 200, 20);
		login.getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		userNameLabel = new JTextField();
		userNameLabel.setBounds(0, 100, 90, 20);
		userNameLabel.setText("UserName");
		userNameLabel.setEditable(false);
		login.getContentPane().add(userNameLabel);
		
		passwordLabel = new JTextField();
		passwordLabel.setBounds(0, 200, 90, 20);
		passwordLabel.setText("Password");
		passwordLabel.setEditable(false);
		login.getContentPane().add(passwordLabel);
		
		JButton submit_Button = new JButton("Submit");
		submit_Button.setBounds(100, 350, 200, 20);
		login.getContentPane().add(submit_Button);
		submit_Button.addActionListener(new ActionListener() 
		{  public void actionPerformed(ActionEvent e) 
			{
				if(data.getUsers().containsKey(userNameField.getText()))
				{
					String pw = "";
					char[] chars = passwordField.getPassword();
					for(int x = 0; x<chars.length; x++)
					{
						pw += chars[x];
					}
					if(data.getUsers().get(userNameField.getText()).checkPassword(pw))
					{
						login.setVisible(false);
						parent.userAccount(userNameField.getText());
					}
					else
					{
						JOptionPane.showMessageDialog(login, "Wrong Password");
					}
				}else
				{
					JOptionPane.showMessageDialog(login, "No such Username Registered");
				}
			}
		});
		
		JButton cancel_Button = new JButton("Cancel");
		cancel_Button.setBounds(100, 400, 200, 20);
		login.getContentPane().add(cancel_Button);
		cancel_Button.addActionListener(new ActionListener() 
		{  public void actionPerformed(ActionEvent e) 
		{
		login.setVisible(false);
		parent.focus();
		}
	}
);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 200, 200, 20);
		login.getContentPane().add(passwordField);
		
	login.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{userNameField, passwordField, submit_Button, cancel_Button}));
	}
}
