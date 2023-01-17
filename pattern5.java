import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("how much long pattern do want?");
        int a = scan.nextInt();
        for(int i=a;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(i+" ");
            }
        System.out.println();
        }
        scan.close();

    }
    
}
