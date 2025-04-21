	package Lab07;
   //Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
      
         PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
      PolygonTurtle smidg = new PolygonTurtle(100.0, 4);
         smidg.setColor(Color.BLUE);
         smidg.setThickness(6);
         smidg.drawShape();
      
PolygonTurtle smid = new PolygonTurtle(100.0, 5);
         smid.setColor(Color.BLUE);
         smid.setThickness(6);
         smid.drawShape();
      
PolygonTurtle smi = new PolygonTurtle(100.0, 6);
         smi.setColor(Color.BLUE);
         smi.setThickness(6);
         smi.drawShape();
      

         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
   }