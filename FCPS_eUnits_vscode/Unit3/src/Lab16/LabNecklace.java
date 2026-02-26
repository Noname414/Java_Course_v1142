   //Torbert, e-mail: smtorbert@fcps.edu
	//version 4.4.2003, version 3.26.2008 by mlbillington@fcps.edu

   import javax.swing.JOptionPane;
    public class LabNecklace
   {
      private static int first, second;
       public static void main(String[] args)
      {
         while(true)
         {
            first = Integer.parseInt(JOptionPane.showInputDialog(
                                      "First Digit? (-1 to quit)"));
            if(first == -1)
            {
               System.out.println("Bye-bye!");
               System.exit(0);
            }
            if(first < 0 || first > 9)
            {
               System.out.println("That's not a digit.");
               continue;
            }
            second = Integer.parseInt(JOptionPane.showInputDialog(
                                                 "Second Digit?"));
            while(second < 0 || second > 9)
            {
               System.out.println("That's not a digit.");
               second = Integer.parseInt(
                                   JOptionPane.showInputDialog(
                                                     "Second Digit?"));
            }
            necklace(first, second);
         }
      }
   	
       public static void necklace(int previous, int current)
      {
         int count = 0;
         System.out.print(first + " " + second);
         do
         {
            int temp = previous + current;
            previous = current;
            current = temp % 10;
            count++;
            System.out.print(" " + current);
         }  while(previous != first || current != second);
         System.out.println("\nIterations: " + count + "\n");
      }
   }