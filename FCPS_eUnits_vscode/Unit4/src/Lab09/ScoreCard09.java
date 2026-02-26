	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class ScoreCard09 extends JPanel
   {
      private JTextField[] input;
      public ScoreCard09()
      {
         setLayout(new GridLayout(2, 18));
      
         for(int x = 1; x <= 18; x++)
         {
            add(new JLabel("" + x, SwingConstants.CENTER));
         }
      
         input = new JTextField[18];
         for(int x = 0; x < input.length; x++)
         {
            input[x] = new JTextField();
            add(input[x]);
         }
      }
      public void randomize()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public int findTotal()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public int findAces()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public int findHardestHole()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
   }