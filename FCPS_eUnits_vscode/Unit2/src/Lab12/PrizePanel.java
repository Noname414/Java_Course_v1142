   //Name:    Date:
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot pd;
      private Timer t; 
		//constructor   
       public PrizePanel()
      {
         
      }
       public void paintComponent(Graphics g)
      {
      
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
           
         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
        double d = distance(  /* 4 arguments */  );  
		
		  
      }
       private double distance(double x1, double y1, double x2, double y2)
      {
         return  	 // enter the calculation here.
      }
   }