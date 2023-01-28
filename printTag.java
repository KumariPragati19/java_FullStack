import java.util.*;
public class printTag {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the tag: ");
        String t=sc.nextLine();
        System.out.print("Enter content: ");
        String c=sc.nextLine();
        System.out.println("<"+t+">"+c+"</"+t+">");
    }
    
}
