	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
   import edu.fcps.Digit;
    public class Two extends Digit  implements Runnable, Workable {
      

       public Two(int x, int y)
      {
         super(x, y);
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
   	/*int temp1 = 0;
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
            segment1_On();
       segment2_On();
       segment3_Off();
       segment4_On();
       segment5_On();
       segment6_Off();
       segment7_On();

            }


       @Override
       public void display(){
       segment1_On();
       segment2_On();
       segment3_Off();
       segment4_On();
       segment5_On();
       segment6_Off();
       segment7_On();

       }
          }