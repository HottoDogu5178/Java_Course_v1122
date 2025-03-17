import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;



public class Lab10 {

	
	public static void main(String[] args) {
		String filename = JOptionPane.showInputDialog("What robot world?");
      
       Display.openWorld("../maps/"+filename+".map");
                       Display.setSpeed(10);
                                Display.setSize(10, 10);


		Athlete a = new Athlete(1,1,1,0);
      while(a.nextToABeeper()==false){
         if(a.rightIsClear()){
         a.turnRight();
         }
         if(a.frontIsClear()){
         a.move();
         }
         else{
         a.turnLeft();
         
         }
      }
}
}
