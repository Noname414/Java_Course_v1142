   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.14.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel13 extends JPanel
   {
      ScoreCard13 scorecard;
      JLabel output;
      JLabel[] array;
      public Panel13()
      {
         setLayout(new BorderLayout());
      
         output = new JLabel("------", SwingConstants.CENTER);
         add(output, BorderLayout.NORTH);
      
         JPanel east = new JPanel();
         east.setLayout(new GridLayout(5, 1));
         east.add(new JLabel(""));
         array = new JLabel[4];
         for(int x = 0; x < 4; x++)
         {
            array[x] = new JLabel("------", SwingConstants.CENTER);
            east.add(array[x]);
         }
         add(east, BorderLayout.EAST);
      
         JPanel west = new JPanel();
         west.setLayout(new GridLayout(5, 1));
         west.add(new JLabel(""));
         west.add(new JLabel("Player 1"));
         west.add(new JLabel("Player 2"));
         west.add(new JLabel("Player 3"));
         west.add(new JLabel("Player 4"));
         add(west, BorderLayout.WEST);
      
         scorecard = new ScoreCard13();
         add(scorecard, BorderLayout.CENTER);
      
         JPanel panel = new JPanel();
         panel.setLayout(new FlowLayout());
         addButton(panel, "Randomize", new Listener1());
         addButton(panel, "Total Score", new Listener2());
         addButton(panel, "Holes in One", new Listener3());
         addButton(panel, "Hardest Hole", new Listener4());
         add(panel, BorderLayout.SOUTH);
      }
      private void addButton(JPanel p, String s, ActionListener a)
      {
         JButton b = new JButton(s);
         b.addActionListener(a);
         p.add(b);
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            scorecard.randomize();
            output.setText("------");
            for(int x = 0; x < 4; x++)
               array[x].setText("------");
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            int[] temp = new int[4];
            for(int x = 0; x < 4; x++)
            {
               temp[x] = scorecard.findTotal(x);
               array[x].setText("Total Score: " + temp[x]);
            }
            int min = 0;
            for(int x = 1; x < 4; x++)
               if(temp[x] < temp[min])
                  min = x;
            output.setText("Player " + (min+1) + " wins!");
         }
      }
      private class Listener3 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            int total = 0, temp;
            for(int x = 0; x < 4; x++)
            {
               temp = scorecard.findAces(x);
               array[x].setText("Holes in One: " + temp);
               total = total + temp;
            }
            output.setText("Total holes in one: " + total);
         }
      }
      private class Listener4 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            for(int x = 0; x < 4; x++)
               array[x].setText("Hardest Hole: " + scorecard.findHardestHole(x));
            output.setText("Hardest Hole for All: " + scorecard.findHardestHole());
         }
      }
   }