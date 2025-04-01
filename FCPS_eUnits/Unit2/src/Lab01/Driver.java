package Lab01;
import javax.swing.JFrame;
public class Driver{
public static void main(String[] arg){
JFrame frame = new JFrame("Lab01");
frame.setSize(400,400);
frame.setLocation(0,0);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(new Panel());
frame.setVisible(true);
}

}