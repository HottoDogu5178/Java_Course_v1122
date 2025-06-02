package final1;
import javax.swing.JFrame;
public class Driver{
public static void main(String[] arg){
JFrame frame = new JFrame("final1");
frame.setSize(600,400);
frame.setLocation(0,0);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(new Panel());
frame.setVisible(true);
}

}