MainPlayer main = new MainPlayer();
EnemiesPlayer[] enemies = new EnemiesPlayer[10];
ArrayList<EnemiesPlayer> sec1 = new ArrayList<EnemiesPlayer>();
ArrayList<EnemiesPlayer> sec2 = new ArrayList<EnemiesPlayer>();
ArrayList<EnemiesPlayer> sec3 = new ArrayList<EnemiesPlayer>();
ArrayList<EnemiesPlayer> sec4 = new ArrayList<EnemiesPlayer>();

void setup(){
  size(1600,800);
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
      sec1.clear();
      sec2.clear();
      sec3.clear();
      sec4.clear();
      for(EnemiesPlayer x: enemies){
        fill(255, 8, 8);
        //text(x.getSection()+ "",x.getX(),x.getY());
        if (x.getSection() == 1){
          sec1.add(x);
        }
        if(x.getSection() ==2){
          sec2.add(x);
        }
        if(x.getSection() == 3){
          sec3.add(x);
        }
        if(x.getSection() == 4){
          sec4.add(x);
        }
        if(x.getX() > main.getX()-main.getRadius()+5 && x.getX() < main.getX()+main.getRadius()-5 && x.getY() > main.getY()-main.getRadius()+5 && x.getY() < main.getY()+main.getRadius()-5){
      main.eat(x);
      x.eat(main);
        }
      //for(EnemiesPlayer y:enemies){
      //  if(x.getX() > y.getX()-y.getRadius() && x.getX() < y.getX()+y.getRadius() && x.getY() > y.getY()-y.getRadius() && x.getY() < y.getY()+y.getRadius()){
      //y.eat(x);
      //x.eat(y);
      //  }
        //textSize(15);
       //fill(255, 255, 255);
 // text("Current Radius: " + main.getRadius(), 1500, 50); 
    }
      
      for(int i = 0; i < sec1.size()-1; i++){
        for(int j = i + 1; j < sec1.size(); j++){
          if(sec1.get(i).getX() > sec1.get(j).getX()-(sec1.get(j).getRadius()/2) && sec1.get(i).getX() < sec1.get(j).getX()+(sec1.get(j).getRadius()/2) && sec1.get(i).getY() > sec1.get(j).getY()-(sec1.get(j).getRadius()/2) && sec1.get(i).getY() < sec1.get(j).getY()+(sec1.get(j).getRadius()/2)){
            sec1.get(i).eat(sec1.get(j));
            sec1.get(j).eat(sec1.get(i));
          }
        }
      }
      for(int i = 0; i < sec2.size()-1; i++){
        for(int j = i + 1; j < sec2.size(); j++){
          if(sec2.get(i).getX() > sec2.get(j).getX()-(sec2.get(j).getRadius()/2) && sec2.get(i).getX() < sec2.get(j).getX()+(sec2.get(j).getRadius()/2) && sec2.get(i).getY() > sec2.get(j).getY()-(sec2.get(j).getRadius()/2) && sec2.get(i).getY() < sec2.get(j).getY()+(sec2.get(j).getRadius()/2)){
            sec2.get(i).eat(sec2.get(j));
            sec2.get(j).eat(sec2.get(i));
          }
        }
      }
      for(int i = 0; i < sec3.size()-1; i++){
        for(int j = i + 1; j < sec3.size(); j++){
          if(sec3.get(i).getX() > sec3.get(j).getX()-(sec3.get(j).getRadius()/2) && sec3.get(i).getX() < sec3.get(j).getX()+(sec3.get(j).getRadius()/2) && sec3.get(i).getY() > sec3.get(j).getY()-(sec3.get(j).getRadius()/2) && sec3.get(i).getY() < sec3.get(j).getY()+(sec3.get(j).getRadius()/2)){
            sec3.get(i).eat(sec3.get(j));
            sec3.get(j).eat(sec3.get(i));
          }
        }
      }
      for(int i = 0; i < sec4.size()-1; i++){
        for(int j = i + 1; j < sec4.size(); j++){
          if(sec4.get(i).getX() > sec4.get(j).getX()-(sec4.get(j).getRadius()/2) && sec4.get(i).getX() < sec4.get(j).getX()+(sec4.get(j).getRadius()/2) && sec4.get(i).getY() > sec4.get(j).getY()-(sec4.get(j).getRadius()/2) && sec4.get(i).getY() < sec4.get(j).getY()+(sec4.get(j).getRadius()/2)){
            sec4.get(i).eat(sec4.get(j));
            sec4.get(j).eat(sec4.get(i));
          }
        }
      }
    
    if (!main.isAlive()){
        clear();
        textSize(150);
       
  text("GAME OVER", 350, 400); 
  fill(255, 8, 8);
  
      }
      
      if (main.getRadius() > 200){
        clear();
        textSize(150);
       
  text("You Win", 350, 400); 
  fill(255, 8, 8);
        
      
  }
      
      
}