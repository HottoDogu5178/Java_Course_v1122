	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
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
   	int temp1 = 0;
      int temp2 = 0;
      for(int i =0;i<8;i++){
      
      while(nextToABeeper()){
      pickBeeper();
      temp1++;
      
      }
      for(int j=0;j<temp2;j++){
      putBeeper();
      }
      temp2=temp1;
      temp1=0;
      move();
      }
      /*turnLeft();
      turnLeft();
            for(int i =0;i<8;i++){
            move();}*/
            }

   }