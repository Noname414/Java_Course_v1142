 	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Display05 extends JPanel
   {
      private JLabel label1, label2;
      private int value, total;
      public Display05()
      {
         setLayout(new GridLayout(3, 1));
         Font f = new Font("Serif", Font.BOLD, 30);
         total = value = 0;
      
         label1 = new JLabel("Value: 0");
         label1.setFont(f);
         label1.setForeground(Color.blue);
         add(label1);
      
         label2 = new JLabel("Total: 0");
         label2.setFont(f);
         label2.setForeground(Color.blue);
         add(label2);
      }
      public void update()
      {
      
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      
      }
   }