	//Name______________________________ Date_____________
   package final1;
   import java.awt.*;
   import javax.swing.JPanel;
   import java.awt.image.BufferedImage;
      import javax.swing.JOptionPane;

   public class Panel extends JPanel
   {
      	
      public void paintComponent(Graphics g)
      {
      g.setColor(Color.RED);
      g.fillRect(0,0,600,400);
g.setColor(Color.blue);
      g.fillRect(0,0,300,200);
      g.setColor(Color.white);
      g.fillOval(113,63,75,75);

      int xxPoints[] = {150, 129, 170};
int yyPoints[] = {175, 100, 100};
g.fillPolygon(xxPoints, yyPoints,3);
int xxPoints1[] = {112, 132, 167};
int yyPoints1[] = {164, 89, 110};
g.fillPolygon(xxPoints1, yyPoints1,3);
int xxPoints2[] = {85, 139, 160};
int yyPoints2[] = {137, 82, 117};
g.fillPolygon(xxPoints2, yyPoints2,3);
int xxPoints3[] = {75, 150, 150};
int yyPoints3[] = {100, 79, 120};
g.fillPolygon(xxPoints3, yyPoints3,3);
int xxPoints4[] = {85, 160, 139};
int yyPoints4[] = {62, 82, 117};
g.fillPolygon(xxPoints4, yyPoints4,3);
int xxPoints5[] = {112, 167, 132};
int yyPoints5[] = {35, 89, 110};
g.fillPolygon(xxPoints5, yyPoints5,3);
int xxPoints6[] = {150, 170, 129};
int yyPoints6[] = {25, 100, 100};
g.fillPolygon(xxPoints6, yyPoints6,3);
int xxPoints7[] = {187, 167, 132};
int yyPoints7[] = {35, 110, 89};
g.fillPolygon(xxPoints7, yyPoints7,3);
int xxPoints8[] = {214, 160, 139};
int yyPoints8[] = {62, 117, 82};
g.fillPolygon(xxPoints8, yyPoints8,3);
int xxPoints9[] = {225, 150, 150};
int yyPoints9[] = {100, 120, 79};
g.fillPolygon(xxPoints9, yyPoints9,3);
int xxPoints10[] = {214, 139, 160};
int yyPoints10[] = {137, 117, 82};
g.fillPolygon(xxPoints10, yyPoints10,3);
int xxPoints11[] = {187, 132, 167};
int yyPoints11[] = {164, 110, 89};
g.fillPolygon(xxPoints11, yyPoints11,3);
g.setColor(Color.blue);

 g.fillOval(108,58,85,85);
g.setColor(Color.white);

 g.fillOval(113,63,75,75);

      }
   }