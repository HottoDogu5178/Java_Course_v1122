package Lab09;
	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver09
   {
      public static void main(String[] args)
      {
      JFrame frame = new JFrame("Flower Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         //Turtle.clear(Color.WHITE);

TwistyTurtle smidge = new TwistyTurtle();
         smidge.setColor(Color.BLUE);
         smidge.setThickness(3);
         smidge.drawShape();
         TwistyTurtle2 smidg = new TwistyTurtle2();
         smidg.setColor(Color.RED);
         smidg.setThickness(3);
         smidg.drawShape();
         TwistyTurtle3 smid = new TwistyTurtle3();
         smid.setColor(Color.YELLOW);
         smid.setThickness(3);
         smid.drawShape();
      	/************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
   }