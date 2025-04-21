package Lab09;
	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class TwistyTurtle3 extends Turtle
   {
   public TwistyTurtle3()
      {
         super();
      }
   public void drawShape()
      {
      for (int i = 25; i< 150; i+=5){
      forward(i);
      turnLeft(90);
      forward(i);
      turnLeft(90);
      forward(i);
      turnLeft(90);
      forward(i);
      turnLeft(90);
        turnLeft(45);}
                 /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
   }