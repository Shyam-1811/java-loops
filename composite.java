import java.util.Scanner;

public class composite{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number");
       int n = sc.nextInt();
       for(int i = 2; i <= n; i++){
        if (n % i == 0) {
            System.out.print("composit number");
            break;   
        }
    }
}
}
    
