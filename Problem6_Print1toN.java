import java.util.Scanner;
public class Problem6_Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}