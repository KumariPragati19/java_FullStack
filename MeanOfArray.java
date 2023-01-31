import java.util.*;
import java.lang.Math;

public class MeanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elemnts of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int total = (sum - (max + min)) / (n - 2);
        System.out.println(total);
    }
}
