import java.util.Scanner;

public class palindrome {
    
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number : ");
       int n = sc.nextInt();
       int s = n;
       int check = 0;
       while (n!=0) {
         int r = n % 10;
         check = check *10 + r;
         n = n / 10;
       }
       if (check == s) {
        System.out.println("palindrome no.");
       }
       else{
        System.out.println("not a palindrome no.");
       }
       }
      }

       
