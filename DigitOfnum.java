import java.util.Scanner;

public class DigitOfnum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number");
       int n = sc.nextInt();
       int count = 0;
       while (n != 0) {
        n = n/10;
        count+=1;
       }
       System.out.print(count);
}
}
