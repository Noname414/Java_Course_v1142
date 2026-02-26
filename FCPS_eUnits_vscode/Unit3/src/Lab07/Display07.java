	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
    public class Display07 extends JPanel
   {
      private JLabel label;
      private JTextField box1, box2;
       public Display07()
      {
         setLayout(new FlowLayout());
         setPreferredSize(new Dimension(200, 125));
      
         JPanel subpanel = new JPanel();
         subpanel.setLayout(new FlowLayout());
         subpanel.add(new JLabel("One: "));
         box1 = new JTextField("", 5);
         box1.setHorizontalAlignment(SwingConstants.CENTER);
         subpanel.add(box1);
         subpanel.add(new JLabel("Two: "));
         box2 = new JTextField("", 5);
         box2.setHorizontalAlignment(SwingConstants.CENTER);
         subpanel.add(box2);
         add(subpanel);
      
         label = new JLabel("?");
         label.setFont(new Font("Serif", Font.BOLD, 75));
         label.setForeground(Color.blue);
         add(label);
      }
       public void showGCD()
      {
         int x = Integer.parseInt(box1.getText());
         int y = Integer.parseInt(box2.getText());
         int z = gcd(x, y);
         label.setText("" + z);
      }
       public void showLCM()
      {
         int x = Integer.parseInt(box1.getText());
         int y = Integer.parseInt(box2.getText());
         int z = x * y / gcd(x, y);
         label.setText("" + z);
      }
       private int gcd(int a, int b)
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
   }