import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("how much long pattern do want?");
        int a = scan.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
        System.out.println();
        }
        scan.close();

    }
    
}
