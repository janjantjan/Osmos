import java.util.*;
import java.lang.*;

public class Osmos{
    MainPlayer main = new MainPlayer();
    ArrayList<Players>  enemiesAry = new ArrayList<Players>();
    
    
    public void addAry(Players x){
	enemiesAry.add(x);
    }

    public void removeEnemy(Players x){
	enemiesAry.remove(x);
    }

}
    
