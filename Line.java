import java.lang.Math.*;
import java.io.*;
class point{
    double x;
    double y;
    public point(double x, double y){
        this.x=x;
        this.y=y;
    }
    static void distance(point n1,point n2){
        double d=((n2.x-n1.x)*(n2.x-n1.x))+((n2.y-n1.y)*(n2.y-n1.y));
        double dis=Math.sqrt(d);
        System.out.println("distance between two given point is:"+dis);
    }
    static void Slope(point n1,point n2){
        double m=((n2.y-n1.y)*(n2.y-n1.y))/((n2.x-n1.x)*(n2.x-n1.x));
        double c =n1.y-(m*n1.x);
        int n = 2;
        m = Math.round(m * Math.pow(10, n)) / Math.pow(10, n);
        c = Math.round(c * Math.pow(10, n)) / Math.pow(10, n);
        System.out.println("Slope of straight line: "+m);
        if(c<0){
            System.out.println("Equation of line is : Y"+"= "+m+"X"+ c);
        }
        else{
            System.out.println("Equation of line is : Y"+"= "+m+"X"+" + "+ c);
        }
    }
}
public class Line {
    public static void main(String[] args){
        point n1= new point(2.0,2.0);
        point n2= new point(5.0,2.0);
        point.distance(n1,n2);
        point.Slope(n1,n2);
    }
}
