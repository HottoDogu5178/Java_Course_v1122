import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public class Climber extends Athlete 
   {
      public Climber()
      {
         
      }

       public Climber(int x)
      {
         super(x, 1, Display.NORTH,1);
      }
      public void climbUpRight(){
         move();
         move();
         turnRight();
         move();
         turnLeft();
     
     
     } 
     public void climbUpLeft(){
         move();
         move();
         turnLeft();
         move();
         turnRight();
     
     
     } 
     public void climbDownLeft(){
         turnLeft();
         move();
         turnLeft();
         move();
         move();
         turnAround();     
     
     } 
     public void climbDownRight(){
         turnRight();
         move();
         turnRight();
         move();
         move();
         turnAround();     
     
     } 



   
   
   
   
   }
