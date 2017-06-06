import java.util.*;

public class EnemiesPlayer implements Players{

    private double speed;
    private double radius;
    private int xcor;
    private int ycor;
    private boolean alive;
    private int section;
	
    private static int randInt(int min, int max){
	int range = (max - min) + 1;     
	return (int)(Math.random() * range) + min;
    }

    
    public EnemiesPlayer(){
	speed = 2.5;//start at two decrease by 0.05
	radius = 10;
	
	xcor = randInt(5, 1595);
	ycor = randInt(5, 995);
	
	alive = true;
	section = 2;
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

    public double getRadius(){
	return radius;
    }

    public double getSpeed(){
	return speed;
    }

    public Players eat(Players x){
	if (isBigger(x)){
	    double amount = x.getRadius();
	    radius += amount;
	    speed -= 0.05;
	    return x;
	}
	else{die();
	    return x;}
    }
	
    public void moveTo (int x, int y){
	xcor = x;
	ycor = y;
	if ((x<=400) && (y<=500)){
	    section = 1;
	}
	else if ((x<=800) && (y<=500)){
	    section = 2;
	}
	else if ((x<=400) && (y<=1000)){
	    section = 3;
	}
	else if ((x<=1200) && (y<500)){
	    section = 4;
	}
	else if ((x<=1200) && (y<500)){
	    section = 5;
	}
	else if ((x<=1200) && (y<500)){
	    section = 6;
	}
	else if ((x<=1200) && (y<500)){
	    section = 7;
	}
	else { section = 8;}
    }
	
	


    public void die(){
	alive = false;
	xcor = -2000;
	ycor = -2000;

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
    

    

    
}
