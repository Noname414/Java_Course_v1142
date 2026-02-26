   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Display10 extends JPanel
   {
      private JLabel[] bits;
      public Display10()
      {
         setLayout(new GridLayout(1, 8));
         bits = new JLabel[8];
         for(int x = 0; x < bits.length; x++)
         {
            bits[x] = new JLabel("", SwingConstants.CENTER);
            bits[x].setFont(new Font("Serif", Font.BOLD, 50));
            add(bits[x]);
         }
         randomize();
      }
      public void randomize()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public void reverse()
      {
           	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public void shift()
      {
           	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public void rotate()
      {
           	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
   }