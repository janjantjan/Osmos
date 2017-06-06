
public class MainPlayer implements Players{

    private double speed;
    private double radius;
    private int xcor;
    private int ycor;
    private int section;
    // 1(400, 500) 2(800, 500) 3(1200, 500) 4(1600, 500)
    // 5(400, 1000) 6(400, 1000) 7(1200, 1000) 8(1600, 1000)
    private boolean alive;

    public MainPlayer(){
	speed = 2;
	radius = 20;
	xcor = 800;
	ycor = 500;
	alive = true;
	section = 2;
	
       }
    public int getSection(){
	return section;}
    
    public boolean isAlive(){
	return alive;}
    
    public int getX(){
	return xcor;}
    
    public int getY(){
	return ycor;}

    public double getRadius(){
	return radius;}
    
    public double getSpeed(){
	return speed;}

    public void eat(Players x){
	if (isBigger(x)){
	    double amount = x.getRadius();
	    radius += amount/2;
	    speed -= amount/5;}

	else{die();}
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
