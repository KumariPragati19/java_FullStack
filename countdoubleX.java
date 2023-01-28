import java.util.*;
public class countdoubleX{
    public static Integer count(String a,char ch){
        int count=0;
        StringBuilder s = new StringBuilder(a);
        for (int i = 1; i < s.length()-1; i++) {
            if (s.charAt(i) == ch && s.charAt(i+1)==ch) {
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args){
        String a;
        char ch='x';
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        a=sc.nextLine();
        System.out.println(count(a, ch));
        

    }
    
}
