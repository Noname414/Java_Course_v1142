	//Name______________________________ Date_____________
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   public class Battleship extends JPanel
   {
      private JButton[][] board;
      private int[][] matrix;
      private int hits, torpedoes;
      private JLabel label;
      private JButton reset;
      public Battleship()
      {
         setLayout(new BorderLayout());
         hits = 0;
         torpedoes = 20;
      
         JPanel north = new JPanel();
         north.setLayout(new FlowLayout());
         add(north, BorderLayout.NORTH);
         label = new JLabel("Welcome to Battleship -- You have 20 torpedoes.");
         north.add(label);
      
         JPanel center = new JPanel();
         center.setLayout(new GridLayout(10,10));
         add(center, BorderLayout.CENTER);
      
         board = new JButton[10][10];
         matrix = new int[10][10];
         for(int r = 0; r < 10; r++)
            for(int c = 0; c < 10; c++)
            {
               board[r][c] = new JButton();
               board[r][c].setBackground(Color.blue);
               board[r][c].addActionListener( new Handler1(r, c) );
               center.add(board[r][c]);
            }
      
         reset = new JButton("Reset");
         reset.addActionListener( new Handler2() );
         reset.setEnabled(false);
         add(reset, BorderLayout.SOUTH);
      
         placeShip();
      }
      private void placeShip()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      private class Handler1 implements ActionListener
      {
         private int myRow, myCol;
         public Handler1(int r, int c)
         {
            myRow = r;
            myCol = c;
         }
         public void actionPerformed(ActionEvent e)
         {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
         }
      }
      private class Handler2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
         }
      }
   }