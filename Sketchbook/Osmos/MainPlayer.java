public class MainPlayer implements Players{

    private int speed;
    private int size;
    private int xcor;
    private int ycor;

       public MainPlayer(){
	speed = 9;
	
       }

    public int getX(){
	return xcor;
    }

    public int getY(){
	return ycor;
    }

    public int getSize(){
	return size;
    }

    public int getSpeed(){
	return speed;
    }

    public void eat(Players x){
	if (isBigger){
	    int amount = x.getSize();
	    size += amount/2;
	    speed -= amount/5;}

	else{die();}
    }
	
    public void moveTo (int x, int y){
	xcor = x;
	ycor = y;
    }

    public void die(){
    }

    public boolean isBigger(EnemiesPlayer x){
	int sizeup =  x.getSize();
	if (sizeup < size){ return true;}
	return false;
    }

    public boolean nearMe(){
	return false;
    }
    

    


}
