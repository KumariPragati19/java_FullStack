import java.util.*;
public class AlarmTime {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the day sun=0 till sat=6: ");
        int n=sc.nextInt(); 
        boolean vacation = sc.nextBoolean();
        if((n>=1&&n<=5)&&(vacation==false)){
            System.out.println("7:00");
        }
        else if((n==0||n==6)&&(vacation==false)){
            System.out.println("10:00");
        }
        else if((n>=1&&n<=5)&&(vacation==true)){
            System.out.println("10:00");
        }
        else if((n==0|| n==6 )&&(vacation==true)){
            System.out.println("off");
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
