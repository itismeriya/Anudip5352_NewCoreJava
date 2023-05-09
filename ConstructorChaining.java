import java.util.*;
class Car
 {
  
    private String model;
 
   private int year;

    private String color;


    Car( String model) 
{
  
      super();

        
        this.model = model;


    }

  
  Car( String model, int year)
 {
    
    this( model);
  
      this.year = year;

   
 }

   
 Car( String model, int year, String color) 
{
     
   this(model, year);
   
     this.color = color;
  
  }

  
  public Car()
 {
    }

   

    public String getModel()
 {
        return model;
    }

  
  public void setModel(String model)
 {
        this.model = model;
    }

   
 public int getYear() 
{
        return year;
    }

  
  public void setYear(int year)
 {
        this.year = year;
    }

  
  public String getColor() 
{
        return color;
    }

  
  public void setColor(String color)
 {
        this.color = color;
    }

   

 

}


public class ConstructorChaining
 {
    public static void main(String[] args) 
{
        
        Car car1=new Car("Honda", 2001,"silver");
  
      System.out.println("Model:"+car1.getModel()+" Year:"+car1.getYear()+ " Color:"+car1.getColor());
  
     
    }
}