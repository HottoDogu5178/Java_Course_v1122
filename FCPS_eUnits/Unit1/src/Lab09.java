import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;



public class Lab09 {

	
	public static void main(String[] args) {
		String filename = JOptionPane.showInputDialog("What robot world?");
      
       Display.openWorld("../maps/"+filename+".map");
                       Display.setSpeed(10);
int temp1 = 0;
int temp2 = 0;
		Robot a = new Robot();
      for(int i =0;i<8;i++){
      
      while(a.nextToABeeper()){
      a.pickBeeper();
      temp1++;
      
      }
      for(int j=0;j<temp2;j++){
      a.putBeeper();
      }
      temp2=temp1;
      temp1=0;
      a.move();
      }
      a.turnLeft();
      a.turnLeft();
            for(int i =0;i<8;i++){
            a.move();}
	}

}
