import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;




public class Lab11 {

	
	public static void main(String[] args) {
      
       Display.openDefaultWorld();
                       Display.setSpeed(10);
                                Display.setSize(42, 37);
new One(1,18).display();
new One(7,18).display();
new Two(13,18).display();
new Zero(19,18).display();
new Seven(25,18).display();
new One(31,18).display();
new Four(37,18).display();
new Zero(1,9).display();


		}
}
