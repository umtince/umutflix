import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignInPage extends JFrame implements ActionListener{
	private ImageIcon logoIcon, bgIcon;
	private JLabel backgroundImg, logoImg, emailLabel, passwordLabel;
	private JTextField emailTF;
	private JPasswordField passwordTF;
	private JButton signIn, return2WelcomePage;
	
	private WelcomePage referenceToWelcomePage;
	
	public SignInPage() {
		Container c = getContentPane();
		c.setLayout(null);
	
		//Create Background Image
		bgIcon = new ImageIcon("src\\black_bg.png");
		backgroundImg = new JLabel("",bgIcon,JLabel.CENTER);
		backgroundImg.setBounds(0,0,1920,1080);
		
		//Create Logo
		logoIcon = new ImageIcon("src\\logo.png");
		logoImg = new JLabel("",logoIcon,JLabel.CENTER);
		logoImg.setBounds(0, 30, 300, 65);
		
		//Create emailLabel
		emailLabel = new JLabel("Email: ");
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font(Font.DIALOG, Font.BOLD, 35));
		emailLabel.setBounds(680,400,150,100);
		
		//Create passwordLabel
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setFont(new Font(Font.DIALOG, Font.BOLD, 35));
		passwordLabel.setBounds(680,470,250,100);
		
		//Create email TextField
		emailTF = new JTextField(20);
		emailTF.setBounds(890,435,350,35);
		emailTF.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		emailTF.setBorder(null);
		
		//Create password PasswordField
		passwordTF = new JPasswordField(20);
		passwordTF.setBounds(890,505,350,35);
		passwordTF.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		passwordTF.setBorder(null);
		
		//Create signIn Button
		signIn = new JButton("Sign in");
		signIn.setBounds(680,580,560,100);
		signIn.setBackground(Color.RED);
		signIn.setForeground(Color.WHITE);
		signIn.setBorder(null);
		signIn.setFocusPainted(false);
		signIn.setFont(new Font(Font.DIALOG, Font.BOLD, 45));
		
		//Create return2WelcomePage Button
		return2WelcomePage = new JButton("\u2190");
		return2WelcomePage.setBounds(670,280,80,70);
		return2WelcomePage.setBackground(Color.BLACK);
		return2WelcomePage.setForeground(Color.WHITE);
		return2WelcomePage.setBorder(null);
		return2WelcomePage.setFocusPainted(false);
		return2WelcomePage.setFont(new Font(Font.DIALOG, Font.BOLD, 85));
		
		//Set JFrame properties
		this.setTitle("Umutflix");
		this.setVisible(false);
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Add components to Container
		c.add(return2WelcomePage);
		c.add(signIn);
		c.add(passwordTF);
		c.add(emailTF);
		c.add(emailLabel);
		c.add(passwordLabel);
		c.add(logoImg);
		c.add(backgroundImg);
		
		return2WelcomePage.addActionListener(this);
	}
	
	public void establishReferenceToWelcomePage(WelcomePage w) {
		this.referenceToWelcomePage = w;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == return2WelcomePage){
			this.setVisible(false);
			referenceToWelcomePage.setVisible(true);
		}
		
		/*
		 * SIGN IN BUTTONU ���N ACTION L�STENER EKLENECEK!!
		 * */
	}
	
}



//MEHMET UMUT �NCEER