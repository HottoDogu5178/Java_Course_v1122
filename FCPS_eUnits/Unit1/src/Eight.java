	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
   import edu.fcps.Digit;
    public class Eight extends Digit   {
      

       public Eight(int x, int y)
      {
         super(x, y);
      }
       @Override
       public void display(){
       segment1_On();
       segment2_On();
       segment3_On();
       segment4_On();
       segment5_On();
       segment6_On();
       segment7_On();

       }
          }