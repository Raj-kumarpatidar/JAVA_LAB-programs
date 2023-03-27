import java.util.Scanner;
public class week2_program8 {
    public static boolean isPalindrome(int num) {
        // Base case
        if (num < 10) {
            return true;
        }
        
        // Recursive case
        int lastDigit = num % 10;
        int remainingNum = num / 10;
        int reversedNum = reverse(remainingNum);
        
        return lastDigit == reversedNum % 10 && isPalindrome(remainingNum);
    }
    
    private static int reverse(int num) {
        // Base case
        if (num < 10) {
            return num;
        }
        
        // Recursive case
        int lastDigit = num % 10;
        int remainingNum = num / 10;
        int reversedNum = reverse(remainingNum);
        
        return lastDigit * (int)Math.pow(10, (int)Math.log10(remainingNum) + 1) + reversedNum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
      //  int num = 12321;
        boolean isPal = isPalindrome(num);
        if (isPal) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
