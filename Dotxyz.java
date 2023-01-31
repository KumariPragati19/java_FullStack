import java.util.*;

public class Dotxyz {
    static boolean xyz(String a) {
        for (int i = 0; i < a.length() - 3; i++) {
            if (a.charAt(i) == '.' && a.charAt(i + 1) == 'x' && a.charAt(i + 2) == 'y' && a.charAt(i + 3) == 'z') {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array; ");
        String a = sc.nextLine();
        System.out.println(xyz(a));

    }

}
