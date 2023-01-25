import java.util.*;
public class TwoThree {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++) {
            sum+=arr[i];
        }
        if(sum==4 || sum==6) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
