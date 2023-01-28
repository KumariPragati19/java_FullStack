import java.util.*;
public class SpeedandTicket {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("What is the speed : ");
        int speed=sc.nextInt(); 
        System.out.println("Is birthay:");
        boolean birthday = sc.nextBoolean();
        if(birthday==false){
            if(speed<=60){
                System.out.println("ticket: 0");
            }
            else if(speed>60 && speed<=80){
                System.out.println("ticket: 1");
             }
            else if(speed>80){
                System.out.println("ticket: 2");
            }
        }
        if(birthday==true){
            if(speed<=65){
                System.out.println("ticket: 0");
            }
            else if(speed>65 && speed<=85){
                System.out.println("ticket: 1");
             }
            else if(speed>85){
                System.out.println("ticket: 2");
            }
        }
    }
    
}
