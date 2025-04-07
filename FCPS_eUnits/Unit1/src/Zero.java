
   import edu.fcps.Digit;
    public class Zero extends Digit  implements Runnable, Workable  {
      

       public Zero(int x, int y)
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
       segment3_On();
       segment4_On();
       segment5_On();
       segment6_On();
       segment7_Off();

            }


      @Override
       public void display(){
       segment1_On();
              segment2_On();
       segment3_On();
       segment4_On();
       segment5_On();
       segment6_On();
       segment7_Off();

       }
          }