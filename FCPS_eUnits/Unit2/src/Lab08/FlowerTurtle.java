package Lab08;
	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class FlowerTurtle extends Turtle
   {
      private double mySize;
      private Color myColor;
      public FlowerTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public FlowerTurtle(double x, double n, Color c)
      {
         super(x, 300.0, 90.0);
         mySize = n;
         myColor = c;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
      private void drawPetals() //starts and ends at center facing north
      {
      for (int i = 0; i< 15; i++){
      super.setColor(myColor);

      forward(mySize);
      turnLeft(180);
            forward(mySize*2);
                  turnLeft(180);
      forward(mySize);
      turnLeft(12);


        }
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
      private void drawStem() //starts at top of stem facing south, ends at bottom
      {
                  forward(mySize);
super.setColor(Color.GREEN);

            forward(mySize*1.5);
            turnLeft(180);
      forward(mySize*0.75);
           turnLeft(45);
      forward(mySize*0.5);
turnLeft(180);
      forward(mySize*0.5);
           turnLeft(90);
      forward(mySize);

         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
      public void drawShape()
      {
         drawPetals();
         drawStem();
      }
   }