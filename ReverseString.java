import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");  
        String a = sc.nextLine();
        String reverse="";
        for(int i=a.length()-1;i>=0;i--){
            reverse = reverse + a.charAt(i);

        }
        System.out.println(reverse);

    }
    
}
