	//Name______________________________ Date_____________
   public class Dice
   {
      private int myOne, myTwo;
      public Dice()
      {
         myOne = random();
         myTwo = random();
      }
      public void roll()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public int total()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public boolean doubles()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public String toString()
      {
         return "{" + myOne + ", " + myTwo + "}";
      }
      private int random()
      {
         return (int)(Math.random() * 6 + 1);
      }
   }