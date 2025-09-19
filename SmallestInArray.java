import java.util.Scanner;
public class SmallestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }

        System.out.println("Smallest number: " + min);
    }
}