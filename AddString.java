import java.util.*;
public class AddString{
    public static String add(String a){
        String b="";
        String c=a;
        if(a.length()>=2){
            b=a.charAt(0)+""+a.charAt(1)+c+a.charAt(0)+a.charAt(1);
            return b;
        }
        else if(a.length()<2){
            b=c+""+c+c;
            return b;
        }
        
        return b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String a=sc.nextLine();
        System.out.println(add(a));

    }
}