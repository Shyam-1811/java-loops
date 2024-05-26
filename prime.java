import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number");
       int n = sc.nextInt();
       int a = 0;
       for(int i = 2; i <= n-1; i++)
       {
         if (n%i == 0) {
            a = 1;
        break;
                       }
       }
       if (n ==1) {
        System.out.println("nothing");
       }
       else if (a == 0) {
        System.out.println("prime no");
       }
       else
        System.out.println("composite no");
       
       
    }     
}

