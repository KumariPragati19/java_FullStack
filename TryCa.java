// public class TryCa{
//     public static void main(String args[]){
//         try{
//             int a[]=new int[5];
//             a[5]=45/1;
//         }
//         catch(ArithmeticException e){
//             System.out.println("invalid divisor");
//         }
//         catch(ArrayIndexOutOfBoundsException e1){
//             System.out.println("Goes out of yhe length of array");
//         }
//         catch(Exception e3){
//             System.out.println("Exception");
//         }
//         System.out.println("Loading.....");
//     }
// }

public class TryCa{
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[6]=4;
        }
        catch(ArithmeticException e){
            System.out.println("Invalid");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of bound..");
        }
        finally{
            System.out.println("End");
        }

    }
}