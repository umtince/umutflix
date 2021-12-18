import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class UserPanel extends JFrame implements ActionListener{

	private JLabel backgroundImg, logoImg;
	private ImageIcon bgIcon, logoIcon;
	private String[] streamQuality = {"720p30FPS","720p30FPS","1080p60FPS","4K+HDR60FPS"};
	private JLabel movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8;
	private ImageIcon movie;
	private PlainJButton bmovie1, bmovie2, bmovie3, bmovie4, bmovie5, bmovie6, bmovie7, bmovie8;
	private JButton logOut;
	private SignInPage referenceToSignInPage;
	private Container c;
	private int qualitySelector;
	
	private int x = 90;
	private int y = 180;
	private int w = 120;
	private int h = 200;
	private int gap = 220;
	
	public UserPanel() {
		c = getContentPane();
		c.setLayout(null);
		
		bgIcon = new ImageIcon("src\\black_bg.png");
		backgroundImg = new JLabel("",bgIcon,JLabel.CENTER);
		backgroundImg.setBounds(0,0,1920,1080);
		
		logoIcon = new ImageIcon("src\\logo.png");
		logoImg = new JLabel("",logoIcon,JLabel.CENTER);
		logoImg.setBounds(0, 30, 300, 65);
		
		logOut = new JButton("Log Out");
		logOut.setBounds(400,30,180,70);
		logOut.setBackground(Color.RED);
		logOut.setForeground(Color.WHITE);
		logOut.setBorder(null);
		logOut.setFocusPainted(false);
		logOut.setFont(new Font(Font.DIALOG, Font.BOLD, 35));
		
		
		movie = new ImageIcon("src\\beyaz.png");
		
		movie1 = new JLabel("",movie,JLabel.CENTER);
		movie1.setBounds(x, y, w, h);
		bmovie1 = new PlainJButton("");
		bmovie1.setBounds(x, y, w, h);
		
		
		movie2 = new JLabel("",movie,JLabel.CENTER);
		movie2.setBounds(x+gap, y, w, h);
		bmovie2 = new PlainJButton("");
		bmovie2.setBounds(x+gap, y, w, h);
		
		
		movie3 = new JLabel("",movie,JLabel.CENTER);
		movie3.setBounds(x+gap*2, y, w, h);
		bmovie3 = new PlainJButton("");
		bmovie3.setBounds(x+gap*2, y, w, h);
		
		
		movie4 = new JLabel("",movie,JLabel.CENTER);
		movie4.setBounds(x+gap*3, y, w, h);
		bmovie4 = new PlainJButton("");
		bmovie4.setBounds(x+gap*3, y, w, h);
		
		
		movie5 = new JLabel("",movie,JLabel.CENTER);
		movie5.setBounds(x+gap*4, y, w, h);
		bmovie5 = new PlainJButton("");
		bmovie5.setBounds(x+gap*4, y, w, h);
		
		
		movie6 = new JLabel("",movie,JLabel.CENTER);
		movie6.setBounds(x+gap*5, y, w, h);
		bmovie6 = new PlainJButton("");
		bmovie6.setBounds(x+gap*5, y, w, h);
		
		
		movie7 = new JLabel("",movie,JLabel.CENTER);
		movie7.setBounds(x+gap*6, y, w, h);
		bmovie7 = new PlainJButton("");
		bmovie7.setBounds(x+gap*6, y, w, h);
		
		
		movie8 = new JLabel("",movie,JLabel.CENTER);
		movie8.setBounds(x+gap*7, y, w, h);
		bmovie8 = new PlainJButton("");
		bmovie8.setBounds(x+gap*7, y, w, h);
		
		
		
		this.setTitle("Umutflix");
		this.setVisible(false); //daha sonra kapat
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.add(movie1);
		c.add(movie2);
		c.add(movie3);
		c.add(movie4);
		c.add(movie5);
		c.add(movie6);
		c.add(movie7);
		c.add(movie8);
		
		c.add(bmovie1);
		c.add(bmovie2);
		c.add(bmovie3);
		c.add(bmovie4);
		c.add(bmovie5);
		c.add(bmovie6);
		c.add(bmovie7);
		c.add(bmovie8);
		
		c.add(logOut);
		c.add(logoImg);
		c.add(backgroundImg);
		
		bmovie1.addActionListener(this);
		bmovie2.addActionListener(this);
		bmovie3.addActionListener(this);
		bmovie4.addActionListener(this);
		bmovie5.addActionListener(this);
		bmovie6.addActionListener(this);
		bmovie7.addActionListener(this);
		bmovie8.addActionListener(this);
		
		logOut.addActionListener(this);
		
	}
	
	/*public UserPanel(int qualitySelector)
	{
		this();
		if(qualitySelector == 0) {
			c.add(movie1);
			c.add(movie2);
			c.add(movie3);
			c.add(movie4);
			
			c.add(bmovie1);
			c.add(bmovie2);
			c.add(bmovie3);
			c.add(bmovie4);
		}
		else if(qualitySelector == 1 || qualitySelector == 2 || qualitySelector == 3) {
			c.add(movie1);
			c.add(movie2);
			c.add(movie3);
			c.add(movie4);
			c.add(movie5);
			c.add(movie6);
			c.add(movie7);
			c.add(movie8);
			
			c.add(bmovie1);
			c.add(bmovie2);
			c.add(bmovie3);
			c.add(bmovie4);
			c.add(bmovie5);
			c.add(bmovie6);
			c.add(bmovie7);
			c.add(bmovie8);
		}
		
	}*/
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bmovie1) {
			playVideo(qualitySelector);
		}
		else if(e.getSource() == bmovie2) {
			playVideo(qualitySelector);
		}
		else if(e.getSource() == bmovie3) {
			playVideo(qualitySelector);	
		}
		else if(e.getSource() == bmovie4) {
			playVideo(qualitySelector);
		}
		else if(e.getSource() == bmovie5) {
			playVideo(qualitySelector);
		}
		else if(e.getSource() == bmovie6) {
			playVideo(qualitySelector);
		}
		else if(e.getSource() == bmovie7) {
			playVideo(qualitySelector);
		}
		else if(e.getSource() == bmovie8) {
			playVideo(qualitySelector);
		}
		else if(e.getSource() == logOut) {
			this.setVisible(false);
			referenceToSignInPage.setVisible(true);
		}
		
			
	}
	
	public void establishReferenceToSignInPage(SignInPage si) {
		this.referenceToSignInPage = si;
	}
	
	public void qualitySelector(String subscriptionModel) {
		if(subscriptionModel.equals("free")) {
			qualitySelector = 0;
		}
		else if(subscriptionModel.equals("basic")) {
			qualitySelector = 1;
		}
		else if(subscriptionModel.equals("standard")) {
			qualitySelector = 2;
		}
		else if(subscriptionModel.equals("premium")) {
			qualitySelector = 3;
		}
		
		changeUserPanelComponents(qualitySelector);
	}
	
	private void playVideo(int qualitySelector) {
		switch(qualitySelector) {
		case 0:
			JOptionPane.showMessageDialog(null, "Video Quality: " + streamQuality[0]);
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Video Quality: " + streamQuality[1]);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Video Quality: " + streamQuality[2]);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Video Quality: " + streamQuality[3]);
			break;
		}
	}
	
	private void changeUserPanelComponents(int qualitySelector) {
		if(qualitySelector == 0) {
			c.remove(movie8);
			c.remove(bmovie8);
			
			c.remove(movie7);
			c.remove(bmovie7);
			
			c.remove(movie6);
			c.remove(bmovie6);
			
			c.remove(movie5);
			c.remove(bmovie5);
		}
	}
}

class PlainJButton extends JButton {

    public PlainJButton (String text){
        super(text);
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
    } 
}

