import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;



public class Lab05 {
      public static void main(String[] args) {
		Display.openWorld("../maps/shuttle.map");
      Display.setSize(10,10);
      Display.setSpeed(9);
      Racer lisa = new Racer(1);
      Racer lisa1 = new Racer(4);
      Racer lisa2 = new Racer(7);
      lisa.move();
      lisa.jumpRight();
      lisa.shit(2,7);    
      lisa.shit(2,5); 
      lisa.shit(2,3);
      lisa.turnAround();
      lisa.run(6);
      lisa.jumpLeft();
      lisa.move();
      lisa.put(15);
      lisa.turnAround();
      lisa.move();
      lisa1.move();
      lisa1.jumpRight();
      lisa1.shit(2,7);    
      lisa1.shit(2,5); 
      lisa1.shit(2,3);
      lisa1.turnAround();
      lisa1.run(6);
      lisa1.jumpLeft();
      lisa1.move();
      lisa1.put(15);
      lisa1.turnAround();
      lisa1.move();
      lisa2.move();
      lisa2.jumpRight();
      lisa2.shit(2,7);    
      lisa2.shit(2,5); 
      lisa2.shit(2,3);
      lisa2.turnAround();
      lisa2.run(6);
      lisa2.jumpLeft();
      lisa2.move();
      lisa2.put(15);
      lisa2.turnAround();
      lisa2.move();  
      
      
      
	}

}
