/**
 * week1_program6
 */


 // Fibonacci series using non-recursive functions
import java.util.Scanner;
public class week1_program6 {
   public static void main(String args[])
   {
    int terms,last=1,secondLast=0,current,i;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter number of terms in series to print");
    terms=sc.nextInt();
    for(i=0;i<terms;i++)
    {
        if(i<2)
        {
            current=i;

        }
        else{
            current=last+secondLast;
            secondLast=last;
            last=current;

        }
        System.out.print(current +" ");
    }
   }
    
}


//fibonacci series using recursive functions
/* 
import java.util.Scanner;
 
public class FibonacciSeriesRecursion {
    public static void main(String args[]) {
        int terms, i;
   
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of terms  in Fibonacci Series");
       terms = sc.nextInt();
 
       for(i = 0; i < terms; i++){
           System.out.print(fibonacci(i) + " ");
       }
    }
  
    public static int fibonacci(int num){
        // Exit condition of recursion
        if(num < 2)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
} */