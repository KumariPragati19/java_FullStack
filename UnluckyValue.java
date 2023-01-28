import java.util.*;
public class UnluckyValue {
    static boolean Unlucky(int arr[],int n){
        for(int i=0;i<n;i++ ){
            if((arr[0]==1 && arr[1]==3)||(arr[1]==1 && arr[2]==3)){
                return true;
            }
            else if((arr[n-3]==1 && arr[n-2]==3)||(arr[n-2]==1 && arr[n-1]==3)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Unlucky(arr,n));

    }
    
}
