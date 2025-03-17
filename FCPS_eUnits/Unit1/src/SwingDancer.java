import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public class SwingDancer extends Dancer
   {
      

       public SwingDancer()
      {
         super(1, 1, Display.EAST,0);
      }
      public SwingDancer(int x,int y,int dir,int beep)
      {
         super(x, y, dir,beep);
      }
public void danceStep(){
turnLeft();
move();
turnLeft();
turnLeft();
move();
move();
turnLeft();
turnLeft();
move();
turnRight();
}
     }