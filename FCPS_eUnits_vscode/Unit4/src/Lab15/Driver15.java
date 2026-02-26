//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
//version 4.5.2003

   import javax.swing.JFrame;
   public class Driver15
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Unit4, Lab15: TicTacToe");
         frame.setSize(300, 300);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().add(new Panel15());
         frame.setVisible(true);
      }
   }