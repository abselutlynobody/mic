package pong;


public class Player {
	
	private int score;
	private int y;
	private int x;
	private int movmentSpeed = 10;
	
	
	public int newY_1;
	public int newY_2;
	
	/** CONSTRUCTOR*/
	public Player(int score, int x, int y){
		y = this.y;
		x = this.x;
		score = this.score;
		
	}
	
	
	/** Return the player score */
	public int myScore(){
		return this.score;
	}
	
	/** Return the player Y*/
	public int myY(){
		return this.y;
	}
	
	/** Return the player X*/
	public int myX(){
		return x;
	}
	
	/** set player x */
	public void setX(int x){
		this.x = x;
	}

	/** set the player y*/ 
	public void setY(int y){
		this.y = y;
		
	}
	
	
	/** moves the paddle if the player inputs the button */
	public void move(Player p1, Player p2, boolean move_1, boolean move_2, int dir_1, int dir_2){	//dir is direction 0=up , 1=down
		if(move_1){
			if(dir_1 == 0){
				newY_1 = p1.myY() - movmentSpeed;
				System.out.println("up, w");
				}
			if(dir_1 == 1){
				newY_1 = p1.myY() + movmentSpeed;
				System.out.println("down, s");
				}
			p1.setY(newY_1);
			}
		
		
		if(move_2){
			if(dir_2 == 0){
				newY_2 = p2.myY() - movmentSpeed;
				System.out.println("up, arrow");
				}
			if(dir_2 == 1){
				newY_2 = p2.myY() + movmentSpeed;
				System.out.println("down, arrow");
				}
			p2.setY(newY_2);
			}
		}
	
	
}
