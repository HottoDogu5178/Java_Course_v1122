import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;



public class Mid03 {

	
	public static void main(String[] args) {
		//String filename = JOptionPane.showInputDialog("What robot world?");
      
       Display.openWorld("../maps/mop.map");
                       Display.setSpeed(10);
                          //   Display.setSize(12,12);

		Athlete a = new Athlete(8,1,2,Display.INFINITY);
for(int i = 0;i<5;i++){
		while(a.frontIsClear()){
      a.putBeeper();
      a.move();
      }
      a.putBeeper();
      a.turnAround();
      while(!a.leftIsClear() && a.frontIsClear()){
      a.move();
      }
      a.turnLeft();
      a.move();
      a.turnLeft();
      while(a.frontIsClear()){
      a.move();
      }
      a.turnAround();
      while(a.frontIsClear()){
      a.putBeeper();
      a.move();
      }
      a.putBeeper();
      a.turnAround();
      if(i==4){
      break;
      }
      while(!a.rightIsClear() && a.frontIsClear()){
      a.move();
      }
      a.turnRight();
      a.move();
      a.turnRight();
      while(a.frontIsClear()){
      a.move();
      }
      a.turnAround();
      }
      for(int i = 0;i<5;i++){
		while(a.frontIsClear()){
      a.pickBeeper();
      a.move();
      }
      a.pickBeeper();
      a.turnAround();
      while(!a.rightIsClear() && a.frontIsClear()){
      a.move();
      }
      a.turnRight();
      a.move();
      a.turnRight();
      while(a.frontIsClear()){
      a.move();
      }
      a.turnAround();
      while(a.frontIsClear()){
      a.pickBeeper();
      a.move();
      }
      a.pickBeeper();
      a.turnAround();
      if(i==4){
      break;
      }
      while(!a.leftIsClear() && a.frontIsClear()){
      a.move();
      }
      a.turnLeft();
      a.move();
      a.turnLeft();
      while(a.frontIsClear()){
      a.move();
      }
      a.turnAround();
      }
	}

}
