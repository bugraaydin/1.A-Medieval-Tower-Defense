package Enemy;


import java.awt.image.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Enemy {
	
	private ImageIcon impactImageIcon;
	
	private boolean b = true;
	
	int second = 0;

	int frames = 0;
	
	public int targetCount = 0;
	public int locX; 
	public int locY;
	private int targetLocX;
	private int targetLocY;
	private int speed = 5;  // current speed
	private int[] velocity = new int[2];
	private int armor;  // current armor
	private int health;  // current hp
	private int debuffDPS; // from poison tower, taken per sec
	private int resourceGiven;
	private boolean isGettingHit = false;
	
	private int enemyImageNumber;
	public BufferedImage enemyImage;
	public String[] enemyImageBuffer;
	
	public boolean isAlive = true;
	
	public Enemy(int locX, int locY)
	{
		this.locX = locX;
		this.locY = locY;
		velocity[0] = 0;
		velocity[1] = 0;
		enemyImageBuffer = new String[18];
	}
	
	public void onDamageTaken(int dmg)
	{
		if(!isAlive)
			return;
		health = health - dmg;
		isGettingHit=true;
		if(health<1)
		{
			isAlive = false;
		}

	}
		
	
	public void move(int velocityX, int velocityY)
	{
		locX = locX + velocityX;
		locY = locY + velocityY;

	}
	
	public int getEnemyImageNumber(){
		return enemyImageNumber;
	}
	//////////Setters
	public void setEnemyImage(int i)
	{
			try {
				enemyImage = ImageIO.read(getClass().getResourceAsStream(enemyImageBuffer[i]));
				enemyImageNumber = i;
			}	catch(IOException exc) {
					exc.printStackTrace();
			}
	}

	public void setX(int x){

		this.locX = x;

	}

	public void setY(int y){

		this.locY = y;

	}

	public void setSpeed(int speed){

		this.speed = speed;

	}

	public void setArmor(int armor){

		this.armor = armor;

	}

	public void setHealth(int health){

		this.health = health;

	}

	public void setDebuffDPS(int debuffDPS){

		this.debuffDPS = debuffDPS;

	}

	public void setResourceGiven(int resourceGiven){

		this.resourceGiven = resourceGiven;

	}
	public void setVelocity(int i,int j){
		velocity[0] = i;
		velocity[1] = j;
	}

	//////////Getters

	public int getLocX(){

		return this.locX;

	}

	public int getLocY(){

		return this.locY;

	}

	public int getSpeed(){

		return this.speed;

	}

	public int getArmor(){

		return this.armor;

	}

	public int getHealth(){

		return this.health;

	}

	public int getDebuffDPS(){

		return this.debuffDPS;

	}

	public int getResourceGiven(){

		return this.resourceGiven;

	}
	
	public ImageIcon getImpactImageIcon()
	{
		return impactImageIcon;
	}
	
	public boolean isGettingHit()
	{
		return isGettingHit;
	}
	public int[] getVelocity(){
		return velocity;
	}
	////////////////////



	

}