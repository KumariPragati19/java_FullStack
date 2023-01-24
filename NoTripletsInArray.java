import java.util.*;
public class NoTripletsInArray {
    public static boolean isTripple(int arr[]){
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==3){
                return true;
            }
        }
        return false;
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
        System.out.println(isTripple(arr));
    } 
}
