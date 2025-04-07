import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;




public class Mid01 {

	
	public static void main(String[] args) {
      
       Display.openDefaultWorld();
                       Display.setSpeed(10);
                                Display.setSize(42, 37);
Thread d1 = new Thread(new Two(7,19));
Thread d2 = new Thread(new C(13,19));
Thread d3 = new Thread(new Three(19,19));
Thread d4 = new Thread(new Three(25,19));
//new Seven(25,18).display();
//new One(31,18).display();
//new Four(37,18).display();
Thread d5 = new Thread(new Zero(7,9));
Thread d6 = new Thread(new FourReverse(13,9));
Thread d7 = new Thread(new Dash(19,9));
d1.start();
d2.start();
d3.start();
d4.start();
d5.start();
d6.start();
d7.start();



		}
}
