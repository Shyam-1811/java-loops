import java.util.Scanner;

public class sumofdigit {
      public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number : ");
       int n = sc.nextInt();
       int sum = 0;
       while (n!=0) {
        int rem = n % 10;
        n = n/10;
        sum = sum + rem;
       }
       System.out.println("sum is : " +sum);
}
}
