package pong;

//Yes, this actually works. Could be used as standard

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestKeyInput implements KeyListener {
	
	public TestKeyInput(){
		
		JFrame f = new JFrame();
		
		f.setSize(200,200);
		f.setVisible(true);
		
		JPanel p = new JPanel();
		f.add(p);
		
		p.addKeyListener(this);
		p.setFocusable(true);
	}
	
	public static void main(String[] args){
		new TestKeyInput();
		
	}
	
	@Override
    public void keyTyped(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key typed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key typed");
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key pressed");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Released");
        }
    }

	
}
