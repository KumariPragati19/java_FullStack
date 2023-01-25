import java.util.*;
public class CountOfSubstring {
    public static int Count(String a1,String a2){
        int count=0;
        int c=0;
        for(int i=0;i<a1.length()-1;i++){
            if(a1.charAt(i)==a2.charAt(i)&&a1.charAt(i+1)==a2.charAt(i+1)){
               count++;
            }
            c=count;
            //return count;
        }
        return c;
    }
    public static void main(String[] java){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string1: ");  
        String a1 = sc.nextLine();
        System.out.print("Enter a string2: ");
        String a2=sc.nextLine();
        System.out.println(Count(a1,a2));
    }


    
}
