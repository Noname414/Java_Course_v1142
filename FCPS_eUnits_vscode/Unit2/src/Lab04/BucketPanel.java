   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

   import edu.fcps.Bucket;
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class BucketPanel extends JPanel
   {
      public BucketPanel()
      {
         Timer t = new Timer(10, new Listener());
         t.start();
      }
      public void paintComponent(Graphics g)
      {
         g.drawImage(Bucket.getImage(), 0, 0, getWidth(), getHeight(), null);
      }
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            repaint();
         }
      }
   }