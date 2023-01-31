import java.util.*;

public class MakeArrayContainTwoElement {
    static Integer firstlast(int arr[], int n) {
        int[] arr1 = new int[2];
        for (int i = 0; i < n; i++) {
            arr1[0] = arr[0];
            arr1[1] = arr[n - 1];
        }
        return arr1[1];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element of aaray: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(firstlast(arr, n));
        // System.out.println(arr[0] );
        // System.out.println(arr[n - 1]);
    }
}
