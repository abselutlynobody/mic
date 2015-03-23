package pong;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//private static Color BLACK = new Color(0, 0, 0, 150);


public class Pong implements KeyListener{
	//paddle variables
	public int dir_1 = 1;
	public int dir_2 = 1;
	public boolean move_1;
	public boolean move_2;
	
	Player p1 = new Player(0, 50, 0);
	Player p2 = new Player(0, 350, 0);
	
	//Ball variable
	Ball ball = new Ball(200,200);
	int dir_x = 1;
	int dir_y = 1;
	
	//Frame variables 
	private int frame_h = 600;
	private int frame_w = 600;

	public static void main(String[] args) {
		new Pong().gameLoop();;

	}
	public  void gameLoop(){
		boolean game = true;
		
		//Frame and canvas 
		JFrame f = new JFrame("pong");
		f.setSize(frame_h,frame_w);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		Canvas c = new Canvas();
		f.add(c);
		
		c.addKeyListener(this);
		
		//Background color
		Color BLACK = new Color(0,0,0,150);
		c.setBackground(BLACK);
		
		
		//Draw players

		
		//ball
		
		//main gameloop 
		while(game){
			if(p1.myScore()>=11 || p2.myScore()>=11){ //To see if one of the player has won/more than 10 points. 
				game = false;
			}
			
			//check for input 
			p1.move(p1,p2, move_1, move_2, dir_1, dir_2);
			
			
			//move ball
			ball.newBallX(dir_x);
			ball.newBallY(dir_y);
			//Detect coalition		
			
			
			
			
		}
	}
	
	
	/** detect if key is typed*/ 
	@Override
    public void keyTyped(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        	//p1.move(p1, true, 1);
        	move_1 = true;
        	dir_1 = 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
        	//p1.move(p1, true, 0);
        	move_1 = true;
        	dir_1 = 0;
        }
        if(e.getKeyCode() == KeyEvent.VK_W){
        	//p2.move(p2,true,1);
        	move_2 = true;
        	dir_2 = 1;
        }
        if(e.getKeyCode() == KeyEvent.VK_S){
        	//p2.move(p2, true, 0);
        	move_2 = true;
        	dir_2 = 0;
        }

    }
	
	/** Detect if key is pressed*/
    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        	//p1.move(p1, true, 1);
        	move_1 = true;
        	dir_1 = 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
        	//p1.move(p1, true, 0);
        	move_1 = true;
        	dir_1 = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_W){
        	//p2.move(p2,true,1);
        	move_2 = true;
        	dir_2 = 1;
        }
        if(e.getKeyCode() == KeyEvent.VK_S){
        	//p2.move(p2, true, 0);
        	move_2 = true;
        	dir_2 = 0;
        }
    }
    

    /** Detect if key is released */
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        	move_1 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
        	//dir = 0;
            //move = false;
        	move_1 = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_W){
        	move_2 = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_S){
        	move_2 = false;
        }
    }
		
		
	
	
	
	
	
	
	

}
