   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Scoreboard10 extends JPanel
   {
      private JLabel label1, label2, label3;
      private int total, max;
      public Scoreboard10()
      {
         setLayout(new GridLayout(1, 5));
         total = max = 0;
      
         add(new JLabel("Run: ", SwingConstants.RIGHT));
         label1 = new JLabel("0");
         label1.setHorizontalAlignment(SwingConstants.LEFT);
         add(label1);
         label2 = new JLabel("---");
         label2.setHorizontalAlignment(SwingConstants.CENTER);
         label2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
         add(label2);
         add(new JLabel("Max: ", SwingConstants.RIGHT));
         label3 = new JLabel("0");
         label3.setHorizontalAlignment(SwingConstants.LEFT);
         add(label3);
      }
      public void update(boolean arg) //arg is true means player guessed correct
      {
      
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      
      }
   }