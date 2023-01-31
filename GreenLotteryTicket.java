import java.util.*;

public class GreenLotteryTicket {
    static Integer result(int arr[]) {
        for (int i = 0; i < 3; i++) {
            if (arr[0] == arr[1] && arr[1] == arr[2]) {
                return 20;
            } else if (((arr[0] == arr[1]) || (arr[1] == arr[2])) || (arr[0] == arr[2])) {
                return 10;
            }
            // else {
            // return 0;
            // }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lottery ticket a, b ,c : ");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i = 0; i < 3; i++) {
        // if (arr[0] == arr[1] && arr[1] == arr[2]) {
        // System.out.println(20);
        // } else if (((arr[0] == arr[1]) || (arr[1] == arr[2])) || (arr[0] == arr[1]))
        // {
        // System.out.println(10);
        // } else {
        // System.out.println(0);
        // }
        // }
        System.out.println(result(arr));

    }

}
