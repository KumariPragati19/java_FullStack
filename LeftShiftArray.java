import java.util.*;

public class LeftShiftArray {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element you want:");
        int m = sc.nextInt();
        int n;  
        System.out.print("how many digit want to do  left shift");
        n=sc.nextInt();
      
        int arr[] = new int[m];
        System.out.print("Enter the elements of array: ");

        for(int i=0; i<m; i++){  
               //reading array elements from the user   
            arr[i]=sc.nextInt();  
        }  
        for(int i=0;i<n;i++){
            int first,j;
            first=arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.println();
  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " "); 
        } 
    }
}