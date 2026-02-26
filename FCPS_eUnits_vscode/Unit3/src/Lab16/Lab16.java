   //Name______________________________ 
    public class Lab16
   {
       public static void main(String[] args)
      {
         int longestchain = 0;
         long numwithlongchain = 0;
      	
      	// check all numbers between 1 and 1000000.
      	// Every time we find a longer chain than
      	// we've found so far, store its info.
         for (int j = 1; j <= 5; j++)
         {
            int thischain = (int)calcchain(j);
            if(thischain > longestchain)
            {
               longestchain = thischain;
               numwithlongchain = j;
            }
         }
         System.out.print("Hailstone number " + numwithlongchain);  
         System.out.println(" produces a chain of " + longestchain);
      }
   	
   	 // calculates the length of any hailstone
   	 // number sequence starting with beginval
       private static long calcchain (int beginval)
      {
         int chainlength = 0;
         long hailstoneValue = beginval;
         while (hailstoneValue != 1)
         {
            chainlength++;
         
            if((chainlength % 2) == 0)
               hailstoneValue = hailstoneValue / 2;
            else hailstoneValue = 3 * hailstoneValue + 1;
         }
         return hailstoneValue;
      }   
   }