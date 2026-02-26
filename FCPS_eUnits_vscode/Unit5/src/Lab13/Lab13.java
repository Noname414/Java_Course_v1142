//Name: _______________________  Date: ______________

   import javax.swing.JOptionPane;
    public class Lab13
   {
       public static void main(String[] args)
      {
         int number = Integer.parseInt(JOptionPane.showInputDialog("How many disks?"));
         tower(1, 3, 2, number);
         System.exit(0);
      }
      
       public static void tower(int start, int finish, int helper, int number)
      {
         /***************************/ 
      	/*                         */
         /* Your code goes here.    */
         /*                         */
         /***************************/
      }
   }
	/**********************************
      Sample run, n = 3					Sample run, n = 4
    Move disk 1 from 1 to 3.    	Move disk 1 from 1 to 2.
 	 Move disk 2 from 1 to 2.   	Move disk 2 from 1 to 3.
    Move disk 1 from 3 to 2.   	Move disk 1 from 2 to 3.
	 Move disk 3 from 1 to 3.     Move disk 3 from 1 to 2.
	 Move disk 1 from 2 to 1.		Move disk 1 from 3 to 1.
    Move disk 2 from 2 to 3.    	Move disk 2 from 3 to 2.
	 Move disk 1 from 1 to 3. 		Move disk 1 from 1 to 2.
	 										Move disk 4 from 1 to 3. 
											Move disk 1 from 2 to 3.
											Move disk 2 from 2 to 1.
											Move disk 1 from 3 to 1.
   										Move disk 3 from 2 to 3.
   										Move disk 1 from 1 to 2.
   										Move disk 2 from 1 to 3.
 											Move disk 1 from 2 to 3.
   									
    ******************************/