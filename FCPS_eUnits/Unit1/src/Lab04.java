import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;



public class Lab04 {
      public static void go(Athlete arg){
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
      
      }
      public static void main(String[] args) {
		Display.openWorld("../maps/arena.map");
      Display.setSize(10,10);
               Display.setSpeed(10);

		Athlete coach = new Athlete(2,7,Display.EAST,0);
      Athlete p1 = new Athlete();
      Athlete p2 = new Athlete();
      Athlete p3 = new Athlete();
      Athlete p4 = new Athlete();
      Athlete p5 = new Athlete();
      Athlete p6 = new Athlete();

      go(p2);
      p2.move();
      p2.move();
      p2.move();
      p2.turnLeft();
      p2.move();
      p2.move();
      p2.turnAround();
      go(p1);
      p1.move();
      p1.move();
      p1.move();
      p1.move();
      p1.move();
      p1.turnLeft();
      p1.move();
      p1.turnAround();
      go(p3);
      p3.move();
      p3.move();
      p3.move();
      p3.move();
      p3.turnRight();
      go(p4);
      p4.move();
      p4.move();
      p4.move();
      p4.turnRight();
      go(p5);
      p5.move();
      p5.move();
      p5.turnRight();
      go(p6);
      p6.move();
      p6.turnLeft();
      p6.move();
      p6.turnAround();
      
      
      
      
	}

}
