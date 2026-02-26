   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class ScoreCard13 extends JPanel
   {
      private JTextField[][] input;
      public ScoreCard13()
      {
         setLayout(new GridLayout(5, 18));
      
         for(int x = 1; x <= 18; x++)
         {
            add(new JLabel("" + x, SwingConstants.CENTER));
         }
      
         input = new JTextField[4][18];
         for(int x = 0; x < input.length; x++)
            for(int y = 0; y < input[0].length; y++)
            {
               input[x][y] = new JTextField();
               add(input[x][y]);
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
      public int findTotal(int x)
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public int findAces(int x)
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public int findHardestHole(int x)
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