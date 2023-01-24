import java.util.*;
public class ArrayinIncreasing {
    public static boolean isIncreasing(int arr[]){
        if(arr.length==1||arr.length==0){
            return true;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        n= sc.nextInt();
        System.out.println("Enter the elements of the array: "); 
        int[] arr=new int[n];
        for (int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isIncreasing(arr));
    }
    
}
