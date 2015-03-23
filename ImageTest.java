import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ImageTest {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("image test");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000, 1000);
		f.setVisible(true);
		
		JPanel p = new JPanel(null);
		f.add(p);
		
		
		ImageIcon player = new ImageIcon("player.png");
		JLabel image = new JLabel(player);
		image.setLocation(0,0);
		image.setBounds(100, 100, 100, 100);
		image.setVisible(true);
		p.add(image);
	}

}
