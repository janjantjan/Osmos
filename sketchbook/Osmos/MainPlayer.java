public class MainPlayer implements Players{

    private double speed;
    private double size;
    private int xcor;
    private int ycor;
    private int section;
    private boolean alive;

    public MainPlayer(){
	speed = 2;
	size = 1;
	xcor = 50;
	ycor = 50;
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

    public double getSize(){
	return size;}
    
    public double getSpeed(){
	return speed;}

    public void eat(Players x){
	if (isBigger(x)){
	    double amount = x.getSize();
	    size += amount/2;
	    speed -= amount/5;}

	else{die();}
    }
	
    public void moveTo (int x, int y){
	xcor = x;
	ycor = y;
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
	
    }

    public void die(){
	alive = false;
    }

    public boolean isBigger(Players x){
	double sizeup =  x.getSize();
	if (sizeup < size){ return true;}
	return false;
    }

    public boolean nearMe(EnemiesPlayer x){
	if (x.getSection() == section){return true;}
	return false;
    }
    

    


}
