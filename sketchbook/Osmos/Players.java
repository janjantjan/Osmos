public interface Players{

    public Players eat (Players x);
    public void moveTo (int x, int y);
    public void die ();
    public int getX();
    public int getY();
    public double getRadius();
    public double getSpeed();
    public int getSection();
    public boolean isAlive();
    public boolean isBigger(Players x);
    
    
    

}
