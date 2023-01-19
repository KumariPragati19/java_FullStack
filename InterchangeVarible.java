//interchange or replace two variable withou using third variable...
import java.util.*;

public class InterchangeVarible {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Inter two number want to interchange: ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
