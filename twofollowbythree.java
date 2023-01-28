import java.util.*;
public class twofollowbythree {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array : ");
        int[] arr=new int[3];
        for (int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            if(arr[i]==2&&arr[i+1]==3){
                arr[i+1]=0;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
