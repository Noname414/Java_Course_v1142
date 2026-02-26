   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.14.2003

   import java.io.*;
   public class MakeDataFile
   {
      public static void main(String[] args) throws Exception
      {
         PrintStream outfile = new PrintStream(
                           new FileOutputStream("data.txt")
                           );
      
         int numitems = (int)(Math.random() * 5000 + 5000);
         outfile.println(numitems);
      
         for(int x = 0; x < numitems; x++)
            outfile.println(Math.random() * 1000);
      
         outfile.close();
      }
   }