import java.util.*;
// public class SumofNnumber{
//     static Integer sum(int n){
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum+=i;
//         }
//         return sum;

//     }
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n=sc.nextInt();
//         System.out.println(sum(n));
//     }
// }

//second method:
import java.util.*;
public class SumofNnumber{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt(); 
        int sum = ( n* (n+1) )/2;
        System.out.println(sum);
    }
}
