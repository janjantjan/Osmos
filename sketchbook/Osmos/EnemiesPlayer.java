import java.util.*;
public class EnemiesPlayer implements Players{
    private Random a = new Random();
    private double speed;
    private int radius;
    private int xcor;
    private int ycor;
    private boolean alive;
    private int section;
    private int increment;
    private int direction;
    private int xDir ;
    private int yDir ;
    private int red;
    private int green;
    private int blue;
    private int mainSize;
   
	

    public EnemiesPlayer(){
      mainSize = 20;
	speed = 2.5;//start at two decrease by 0.05
	radius = 10+a.nextInt(mainSize);
	xcor = a.nextInt(1600);//to be changed
	ycor = a.nextInt(800);//to be changed
	alive = true;
	section = 2;
increment = 0;
direction = 0;
 xDir = randDir();
     yDir = randDir();
     
     colorCheck();
     
    }
    
    public int getRed(){
      return red;
    }
    
    public int getGreen(){
      return green;
    }
    
    public int getBlue(){
      return blue;
    }
      
      public void setMainSize(int x){
        mainSize = x;}
    
    private void colorCheck(){
  if ( mainSize - 3 >= radius){
       red = 237;
       green = 203;
       blue = 29;
     }
     if ( mainSize >= radius){
       red = 237;
       green = 147;
       blue = 29;
     }
     else{
       red= 219;
       green = 2;
       blue = 9;
     }
}
    
    public void setX(int x){
      xcor = x;
    }
    public void setY(int y){
      ycor = y;
    }

    public int getSection(){
	return section;}
    
    public boolean isAlive(){
	return alive;}
    
    public int getX(){
	return xcor;
    }

    public int getY(){
	return ycor;
    }

    public int getRadius(){
	return radius;
    }

    public double getSpeed(){
	return speed;
    }

    public void eat(Players x){
	if (isBigger(x)){
	    double amount = x.getRadius();
	    radius += amount;
	    speed -= 0.05;}
	else{die();}
    }
	  


  public void moveTo(){
    increment ++;
    if (xcor <= 0){xDir = 1;}
    if (ycor <= 0){yDir = 1;}
    if (xcor >= 1800){xDir = -1;}
   if(ycor >= 1000){yDir = -1;}
  if (increment == 50){
    xDir = randDir();
    yDir = randDir();
    increment = 0 ;
  }
  else{ 
    moveTo(xcor+xDir, ycor+yDir);}
    
}
    public void moveTo (int x, int y){
if(x>xcor){
      xcor += speed;
    }
    else{
      if(x<xcor){
        xcor -= speed;
      }
    }
    if(y>ycor){
      ycor += speed;
    }
    else{
      if(y<ycor){
        ycor -= speed;
      }
    }

  if ((x<50) && (y<50)){
      section = 1;
  }
  else if ((x<100) && (y<50)){
      section = 2;
  }
  else if ((x<50) && (y<100)){
      section = 3;
  }
  else if ((x<100) && (y<100)){
      section = 4;
  }
  colorCheck();
    }

    public void die(){
	alive = false;
  xcor = -1000;
  ycor = -1000;
  radius = 10+a.nextInt(mainSize);
  
    }

    public boolean isBigger(Players x){
	double sizeup =  x.getRadius();
	if (sizeup < radius){ return true;}
	return false;
    }
    
  public boolean nearMe(Players x){
      if (x.getSection() == section){return true;}
	return false;
    }
      
  private int randDir() {
      int randomNum = 1;
      int randomVal = a.nextInt(2);
      int randomSign = a.nextInt(2);
      if (randomSign == 0){
        randomNum = randomVal * -1;
      return randomNum;}
        else{ return randomNum;}
  }
      

    
}