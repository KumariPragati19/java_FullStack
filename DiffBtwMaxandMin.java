import java.util.*;
import java.lang.Math;

public class DiffBtwMaxandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        int diff = (max - min);
        System.out.println("Maximum Value: " + max);
        System.out.println("Maximum Value: " + min);
        System.out.println("Diffence: " + diff);
    }

}
