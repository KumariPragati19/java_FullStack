import java.util.*;
public class DoubleSixandSeven {
    public static Integer SixSeven(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==6&&(arr[i+1]==6||arr[i+1]==7)){
               count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(SixSeven(arr));

    }
    
}
