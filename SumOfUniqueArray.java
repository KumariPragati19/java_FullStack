import java.util.*;
public class SumOfUniqueArray{
	static void findNonRepeatingElement(int arr[]) {
	    boolean chk;
        int sum=0;
	    for(int i=0;i<arr.length;i++) {
	        chk = false;
	        for(int j=0;j<arr.length;j++) {
	            if(i != j && arr[i] == arr[j]) {
	                chk = true;
	                break;
	            }
	        }
	        if(!chk){
                //System.out.println(arr[i]+" ");
                sum+=arr[i];
            }
	    }
        System.out.println(sum);

        //return sum;
	}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array: ");
		int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
		//System.out.println("Non-repeating numbers are: ");
		findNonRepeatingElement(arr);
	}
}