import java.util.*;

public class LastThreeUpperCase {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");  
        String a = sc.nextLine();
        StringBuffer b=new StringBuffer(a);
        if(a.length()>=3){
            for(int i=a.length()-3;i<a.length();i++){
                if(Character.isLowerCase(a.charAt(i))){
                    b.setCharAt(i, Character.toUpperCase(a.charAt(i)));
                }
    
            }
        }
        else if(a.length()<3){
            for(int i=0;i<a.length();i++){
                if(Character.isLowerCase(a.charAt(i))){
                    b.setCharAt(i, Character.toUpperCase(a.charAt(i)));
                }
    
            }

        }
            
        System.out.println(b);

    }
    
}
