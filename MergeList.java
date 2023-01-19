//Write a program of merge two list....
import java.io.*;
import java.util.*;
public class MergeList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of list1: ");
        int n= sc.nextInt();
        System.out.println("Enter some numbers.");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list1.add(sc.nextInt());
        }
        System.out.println("Enter the length of list2: ");
        int m= sc.nextInt();
        System.out.println("Enter some numbers.");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            list2.add(sc.nextInt());
        }
        ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(list1);
        merge.addAll(list2);
        
        System.out.println(merge);
    }
}
