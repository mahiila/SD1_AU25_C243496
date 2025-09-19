import java.util.Scanner;
public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to search: ");
        int x = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == x) {
                found = true;
                break;
            }
        }
        if (found) System.out.println(x + " is found in the array.");
        else System.out.println(x + " is not in the array.");
    }
}