import java.util.*;
import java.lang.*;

public class Osmos{
    MainPlayer main = new MainPlayer();
    ArrayList<EnemiesPlayer>  enemiesAry = new ArrayList<EnemiesPlayer>();
    
    
    public void addEnemy(){
	EnemiesPlayer x = new EnemiesPlayer();
	enemiesAry.add(x);
    }

    public void removeEnemy(EnemiesPlayer x){
	enemiesAry.remove(x);
    }

}
    
