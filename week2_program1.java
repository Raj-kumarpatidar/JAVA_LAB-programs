import java.util.Scanner;  
//  to check the datatype of the variable  
public class week2_program1 {  
    
    public static void main(String args[]) {  
             
        int intData;  
        char charData;  
          
        
        Scanner sc = new Scanner(System.in);  
          
       
        System.out.println("Enter a String value:");  
        String str = sc.nextLine();  
          
        System.out.println("Enter Integer value:");  
        intData = sc.nextInt();  
          
        System.out.println("Enter Character value:");  
        charData = sc.next().charAt(0);  
          

        // show datatypes of variables by using getClass() and getSimpleName() methods  
        System.out.println(intData + " is of type " + ((Object)intData).getClass().getSimpleName());  
        System.out.println(charData + " is of type " + ((Object)charData).getClass().getSimpleName());  
        System.out.println(str + " is of type " + str.getClass().getSimpleName());  
    }  
}  