import java.util.*;
public class nCrValue {
    static Integer Value(int n,int r){
        int num=1;
        int dr=1;
        int d=1;
        for(int i=1;i<=n;i++){
            num=num*i;
        }
        for(int i=1;i<=r;i++){
            dr=dr*i;
        }
        for(int i=1;i<=(n-r);i++){
            d=d*i;
        }
        return  (num/(dr*d));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r=sc.nextInt();
        System.out.println(Value(n,r));

    }
    
}
