public class Rectangle
{
    //define members
   private double length ;
   private double breadth;
   //constructor for creating rectangle objects 
   //default constructor set length and breadth to 0
   public Rectangle (){
    this.length=0;
    this.breadth=0;
   }
   //parameterized constructor takes two arguments to initialize the length and breadth
   public Rectangle (double length,double breadth)
   {
    this.length=length;
    this.breadth=breadth;

   }
   //getter method for accessing data members
   public double getLength(){
    return length;
   }
   public double getBreadth(){
    return breadth;
   }
   // setter method for modifying  data members
   public void setLength(double length){
    this.length=length;
   }
   public void setBreadth(double breadth){
    this.breadth=breadth;
   }
   public double area(){
    return length*breadth;
   }

}

public class week3program1
{
    public static void main(String args[]){
        Rectangle rect=new Rectangle(5,3);
        double ares=rect.area();
        System.out.println("Area of rectangle :"+area);
    }
}
