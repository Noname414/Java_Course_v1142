	 //Torbert, e-mail: smtorbert@fcps.edu
	 //version 7.22.2003

   import java.io.*;
   import java.text.DecimalFormat;
   import java.util.*;
    public class MakeDataFile
   {
       public static void main(String[] args) throws Exception
      {
         DecimalFormat d = new DecimalFormat("0.0");
         System.setOut(new PrintStream(new FileOutputStream("data.txt")));
         int numitems = (int)(Math.random() * 3000 + 3000);
         double[] nums = new double[numitems];
         for(int k = 0; k < numitems; k++)
            nums[k] = Math.random() * 10;
         Arrays.sort(nums);   
         System.out.println(numitems);
         for(int k = 0; k < numitems; k++)
            System.out.println(d.format(nums[k]));
      }
   }