import java.awt.Canvas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AnimationTest {
	public int x; 
	public int y;

	public static void main(String[] args) {
		animationLoop();

	}
	
	/** constructor*/ 
	public AnimationTest(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/** */
	
	/** The method that is going to chaing the animaton */ 
	private static void update(JFrame f, Canvas c, int i){
		
		/*ImageIcon clear = new ImageIcon("clear.png");
		JLabel c = new JLabel(clear);
		c.setBounds(x_pos, y_pos, 100, 100);
		c.setVisible(true);
		p.add(c);
		*/
		
		ImageIcon player = new ImageIcon("player.png");
		JLabel image = new JLabel(player);
		image.setBounds(i, i, 100, 100);
		image.setVisible(true);
		//c.add(image);			
		
	}
	
	/** The method where the animation happen*/
	public static void animationLoop(){
		int i = 1;

		
		//Frame n' shit
		JFrame f = new JFrame("Animation test");
		f.setSize(1000, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		Canvas c = new Canvas();
		f.add(c);
	
		try{
			
		
		while("pigs"!="fly"){
			
			//update the frame
			update(f, c, i);
			Thread.sleep(500);
			
			System.out.println(i);
			i=i+10;
			
			}
		
		}catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		
		
	}
	
	
	
}
