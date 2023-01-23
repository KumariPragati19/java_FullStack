import java.util.Scanner;
public class TwoDOperation {
    static void  Arr(int arr[][],int row,int column){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) { 
                arr[i][j]=sc.nextInt();
                System.out.println(); 
                
            }
        
        }
    }
    static void printArr(int arr[][],int row,int column){

        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                System.out.printf(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
    static int[][] add(int arr1[][], int arr2[][],  int size){
        int i, j;
        int Sum[][] = new int[size][size];
 
        for (i = 0; i < size; i++){
            for (j = 0; j < size; j++){
                Sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return Sum;
    }
    static int[][] sub(int arr1[][], int arr2[][],  int size){
        int i, j;
        int Sub[][] = new int[size][size];
 
        for (i = 0; i < size; i++){
            for (j = 0; j < size; j++){
                Sub[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return Sub;
    }
    static int[][] product(int arr1[][], int arr2[][],  int size){
        int mul[][]=new int[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return mul;
    }

    public static void main(String[] args){
        //int arr=sc.nextInt();
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        System.out.println("First matrix is : ");
        Arr(arr1,3,3);
        printArr(arr1,3,3);
        System.out.println("Second matrix is : ");
        Arr(arr2,3,3);
        printArr(arr2,3,3);
        int Sum[][] = add(arr1, arr2, 3);
        System.out.println("\nSummation of Matrix:");
        printArr(Sum, 3, 3);
        int Sub[][] = sub(arr1, arr2, 3);
        System.out.println("\nSubstraction of Matrix:");
        printArr(Sub ,3,3);
        int mul[][] = product(arr1, arr2, 3);
        System.out.println("\nMultiplication of Matrix:");
        printArr(mul ,3,1);



    }
}
