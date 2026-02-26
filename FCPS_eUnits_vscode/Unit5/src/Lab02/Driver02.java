	//Name______________________________ Date_____________
   import java.io.*;
    public class Driver02
   {
       public static void main(String[] args) throws Exception
      {
         double[] array = input("..\\Lab00\\data.txt");
         sort(array);
         output(array, "output.txt");
      }
       public static double[] input(String filename) throws Exception
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
       public static void sort(double[] array)
      {
         int maxPos;
         for(int k = 0; k < array.length; k++)
         {
            maxPos = findMax(array, array.length - k - 1);
            swap(array, maxPos, array.length - k - 1);
         }
      }
       public static int findMax(double[] array, int upper) //what does "upper" do???
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
       public static void swap(double[] array, int a, int b)//what are "a" and "b" for???
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
       public static void output(double[] array, String filename) throws Exception
      {
         System.setOut(new PrintStream(new FileOutputStream(filename)));
         for(int k = 0; k < array.length; k++)
            System.out.println(array[k]);
      }
   }