   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.14.2003

   import javax.swing.JFrame;
   public class BattleshipDriver
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Unit4, Project: Battleship!");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Battleship());
         frame.setVisible(true);
      }
   }