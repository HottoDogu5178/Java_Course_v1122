import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public class Racer extends Athlete 
   {
     

       public Racer(int y)
      {
         super(1, y, Display.EAST,Display.INFINITY);
      }
      public void jumpRight(){
         
         turnLeft();
         move();
         turnRight();
         move();
         turnRight();
         move();
         turnLeft();
     
     
     } 
     public void jumpLeft(){
         turnRight();
         move();
         turnLeft();
         move();
         turnLeft();
         move();
         turnRight();     
     
     } 
     public void shit(int x,int y){
         run(x);
         pick(y);
     
     }
     public void run(int x){
      for(int i=0;i<x;i++)
         move();
     }
     public void pick(int x){
      for(int i=0;i<x;i++)
         pickBeeper();
     }
     public void put(int x){
      for(int i=0;i<x;i++)
         putBeeper();
     }
     




   
   
   
   
   }
