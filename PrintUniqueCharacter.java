import java.util.*;
public class PrintUniqueCharacter {
   public static void main(String[] args){
    String a;
    String b;
    int count[] =new int[256];

    Scanner sc= new Scanner(System.in);

    System.out.print("Enter the string : ");

    a = sc.nextLine();
    b=a.toLowerCase();

    for(int i=0;i<b.length();i++){
        count[b.charAt(i)]++;
    }
    for(int i=0;i<256;i++){
        if(count[i]==1){
            System.out.println((char)i);
        }
    }

   } 
}
