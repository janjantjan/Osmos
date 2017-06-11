MainPlayer main = new MainPlayer();
EnemiesPlayer[] enemies = new EnemiesPlayer[10];


void setup(){
  fullScreen();
  background(0);
  stroke(219,2,9);
  fill(219,2,9);
  for(int i = 0; i < enemies.length; i++){
    enemies[i] = new EnemiesPlayer();
    ellipse(enemies[i].getX(),enemies[i].getY(),enemies[i].getRadius(),enemies[i].getRadius());
  }
}
void draw(){
  
  
  stroke(141,54,167);
  fill(141,54,167);
  background(0);
  
  ellipse(main.getX(),main.getY(),main.getRadius(),main.getRadius());
  main.moveTo(mouseX,mouseY);

    
     
        for(int i = 0; i < enemies.length; i++){
    enemies[i].setMainSize(main.getRadius());
       stroke(enemies[i].getRed(),enemies[i].getGreen(),enemies[i].getBlue());
        fill(enemies[i].getRed(),enemies[i].getGreen(),enemies[i].getBlue());
    ellipse(enemies[i].getX(),enemies[i].getY(),enemies[i].getRadius(),enemies[i].getRadius());
        
          enemies[i].moveTo();
      }
      for(EnemiesPlayer x: enemies){
        if(x.getX() > main.getX()-main.getRadius()+5 && x.getX() < main.getX()+main.getRadius()-5 && x.getY() > main.getY()-main.getRadius()+5 && x.getY() < main.getY()+main.getRadius()-5){
      main.eat(x);
      x.eat(main);
        //textSize(15);
       //fill(255, 255, 255);
 // text("Current Radius: " + main.getRadius(), 1500, 50); 
    }
    
    
    if (!main.isAlive()){
        clear();
        textSize(150);
       
  text("GAME OVER", 500, 500); 
  fill(255, 8, 8);
  
      }
      
      if (main.getRadius() == 50){
        clear();
        textSize(150);
       
  text("You Win", 500, 500); 
  fill(255, 8, 8);
        
      
  }
      }
      
  
}