import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;



public class Mid02 {

	
	public static void main(String[] args) {
		//String filename = JOptionPane.showInputDialog("What robot world?");
      
       Display.openWorld("../maps/M2.map");
                       Display.setSpeed(10);
                             Display.setSize(12,12);


		Thread s1 = new Thread( new M2Shifter(2));
      		Thread s2 = new Thread( new M2Robot());

s1.start();
s2.start();

	}

}
