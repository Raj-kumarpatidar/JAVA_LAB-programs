/**
 * week1_program4
 */

import java.util.Scanner;
public class week1_program4 {
    public static void main(String args[]){

    
    Scanner sc=new Scanner(System.in);
   System.out.println("number");
    int num=sc.nextInt();
   
 
     int j,i ,counter;
    for( j=2;j<=num;j++){
        counter=0;
        for( i=1;i<=j;i++){
           if(j%i==0){
              counter++;
           }
        }
        if(counter==2)
        System.out.print(j+" ");
     }


}
}