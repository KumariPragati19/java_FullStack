import java.util.*;
public class ConcateString {
    public static String Concat(String a1,String a2){
        String b="";
        int n=0;
        if(a1.length()>a2.length()){
            n=a1.length()-a2.length();
            for(int i=n;i<a1.length();i++){
                b+=a1.charAt(i);
            }
            b=b+a2;
            return b;
        }
        if(a1.length()<a2.length()){
            n=a2.length()-a1.length();
            for(int i=n;i<a2.length();i++){
                b+=a2.charAt(i);
            }
            b=a1+b;
            return b;
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string");
        String a1=sc.nextLine();
        System.out.println("Enter the second string: ");
        String a2=sc.nextLine();
        System.out.println(Concat(a1,a2));
    }
        
}
