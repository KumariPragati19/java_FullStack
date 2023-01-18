import java.util.*;
public class ArrayMaxMinSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("number of elements: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elemnts of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        max(arr);
        min(arr);
        sum(arr);
    }  
    static void max(int a[]){ 
        int max=a[0];  
        for(int i=0;i<a.length;i++){
            if(a[i]>=max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
    static void min(int a[]){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<=min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
    static void sum(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
}