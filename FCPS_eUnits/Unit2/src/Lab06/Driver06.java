package Lab06;
	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Driver06
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Square Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         
         Turtle.setCrawl(true);     //a class method
      
         SquareTurtle smidge = new SquareTurtle();
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         SquareTurtle smidg = new SquareTurtle(100,100,45,70);
         smidg.setColor(Color.RED);
         smidg.setThickness(8);
         smidg.drawShape();
SquareTurtle smid = new SquareTurtle(100);
         smid.setColor(Color.BLACK);
         smid.setThickness(3);
         smid.drawShape();
      for(int i=0;i<5;i++){
      SquareTurtle smi = new SquareTurtle(400,250,45,i*30);
         smi.setColor(Color.YELLOW);
         smi.setThickness(i);
         smi.drawShape();
      
      }
      }
   }