// interface A{
//     public void add(double x,double y);
//     public void sub(double x,double y);
// }
// interface B{
//     public void mul(double x,double y);
//     public void div(double x,double y);
// }
// interface calc extends A,B{
//     public void res(double z);
// }
// public class lec4 implemets calc{
//     public void add(double x, double y){
//         double result=x+y;
//         res(result);
//     }
//     public void sub(double x, double y){
//         double result=x-y;
//         res(result);
//     }
//     public void mul(double x, double y){
//         double result=x+y;
//         res(result);
//     }
//     public void div(double x, double y){
//         double result=x+y;
//         res(result);
//     }
// }


// class thred extends Thread{
//     public void run(){
//         try{
//             System.out.println("Thread"+Thread.currentThread().getId());
//         }
//         catch(Exception e){
//             System.out.println("Invalid");
//         }
//     }
// }
// public class lec4{
//     public static void main(String args[]){
//         int i=5;
//         for(int j=0;j<i;j++){
//             thred ob=new thred();
//             ob.start();
//         }
//     }
// }


