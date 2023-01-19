//Take a String and find the count of each letter in the String(without repeat means case insesitive)
import java.util.*;
public class LetterCount {
   public static void main(String[] args){
    String a;
    String b;
    int count[] =new int[256];

    Scanner sc= new Scanner(System.in);

    System.out.print("Enter the string : ");

    a = sc.nextLine();
    b=a.toLowerCase();

    for(int i=0;i<b.length();i++){
        count[(int)b.charAt(i)]++;
    }
    for(int i=0;i<256;i++){
        if(count[i]!=0){
            System.out.println((char)i+"="+count[i]);
        }
    }

   } 
}
