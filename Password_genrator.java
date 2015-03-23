//package password;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Password_genrator {

	public static void main(String[] args) {
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
		
		//Frame
		JFrame frame = new JFrame("Password");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		JPanel p = new JPanel(null);
		frame.add(p);
		
		
		JLabel label = new JLabel(password);
		frame.add(label);
		label.setVisible(true);
		label.setSize(10,10);
		label.setLocation(150,150);
	}
	
		
		
	}


