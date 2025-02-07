
import java.util.Scanner;

public class Sum_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:");
        int n=sc.nextInt();
                int sum=sumofdigit(n);

        while(sum>9)
        {
            sum=sumofdigit(sum);
        }
        System.out.println(sum);
    }

    public static int sumofdigit(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;

        }
        return sum;
    }
}