	//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.22.2003

   import java.io.*;
   public class MakeDataFile
   {
      public static void main(String[] args) throws Exception
      {
         System.setOut(new PrintStream(new FileOutputStream("data.txt")));
         int numitems = (int)(Math.random() * 25 + 50);
         System.out.println(numitems);
         for(int k = 0; k < numitems; k++)
         {
            System.out.println((int)(Math.random() * 100));
            System.out.println((int)(Math.random() * 16));
         }
      }
   }