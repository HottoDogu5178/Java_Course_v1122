	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class M2Robot extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public M2Robot()
      {
         super(8, 8, Display.SOUTH, 0);
      
      }
      @Override
      public void workCorner()
      {
            
      }
      @Override
      public void moveOneBlock()
      {
      }
      @Override
      public void turnToTheRight()
      {
            }
      @Override
      public void turnToTheNorth()
      {
      }
      @Override
      public void run(){
   	for(int i = 0;i<4;i++){
         	for(int j = 0;j<4;j++){
            move();
            }
turnLeft();
      }
}
}