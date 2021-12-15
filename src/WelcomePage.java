import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage extends JFrame implements ActionListener{

	private JLabel backgroundImg, slogan, slogan2, logoImg;
	private ImageIcon bgIcon, logoIcon;
	private JButton getStarted, signIn;
	
	private SignInPage referenceToSignInPage;
	private SubscriptionPage referenceToSubscriptionPage;
	
	public WelcomePage(SignInPage si, SubscriptionPage sp) {
		
		this.referenceToSignInPage = si;
		this.referenceToSubscriptionPage = sp;
		
		Container c = getContentPane();
		c.setLayout(null);

		//Create Background Image
		bgIcon = new ImageIcon("src\\aDark3.jpg");
		backgroundImg = new JLabel("",bgIcon,JLabel.CENTER);
		backgroundImg.setBounds(0,0,1920,1080);
		
		//Create Slogan
		slogan = new JLabel("<html>Unlimited movies, TV shows, and more.</html>");
		slogan.setBounds(520,300,1200,250);
		slogan.setForeground(Color.WHITE);
		slogan.setFont(new Font(Font.DIALOG, Font.BOLD, 90));
		
		//Create Slogan2
		slogan2 = new JLabel("Watch anywhere. Cancel anytime.");
		slogan2.setBounds(680,500,560,250);
		slogan2.setForeground(Color.WHITE);
		slogan2.setFont(new Font(Font.DIALOG, Font.BOLD, 35));
		
		//Create Logo
		logoIcon = new ImageIcon("src\\logo.png");
		logoImg = new JLabel("",logoIcon,JLabel.CENTER);
		logoImg.setBounds(0, 30, 300, 65);
		
		//Create GetStarted Button
		getStarted = new JButton("Get Started");
		getStarted.setBounds(560,800,350,100);
		getStarted.setBackground(Color.RED);
		getStarted.setForeground(Color.WHITE);
		getStarted.setBorder(null);
		getStarted.setFocusPainted(false);
		getStarted.setFont(new Font(Font.DIALOG, Font.BOLD, 45));
		
		//Create signIn Button
		signIn = new JButton("Sign in");
		signIn.setBounds(1010,800,350,100);
		signIn.setBackground(Color.WHITE);
		signIn.setForeground(Color.RED);
		signIn.setBorder(null);
		signIn.setFocusPainted(false);
		signIn.setFont(new Font(Font.DIALOG, Font.BOLD, 45));
		
		//Set JFrame properties
		this.setTitle("Umutflix");
		this.setVisible(true);
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Add components to container
		c.add(signIn);
		c.add(getStarted);
		c.add(logoImg);
		c.add(slogan);
		c.add(slogan2);
		c.add(backgroundImg);
		
		
		signIn.addActionListener(this);
		getStarted.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == signIn)
		{
			referenceToSignInPage.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource() == getStarted)
		{
			referenceToSubscriptionPage.setVisible(true);
			this.setVisible(false);
		}
		
		/*
		 * GET STARTED BUTTONU ÝÇÝN ACTION LÝSTENER EKLENECEK!!
		 * */
	}
	
	
	
	
}






//MEHMET UMUT ÝNCEER

