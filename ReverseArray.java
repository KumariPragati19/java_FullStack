import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element want to enter: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {  
            arr[i]=sc.nextInt();  
        }  
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");   
        }
    }
    
}
