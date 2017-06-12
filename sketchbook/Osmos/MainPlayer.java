import java.util.*;

public class MainPlayer implements Players{

    private double speed;
    private int radius;
    private int xcor;
    private int ycor;
    private int section;
    // 1(400, 500) 2(800, 500) 3(1200, 500) 4(1600, 500)
    // 5(400, 1000) 6(400, 1000) 7(1200, 1000) 8(1600, 1000)
    private boolean alive;
    private int increment;
    public ArrayList<EnemiesPlayer> newEnemies = new ArrayList<EnemiesPlayer>();

    public MainPlayer(){
	speed = 2;
	radius = 20;
	xcor = 800;
	ycor = 500;
	alive = true;
	section = 2;
increment = 0;
	
       }
    public int getSection(){
	return section;}
    
    public boolean isAlive(){
	return alive;}

    public ArrayList<EnemiesPlayer> getList(){
      return newEnemies;
    }
    
    public int getX(){
	return xcor;}
    
    public int getY(){
	return ycor;}

    public int getRadius(){
	return radius;}
    
    public double getSpeed(){
	return speed;}

    public void eat(Players x){
	if (isBigger(x)){
	    double amount = x.getRadius();
	    radius += amount/2;
	    speed -= speed*.02;}

	else{die();}
    }
	
      public void moveTo (int x, int y){//fix later
      int newX;
      int newY;
      
      
      if(x>xcor){
        xcor += speed;
        newX = xcor - radius;
    }
    else{
      if(x<xcor){
        xcor -= speed;
        newX = xcor + radius;
      }
      else{
        newX = xcor;
      }
    }
    if(y>ycor){
      ycor += speed;
      newY = ycor - radius;
    }
    else{
      if(y<ycor){
        ycor -= speed;
        newY = ycor + radius;
      }
      else{
        newY = ycor;
      }
    }
    if (radius >= 20){
        increment++;
      if (increment == 100){
        int part = radius/20;
      radius-= part;
      

    increment = 0;
    speed += speed*.019;
    //int slow = 0;
    //if(slow < 10){
    //  if(slow == 1){
    EnemiesPlayer a = new EnemiesPlayer(newX,newY);
      a.setRadius(radius/20);
      newEnemies.add(a);
      //}
      //slow++;
 
//    //else{
      //slow = 0;
    }
//      }
        }
    
	if ((x<800) && (y<400)){
	    section = 1;
	}
	else if ((x<1600) && (y<400)){
	    section = 2;
	}
	else if ((x<800) && (y<800)){
	    section = 3;
	}
	else if ((x<1600) && (y<800)){
	    section = 4;
	}
	

    }

    public void die(){
	alive = false;
  xcor = -1000;
  ycor = -1000;
    }

    public boolean isBigger(Players x){
	double sizeup =  x.getRadius();
	if (sizeup < radius){ return true;}
	return false;
    }

    public boolean nearMe(EnemiesPlayer x){
	if (x.getSection() == section){return true;}
	return false;
    }
    

    


}