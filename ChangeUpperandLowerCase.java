import java.util.*;
public class ChangeUpperandLowerCase{
   public static void main(String[] args){
    String a;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the string : ");
    a = sc.nextLine();
    StringBuffer b=new StringBuffer(a);

    for(int i=0;i<a.length();i++){
        if(Character.isLowerCase(a.charAt(i))){
            b.setCharAt(i, Character.toUpperCase(a.charAt(i)));
        }
        else{
            b.setCharAt(i, Character.toLowerCase(a.charAt(i)));
        }
    }
    System.out.println(b);

   } 
}
