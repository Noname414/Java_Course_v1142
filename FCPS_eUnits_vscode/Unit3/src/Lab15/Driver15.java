   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.4.2003

   import javax.swing.JFrame;
   public class Driver15
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Font Attributes");
         frame.setSize(640, 480);
         frame.setLocation(100, 50);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel15());
         frame.setVisible(true);
      }
   }