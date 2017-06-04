public class EnemiesPlayer implements Players{

    private double speed;
    private double size;
    private int xcor;
    private int ycor;
    private boolean alive;
    private int section;
	

    public EnemiesPlayer(){
	speed = 2.5;//start at two decrease by 0.05
	size = .5;
	xcor = 50;//to be changed
	ycor = 50;//to be changed
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

    public double getSize(){
	return size;
    }

    public double getSpeed(){
	return speed;
    }

    public void eat(Players x){
	if (isBigger(x)){
	    double amount = x.getSize();
	    size += amount;
	    speed -= 0.05;}
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
    
  public boolean nearMe(Players x){
      if (x.getSection() == section){return true;}
	return false;
    }
    

    

    
}
