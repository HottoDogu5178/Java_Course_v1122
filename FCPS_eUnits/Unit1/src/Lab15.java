import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;




public class Lab15 {

	
	public static void main(String[] args) {
      
       Display.openDefaultWorld();
                       //Display.setSpeed(10);
                                Display.setSize(10, 10);
Dancer d1 = new RoundDancer(3,2,1,0);
Dancer d2 = new SwingDancer(3,5,1,0);
Dancer d3 = new OtherSwingDancer(3,8,1,0);
new Thread(d1).start();
new Thread(d2).start();
new Thread(d3).start();

		}
}
