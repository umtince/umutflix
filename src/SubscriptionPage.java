import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SubscriptionPage extends JFrame implements ActionListener {

	private ImageIcon logoIcon, bgIcon;
	private JLabel logoImg, backgroundImg, slogan;
	private JLabel monthlyPriceL, videoQualityL,resolutionL;
	private JLabel monthlyPriceBasicL, videoQualityBasicL,resolutionBasicL;
	private JLabel monthlyPriceStandartL, videoQualityStandartL,resolutionStandartL;
	private JLabel monthlyPricePremiumL, videoQualityPremiumL,resolutionPremiumL;
	private JLabel monthlyPriceFreeL, videoQualityFreeL,resolutionFreeL;
	private JButton freeB, basicB, standartB, premiumB;
	private JButton return2WelcomePage;
	
	private WelcomePage referenceToWelcomePage;
	
	private int x = 400;
	private int y = 450;
	private int labelFontSize = 35;
	private int height = 40;
	
	public SubscriptionPage() {
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
		
		//MONTHLY PRICE LABELS
		monthlyPriceL = new JLabel("Monthly Price");
		monthlyPriceL.setBounds(x, y, 1000, height);
		monthlyPriceL.setForeground(Color.WHITE);
		monthlyPriceL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		monthlyPriceFreeL = new JLabel("Free");
		monthlyPriceFreeL.setBounds(x+400, y, 200, height);
		monthlyPriceFreeL.setForeground(Color.WHITE);
		monthlyPriceFreeL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		monthlyPriceBasicL = new JLabel("24.99 TL");
		monthlyPriceBasicL.setBounds(x+600, y, 200, height);
		monthlyPriceBasicL.setForeground(Color.WHITE);
		monthlyPriceBasicL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		monthlyPriceStandartL = new JLabel("40.99 TL");
		monthlyPriceStandartL.setBounds(x+800, y, 200, height);
		monthlyPriceStandartL.setForeground(Color.WHITE);
		monthlyPriceStandartL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		monthlyPricePremiumL = new JLabel("54.99 TL");
		monthlyPricePremiumL.setBounds(x+1000, y, 200, height);
		monthlyPricePremiumL.setForeground(Color.WHITE);
		monthlyPricePremiumL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		//-------------------------------------------------------------------
		
		
		//VIDEO QUALITY LABELS
		
		videoQualityL = new JLabel("Video Quality");
		videoQualityL.setBounds(x, y+80, 1000, height);
		videoQualityL.setForeground(Color.WHITE);
		videoQualityL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		videoQualityFreeL = new JLabel("Good");
		videoQualityFreeL.setBounds(x+400, y+80, 1000, height);
		videoQualityFreeL.setForeground(Color.WHITE);
		videoQualityFreeL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		videoQualityBasicL = new JLabel("Good");
		videoQualityBasicL.setBounds(x+600, y+80, 1000, height);
		videoQualityBasicL.setForeground(Color.WHITE);
		videoQualityBasicL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		videoQualityStandartL = new JLabel("Better");
		videoQualityStandartL.setBounds(x+800, y+80, 1000, height);
		videoQualityStandartL.setForeground(Color.WHITE);
		videoQualityStandartL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		videoQualityPremiumL = new JLabel("Best");
		videoQualityPremiumL.setBounds(x+1000, y+80, 1000, height);
		videoQualityPremiumL.setForeground(Color.WHITE);
		videoQualityPremiumL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		//-------------------------------------------------------------------
		
		//RESOLUTION LABELS
		
		resolutionL = new JLabel("Resolution");
		resolutionL.setBounds(x, y+160, 1000, height);
		resolutionL.setForeground(Color.WHITE);
		resolutionL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		resolutionFreeL = new JLabel("720p");
		resolutionFreeL.setBounds(x+400, y+160, 1000, height);
		resolutionFreeL.setForeground(Color.WHITE);
		resolutionFreeL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		resolutionBasicL = new JLabel("720p");
		resolutionBasicL.setBounds(x+600, y+160, 1000, height);
		resolutionBasicL.setForeground(Color.WHITE);
		resolutionBasicL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		resolutionStandartL = new JLabel("1080p");
		resolutionStandartL.setBounds(x+800, y+160, 1000, height);
		resolutionStandartL.setForeground(Color.WHITE);
		resolutionStandartL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		
		resolutionPremiumL = new JLabel("4K+HDR");
		resolutionPremiumL.setBounds(x+1000, y+160, 1000, height);
		resolutionPremiumL.setForeground(Color.WHITE);
		resolutionPremiumL.setFont(new Font(Font.DIALOG, Font.BOLD, labelFontSize));
		//-------------------------------------------------------------------
		
		//BUTTONS
		freeB = new JButton("Free trial");
		freeB.setBounds(x+400,y+250,150,75);
		freeB.setBackground(Color.WHITE);
		freeB.setForeground(Color.RED);
		freeB.setBorder(null);
		freeB.setFocusPainted(false);
		freeB.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		
		basicB = new JButton("Basic");
		basicB.setBounds(x+600,y+250,150,75);
		basicB.setBackground(Color.RED);
		basicB.setForeground(Color.WHITE);
		basicB.setBorder(null);
		basicB.setFocusPainted(false);
		basicB.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		
		standartB = new JButton("Standart");
		standartB.setBounds(x+800,y+250,150,75);
		standartB.setBackground(Color.RED);
		standartB.setForeground(Color.WHITE);
		standartB.setBorder(null);
		standartB.setFocusPainted(false);
		standartB.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		
		premiumB = new JButton("Premium");
		premiumB.setBounds(x+1000,y+250,150,75);
		premiumB.setBackground(Color.RED);
		premiumB.setForeground(Color.WHITE);
		premiumB.setBorder(null);
		premiumB.setFocusPainted(false);
		premiumB.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		
		//Create return2WelcomePage Button
		return2WelcomePage = new JButton("\u2190");
		return2WelcomePage.setBounds(x,y-250,80,70);
		return2WelcomePage.setBackground(Color.BLACK);
		return2WelcomePage.setForeground(Color.WHITE);
		return2WelcomePage.setBorder(null);
		return2WelcomePage.setFocusPainted(false);
		return2WelcomePage.setFont(new Font(Font.DIALOG, Font.BOLD, 85));

		slogan = new JLabel("Choose the plan that's right for you");
		slogan.setBounds(x, y-150, 1000, 100);
		slogan.setForeground(Color.WHITE);
		slogan.setFont(new Font(Font.DIALOG, Font.BOLD, 40));
		
		//Set JFrame properties
		this.setTitle("Umutflix");
		this.setVisible(false);
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.add(return2WelcomePage);
		
		c.add(freeB);
		c.add(basicB);
		c.add(standartB);
		c.add(premiumB);
		
		c.add(resolutionL);
		c.add(resolutionFreeL);
		c.add(resolutionBasicL);
		c.add(resolutionStandartL);
		c.add(resolutionPremiumL);
		
		c.add(monthlyPriceL);
		c.add(monthlyPriceFreeL);
		c.add(monthlyPriceBasicL);
		c.add(monthlyPriceStandartL);
		c.add(monthlyPricePremiumL);
		
		c.add(videoQualityL);
		c.add(videoQualityFreeL);
		c.add(videoQualityBasicL);
		c.add(videoQualityStandartL);
		c.add(videoQualityPremiumL);
		
		c.add(resolutionL);
		c.add(slogan);
		c.add(logoImg);
		c.add(backgroundImg);
		
		return2WelcomePage.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == return2WelcomePage)
		{
			this.setVisible(false);
			referenceToWelcomePage.setVisible(true);
		}
	}
	
	public void establishReferenceToWelcomePage(WelcomePage w) {
		this.referenceToWelcomePage = w;
	}
	
}








//MEHMET UMUT ÝNCEER
