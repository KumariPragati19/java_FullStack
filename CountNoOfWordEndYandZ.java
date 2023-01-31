import java.util.*;

public class CountNoOfWordEndYandZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String a = sc.nextLine();
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < a.length() - 1; i++) {
            if ((a.charAt(i) == 'y' || a.charAt(i) == 'z') && (a.charAt(i + 1) == ' ')) {
                count = count + 1;
            }
        }
        if (a.charAt(a.length() - 1) == 'y' || a.charAt(a.length() - 1) == 'z') {
            count1 = count1 + 1;
        }
        System.out.println(count + count1);
    }

}
