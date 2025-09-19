import java.util.Scanner;
public class Problem9_Sum1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=N; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + N + " is: " + sum);
        sc.close();
    }
}