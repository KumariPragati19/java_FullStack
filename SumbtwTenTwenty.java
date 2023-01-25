import java.util.*;
public class SumbtwTenTwenty {
    public static int Sum(int a, int b){
        int sum=a+b;
        if((a+b)<10||(a+b)>=20){
            return sum;
        }
        return 20;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b= sc.nextInt();
        System.out.println(Sum(a,b));
    }
    
}
