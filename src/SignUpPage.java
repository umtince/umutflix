import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpPage extends JFrame implements ActionListener {
	private ImageIcon logoIcon, bgIcon;
	private JLabel backgroundImg, logoImg, emailLabel, passwordLabel, creditCardNoLabel, creditCardDateLabel, creditCard3DLabel;
	private JTextField emailTF, creditCardNoTF, creditCardDateTF, creditCard3DTF;
	private JPasswordField passwordTF;
	private JButton signUp, return2SubscriptionPage;
	
	private SubscriptionPage referenceToSubscriptionPage;
	
	private int x = 645;
	private int y = 300;
	private int fontSize = 35;
	//private WelcomePage referenceToWelcomePage;
	
	public SignUpPage() {
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
		emailLabel = new JLabel("Email:");
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font(Font.DIALOG, Font.BOLD, fontSize));
		emailLabel.setBounds(x,y,150,100);
		
		//Create passwordLabel
		passwordLabel = new JLabel("Password:");
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setFont(new Font(Font.DIALOG, Font.BOLD, fontSize));
		passwordLabel.setBounds(x,y+70,250,100);
		
		creditCardNoLabel = new JLabel("Credit Card Number:");
		creditCardNoLabel.setForeground(Color.WHITE);
		creditCardNoLabel.setFont(new Font(Font.DIALOG, Font.BOLD, fontSize-10));
		creditCardNoLabel.setBounds(x,y+140,250,100);
		
		creditCardDateLabel = new JLabel("Credit Card Number:");
		creditCardDateLabel.setForeground(Color.WHITE);
		creditCardDateLabel.setFont(new Font(Font.DIALOG, Font.BOLD, fontSize-10));
		creditCardDateLabel.setBounds(x,y+210,250,100);
		
		creditCardDateLabel = new JLabel("<html>Credit Card Date (MM/YY):</html>");
		creditCardDateLabel.setForeground(Color.WHITE);
		creditCardDateLabel.setFont(new Font(Font.DIALOG, Font.BOLD, fontSize-15));
		creditCardDateLabel.setBounds(x,y+210,300,100);
		
		creditCard3DLabel = new JLabel("<html>Credit Card Security Number:</html>");
		creditCard3DLabel.setForeground(Color.WHITE);
		creditCard3DLabel.setFont(new Font(Font.DIALOG, Font.BOLD, fontSize-15));
		creditCard3DLabel.setBounds(x,y+290,250,100);
		
		//Create email TextField
		emailTF = new JTextField(20);
		emailTF.setBounds(x+270,y+35,350,35);
		emailTF.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		emailTF.setBorder(null);
		
		//Create password PasswordField
		passwordTF = new JPasswordField(20);
		passwordTF.setBounds(x+270,y+105,350,35);
		passwordTF.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		passwordTF.setBorder(null);
		
		creditCardNoTF = new JTextField(20);
		creditCardNoTF.setBounds(x+270,y+175,235,35);
		creditCardNoTF.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		creditCardNoTF.setBorder(null);
		
		creditCardDateTF = new JTextField(5);
		creditCardDateTF.setBounds(x+270,y+245,70,35);
		creditCardDateTF.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		creditCardDateTF.setBorder(null);
		
		creditCard3DTF = new JTextField(3);
		creditCard3DTF.setBounds(x+270,y+315,50,35);
		creditCard3DTF.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		creditCard3DTF.setBorder(null);
		
		
		
		//Create signUp Button
		signUp = new JButton("Sign up");
		signUp.setBounds(x,y+450,630,100);
		signUp.setBackground(Color.RED);
		signUp.setForeground(Color.WHITE);
		signUp.setBorder(null);
		signUp.setFocusPainted(false);
		signUp.setFont(new Font(Font.DIALOG, Font.BOLD, 45));
		
		//Create return2SubscriptionPage Button
		return2SubscriptionPage = new JButton("\u2190");
		return2SubscriptionPage.setBounds(x-10,y-120,80,70);
		return2SubscriptionPage.setBackground(Color.BLACK);
		return2SubscriptionPage.setForeground(Color.WHITE);
		return2SubscriptionPage.setBorder(null);
		return2SubscriptionPage.setFocusPainted(false);
		return2SubscriptionPage.setFont(new Font(Font.DIALOG, Font.BOLD, 85));
		
		//Set JFrame properties
		this.setTitle("Umutflix");
		this.setVisible(true);
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Add components to Container
		c.add(return2SubscriptionPage);
		c.add(creditCard3DTF);
		c.add(creditCardNoTF);
		c.add(creditCardDateTF);
		c.add(creditCardNoLabel);
		c.add(creditCard3DLabel);
		c.add(creditCardDateLabel);
		c.add(signUp);
		c.add(passwordTF);
		c.add(emailTF);
		c.add(emailLabel);
		c.add(passwordLabel);
		c.add(logoImg);
		c.add(backgroundImg);
		
		return2SubscriptionPage.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == return2SubscriptionPage) {
			this.setVisible(false);
			referenceToSubscriptionPage.setVisible(true);
		}
	}
	
	public void establishReferenceToSubscriptionPage(SubscriptionPage sp)
	{
		this.referenceToSubscriptionPage = sp;
	}
}