import java.util.*;
public class Pattern5OneLoop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("how much long pattern do want?");
        double a = scan.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            int n;
            int temp;
            int m=count*10+1;
            temp=m;
            count=temp;
            n=i*count;
            System.out.println(n);
        }
        System.out.println();
        scan.close();

    }
    
}