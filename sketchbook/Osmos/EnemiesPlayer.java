public class EnemiesPlayer{

    private int speed;
    private int size;
    private int xcor;
    private int ycor;

    public EnemiesPlayer(){
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

    public void eat(Player x){
	
	int amount = x.getSize();
	size += amount/2;
	speed -= amount/5;
    }
	
       


}
