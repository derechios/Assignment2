import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;

import java.awt.BorderLayout;

import javax.swing.JTextArea;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class Congratulations {

	private JFrame frame;
	private Welcome parent;
	private String user;
	/**
	 * Create the application.
	 */
	public Congratulations(Welcome p, String user) {
		parent = p;
		this.user = user;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane txtpnWelcomeUser = new JTextPane();
		txtpnWelcomeUser.setEditable(false);
		txtpnWelcomeUser.setText("Welcome "+ user);
		StyledDocument doc = txtpnWelcomeUser.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		Point p = new Point();
		p.x = frame.getWidth()/2 - txtpnWelcomeUser.getWidth()/2;
		p.y =frame.getHeight()/2 - txtpnWelcomeUser.getHeight()/2;
		System.out.println(p.x +" "+ p.y);
		txtpnWelcomeUser.setLocation(p);
		frame.getContentPane().add(txtpnWelcomeUser);	
		
		frame.setVisible(true);
		
		
		
		
	}

}
