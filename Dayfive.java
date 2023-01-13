// public class Dayfive{
//     public static void main(String args[]){
//         try{
//             System.out.println("A");
//             int num=99/0;
//             System.out.println("B");
//         }
//         catch(ArithmeticException ex){
//             System.out.println("c");
//         }
//         catch(Exception ex){
//             System.out.println("D");
//         }
//         System.out.println("E");
//     }
// }

public class Dayfive{
    public static void main(String args[]) 
    {
        try 
        {
            System.out.print("A");
            int num = 99/0;
            System.out.print("B");
        }
        catch(Exception ex) 
        {
            System.out.print("C");
        }
        // catch(ArithmeticException e)
        // {
        //     System.out.print("D");
        // }
        finally
        {
            System.out.print("E");
        } 
        System.out.print("F");
    }
}