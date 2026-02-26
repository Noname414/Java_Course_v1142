   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.14.2003

   import javax.swing.JFrame;
   public class Driver09
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Unit4, Lab09: Miniature Golf");
         frame.setSize(500, 150);
         frame.setLocation(150, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel09());
         frame.setVisible(true);
      }
   }