import java.util.*;
public class ChocoBar {
    public static int smallBar(int small, int large, int goal){
        int sm = small;
        if (small+large == goal){
            return small;
        }
        else if (small+large < goal){
            return -1;
        }
        else if (large == goal){
            return 0;
        }
        else {
            while (sm+large != goal){
                sm--;
            }
            return sm;
        }
    }
    public static void main(String[] args) {
        int small ;
        int large;
        int goal;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of small balls: ");
        small=sc.nextInt();
        System.out.println("Enter the no of large balls: ");
        large =sc.nextInt();
        System.out.println("Enter the goal : ");
        goal=sc.nextInt();
        System.out.println(smallBar(small,large,goal));
    }
}

