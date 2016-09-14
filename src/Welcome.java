import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.UIManager;


public class Welcome {

	private JFrame frmWelcomeScreen;
	private JButton loginField;

	/**
	 * Launch the application.
	 */static Welcome window;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Welcome();
					window.frmWelcomeScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private Login login;
	private SignUp register;
	private Congratulations congrats;
	public void focus()
	{
		register = null;
		login = null;
		congrats = null;
		switchScreen("Welcome");
		
	}
	private String authorizedUser;
	public void userAccount(String s)
	{
		authorizedUser = s;
		switchScreen("Congratulations");
	}
	private void switchScreen(String screen)
	{
		switch(screen)
		{
		case "Login": //switch to login screen
			System.out.println("Login"); 
			login = new Login(this);
			window.frmWelcomeScreen.setVisible(false);
			;break;
		case "SignUp": //switch to signup screen
			System.out.println("SignUp"); 
			register = new SignUp(this);
			window.frmWelcomeScreen.setVisible(false);
			break;
		case "Welcome": //switch to welcome screen
			System.out.println("Welcome"); 
			window.frmWelcomeScreen.setVisible(true);
			break;
		case "Congratulations": //switch to welcome screen
			System.out.println("congrats"); 
			congrats = new Congratulations(this, authorizedUser);
			window.frmWelcomeScreen.setVisible(false);
			break;
		default: System.out.println("Invalid switchscreen Input");break;//figure it out
		}
	}
	private void initialize() {
		frmWelcomeScreen = new JFrame();
		frmWelcomeScreen.setTitle("Welcome Screen");
		frmWelcomeScreen.setResizable(false);
		frmWelcomeScreen.setBounds(100, 100, 450, 300);
		frmWelcomeScreen.setSize(500, 600);
		frmWelcomeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeScreen.getContentPane().setLayout(null);
		System.out.println("aaaaaaaaaaaaaaaA!#".matches("([0-9]+)([a-z]+)([A-Z]+)([!#$%&'*+,-./:;<=>?@^_`{|}~]+)"));
		loginField = new JButton();
		loginField.setBorder(null);
		loginField.setBounds(434, 11, 50, 20);
		loginField.setText("Login");
		loginField.setToolTipText("Click to login!");
		loginField.addActionListener( (new ActionListener() 
			{  public void actionPerformed(ActionEvent e) 
				{
				switchScreen("Login");
				}
			})
			);
		frmWelcomeScreen.getContentPane().add(loginField);
		
		JButton btnSignUp = new JButton("Sign Up!");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				switchScreen("SignUp");
			}
		});
		btnSignUp.setBounds(113, 176, 200, 50);
		frmWelcomeScreen.getContentPane().add(btnSignUp);



	}
}
