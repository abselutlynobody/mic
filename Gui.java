//package password;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui implements ActionListener, Runnable{
	JButton button = new JButton("Generate new Password");

	public void actionPerformed(ActionEvent e) {
	    System.out.println("lol");
		}

	public static void main(String[] args) {
		(new Thread(new Gui())).start();
	}
	
	public void run(){
		//Frame 
		int fram_width = 600;
		int fram_height = 400; 
		
		JFrame frame = new JFrame("Password generator");
		frame.setSize(fram_width, fram_height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);
		
		
		//Panel
		JPanel panel = new JPanel(null);
		frame.add(panel);
		
		//new Gui().button(panel, fram_width, fram_height);
	//}
		
		//public void button(JPanel panel, int fram_width, int fram_height){ 
		//Button
		int button_width = 200;
		int button_height = 100;
		JButton button = new JButton("Generate new password");
		
		button.setLocation(fram_width/2 - button_width/2, fram_height/2 - button_height/2);
		button.setSize(button_width, button_height);
		button.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//What the button does
				System.out.println("spam");
				password_generation();}
			
		}); 
		panel.add(button);
		}
	
	public static void password_generation() {
		String password = "";
//		String[] smallLetters;
		//tring[] largeLetters;
		//String[] numbers; 
		String smallLetters[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String largeLetters[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W" ,"X", "Y", "Z"};
		String numbers[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
		int i=0;
		while(i<=19){
			
		float symbole = new Random().nextFloat();
		System.out.println(symbole);
		
		//small letters 
		if(symbole>2.0/3.0){
			int choose = new Random().nextInt(25);
			password = password + smallLetters[choose];			
		}
		
		//large letters
		else if(symbole <= 2.0/3.0 && symbole >=1.0/3.0){
			int choose = new Random().nextInt(25);
			password = password + largeLetters[choose];
		}
		
		else if(symbole < 1.0/3.0){
			int choose = new Random().nextInt(9);
			password = password + numbers[choose];
			}
		
		i=i+1; 
		
		}
		System.out.println(password);
		
		//password frame
		//Variables
		
		int password_width = 300;
		int password_height = 300;
		
		//int label_sizeW = 200;
		//int label_sizeH = 200;
				
		
		JFrame frame = new JFrame("Password");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(password_width,password_height);
		frame.setVisible(true);
		
		//JPanel p = new JPanel();
		//p.setLayout(null);
		//frame.add(p);
		
		
		/*JLabel label = new JLabel(password);
		label.setVisible(true);
		label.setSize(label_sizeW,label_sizeH);
		label.setLocation(password_width/2-label_sizeW/2,password_height/2-label_sizeH/2);
		frame.add(label);
		*/
		
		JLabel password_Label = new JLabel(password ,JLabel.CENTER);
		frame.add(password_Label);
	}
	
	
		
}
	

