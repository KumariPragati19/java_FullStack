import java.util.*;
public class monkeyindicate {
    public  static boolean smile(String aSmile,String bSmile){
        if((aSmile.equals("true") && bSmile.equals("true"))||(aSmile.equals("false") && bSmile.equals("false"))){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String  aSmile=sc.nextLine();
        String  bSmile=sc.nextLine();
        System.out.println(smile(aSmile,bSmile));
    }
}
