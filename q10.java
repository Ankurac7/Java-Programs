// We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A 
// and in four subjects (each out of 100) by student B. 
// Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
// It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns 
// the percentage of the students. The constructor of student A takes the marks in three subjects 
// as its parameters and the marks in four subjects as its parameters for student B. 
// Create an object for eac of the two classes and print the percentage of marks for both the students.


import java.util.Scanner;
abstract class Marks{
    abstract double getPercentage();
}
class A extends Marks{
    double marks1;
    double marks2;
    double marks3;
    A(double marks1, double marks2, double marks3){
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    double getPercentage(){
        return ((marks1+marks2+marks3)/3.0);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double m1= sc.nextDouble();
        double m2= sc.nextDouble();
        double m3= sc.nextDouble();
        A obj=new A(m1,m2,m3);
        System.out.println(obj.getPercentage());
    }
}

class B extends Marks{
    double marks1;
    double marks2;
    double marks3;
    double marks4;
    B(double marks1, double marks2, double marks3, double marks4){
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.marks4=marks4;
    }
    double getPercentage(){
        return ((marks1+marks2+marks3+marks4)/4.0);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double m1= sc.nextDouble();
        double m2= sc.nextDouble();
        double m3= sc.nextDouble();
        double m4= sc.nextDouble();
        B obj=new B(m1,m2,m3,m4);
        System.out.println(obj.getPercentage());
    }
}
