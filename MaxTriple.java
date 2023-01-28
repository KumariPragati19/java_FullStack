import java.util.*;
public class MaxTriple {
    static Integer MaxTri(int arr[],int n){
        int a=arr[0];
        for(int i=0;i<n;i++){
            int m=(i+(n-1))/2;
            if((arr[i]>=arr[m])&&(arr[i]>=arr[n-1])){
                a=arr[i];
                return a;
            }
            else if((arr[m]>=arr[i])&&(arr[m]>=arr[n-1])){
                a=arr[m];
                return a;
            }
            else if((arr[n-1]>arr[m])&&(arr[n-1]>arr[i])){
                a=arr[n-1];
                return a;
            }
        }
        return a;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(MaxTri(arr,n));
    }
    
}
