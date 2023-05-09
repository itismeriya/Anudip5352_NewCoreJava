import java.util.*;
public class AreaCalculator {


  
   
    public static double area(int base,int height) {
 
       return (base * height) / 2;

    }

 
    public static double area(double width, double height) 
{
       
        return width * height;
    }

 
   public static void main(String[] args) {
  
      AreaCalculator ac = new AreaCalculator();


     System.out.println("Area of Triangle: " + ac.area(6.0, 4));


       System.out.println("Area of Rectangle: " + ac.area(5, 10));
    }
}