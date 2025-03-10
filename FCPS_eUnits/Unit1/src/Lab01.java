import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab01 {

	
	public static void main(String[] args) {
		Display.openWorld("../maps/school.map");
               Display.setSpeed(10);

		Robot a = new Robot();
      Robot b = new Robot(4,5,3,0);
      a.move();
      a.move();
      a.turnLeft();
      a.move();
      a.turnLeft();
      a.move();
      a.pickBeeper();
      a.turnLeft();
      a.turnLeft();
      a.move();
      a.turnLeft();
      a.turnLeft();
      a.turnLeft();
      a.move();
      a.turnLeft();
      a.move();
      a.move();
      a.move();
      a.turnLeft();
      a.move();
      a.move();
      a.move();
      a.turnLeft();
      a.move();
      a.move();
      a.turnLeft();
      a.turnLeft();
      a.turnLeft();
      a.move();
      a.putBeeper();
      b.pickBeeper();
      b.move();
      b.turnLeft();
      b.move();
      b.move();
      b.turnLeft();
      b.move();
      b.move();
      b.turnLeft();
      b.turnLeft();
      b.turnLeft();
      b.move();
      b.move();
      b.turnLeft();
      b.move();
      b.turnLeft();
      b.move();
      b.move();
      b.turnLeft();
      b.turnLeft();
      b.turnLeft();
      b.move();
      b.move();
      b.turnLeft();
      b.move();
      b.move();
      b.putBeeper();
      b.turnLeft();
      b.turnLeft();
      b.move();
	}

}
