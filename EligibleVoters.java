import java.util.Scanner;
public class EligibleVoters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the ages of the people:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter minimum voting age: ");
        int X = sc.nextInt();

        int eligibleCount = 0;
        for (int age : A) {
            if (age >= X) eligibleCount++;
        }
        System.out.println("Number of eligible voters: " + eligibleCount);
    }
}