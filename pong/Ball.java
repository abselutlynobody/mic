package pong;

public class Ball {
	
	private int x;
	private int y;
	
	private int speed = 10;
	
	
	/** CONSTRUCTOR*/
	public Ball(int x, int y){
		x = this.x;
		y = this.y;
	}
	
	
	/** return ball x */ 
	public int myX(){
		return this.x;
	}
	
	
	/** Return ball Y*/
	public int myY(){
		return this.y;
	}
	
	
	/** set ball x*/
	public void setX(int x){
		this.x = x;
	}
	
	
	/** Set ball y*/
	public void setY(int y){
		this.y = y;
	}
	
	
	/** Calculate the new position of the ball */
	public void newBallX(int dir_x){	//0 = up and 1 = down
		if(dir_x==0){
			this.setX(this.myX()-speed);
		}
		if(dir_x==1){
			this.setX(this.myX()+speed);
		}
	}
	
	
	public void newBallY(int dir_y){	//0 = left and 1 = right
		if(dir_y == 0){
			this.setY(this.myY()-speed);
		}
		if(dir_y == 1){
			this.setY(this.myY()+speed);
		}
	}
	
	
}
