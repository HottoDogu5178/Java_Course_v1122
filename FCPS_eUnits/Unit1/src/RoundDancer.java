import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public class RoundDancer extends Dancer
   {
      

       public RoundDancer()
      {
         super(1, 1, Display.EAST,0);
      }
      public RoundDancer(int x,int y,int dir,int beep)
      {
         super(x, y, dir,beep);
      }
public void danceStep(){
turnLeft();
turnLeft();
turnLeft();
turnLeft();

}
     }