	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public class Athlete extends Robot   {
      public Athlete()
      {
         super(1, 1, Display.NORTH,Display.INFINITY);
      }

       public Athlete(int x, int y, int dir, int beeps)
      {
         super(x, y, dir, beeps);
      }
     
       public void turnAround(){
         turnLeft();
         turnLeft();
       }
       public void turnRight(){
         turnLeft();
         turnLeft();
         turnLeft();
       }
   }