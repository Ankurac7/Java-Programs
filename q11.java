/*We have to calculate the area of a rectangle, a square and a circle. 
Create an abstract class 'Shape' with three abstract methods namely 
'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
taking one parameter each. The parameters of 'RectangleArea' are its 
length and breadth, that of 'SquareArea' is its side and that of 
'CircleArea' is its radius. Now create another class 'Area' containing 
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' 
for printing the area of rectangle, square and circle respectively. 
Create an object of class 'Area' and call all the three methods.*/

import java.util.Scanner;
abstract class Shape{
    abstract void RectangleArea(double a, double b);
    abstract void SquareArea(double x);
    abstract void CircleArea(double r);
}
class Area extends Shape{
    void RectangleArea(double a, double b){
        double c=a*b;
        System.out.println(c);
    }
    void SquareArea(double x){
        double y=x*x;
        System.out.println(y);
    }
    void CircleArea(double r){
        //final double pi=(22.0/7.0);
        double z=Math.PI*r*r;
        System.out.println(z);
    }
    public static void main(String[] args){
        Area obj1=new Area();
        Scanner sc= new Scanner(System.in);
        double l= sc.nextDouble();
        double b= sc.nextDouble();
        double x= sc.nextDouble();
        double r= sc.nextDouble();
        obj1.RectangleArea(l,b);
        obj1.SquareArea(x);
        obj1.CircleArea(r);
    }
}