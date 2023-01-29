import java.util.*;
public class NoOfConsVowel {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String b=sc.nextLine();
        String a= b.toLowerCase();
        int sumofv=0;
        int sumofc=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                sumofv+=1;
            }
            else{
                sumofc+=1;
            }
        }
        System.out.println(sumofv);
        System.out.println(sumofc);

    }
    
}
