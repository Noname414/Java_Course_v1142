   //Name______________________________ Date_____________
   import java.io.*;
    public class Driver05
   {
       public static void main(String[] args) throws Exception
      {
         System.setOut(new PrintStream(new FileOutputStream("output.txt")));
      
      //create the objects
         Circle c = new Circle(75);
         //Rectangle r = new Rectangle(30.0, 40.);    
         //Square s = new Square(50.0);			 	// remove the comment slashes 	
      	//Triangle t = new Triangle(37);          // when your classes are finished
      
      //test the instance methods
         System.out.println("Circle");
         System.out.println("------");
         System.out.println("Radius: " + c.getRadius());
         System.out.println("Area: " + c.findArea());
         System.out.println("Circumference: " + c.findCircumference());
         System.out.println();
      
         System.out.println("Rectangle");
         System.out.println("---------");
         System.out.println("Base: " + r.getBase());
         System.out.println("Height: " + r.getHeight());
         System.out.println("Area: " + r.findArea());
         System.out.println("Perimeter: " + r.findPerimeter());
         System.out.println("Diagonal: " + r.findDiagonal());
         System.out.println();
         
         System.out.println("Square");
         System.out.println("------");
         	/*****************************/
         	/*                           */
         	/* Test the Square class.    */
         	/*                           */
         	/*****************************/
         s.setSide(10.0);
         System.out.println("New side: " + s.getSide());
         System.out.println("New area: " + s.findArea());	
         System.out.println(); 
      
         System.out.println("Triangle");
         System.out.println("--------");
            /*****************************/
         	/*                           */
         	/* Test the Triangle class.  */
         	/*                           */
         	/*****************************/
         System.out.println();
      }
   }