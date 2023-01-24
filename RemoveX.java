import java.util.*;
public class RemoveX {
    public static String removeX(String a,char ch){
        StringBuilder s = new StringBuilder(a);
        for (int i = 1; i < s.length()-1; i++) {
            if (s.charAt(i) == ch) {
                s.deleteCharAt(i);
                i--;
            }
        }
 
        return s.toString();

    }
    public static void main(String[] args){
        String a;
        char ch='x';
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        a=sc.nextLine();
        System.out.println(removeX(a, ch));
        

    }
    
}
