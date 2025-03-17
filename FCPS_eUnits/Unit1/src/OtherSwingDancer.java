import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public class OtherSwingDancer extends Dancer
   {
      

       public OtherSwingDancer()
      {
         super(1, 1, Display.EAST,0);
      }
      public OtherSwingDancer(int x,int y,int dir,int beep)
      {
         super(x, y, dir,beep);
      }
public void danceStep(){
move();
turnLeft();
turnLeft();
move();
move();
turnLeft();
turnLeft();
move();
turnAround();
}
     }