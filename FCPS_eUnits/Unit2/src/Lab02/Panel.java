package Lab02;
   import java.awt.*;
   import javax.swing.*;
   public class Panel extends JPanel
   {
            public void paintComponent(Graphics g)
      {
      g.setColor(Color.RED);
      g.fillRect(0,0,400,400);
      g.setColor(Color.YELLOW);
      for(int i=75;i<275;i=i+20){
            for(int j=100;j<260;j=j+20){
            g.fillOval(j,i,20,20);
            }

      }
      

     ImageIcon thomas = new ImageIcon("../src/Lab02/tj.jpg");
       g.drawImage(thomas.getImage(), 110, 85, 143,182,null);          //original size
       g.setColor(Color.WHITE);
                g.setFont(new Font("ScanSerif",Font.ITALIC,30));
                         g.drawString("Our Fearless Leader",70,320);


                    }
   }