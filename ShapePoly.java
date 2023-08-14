class Shape{
    void draw(){
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle.");
    }
}

class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a triangle.");
    }
}
class Calculator {
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }
}

public class ShapePoly{
    public static void main(String[] args){
        Shape shape1 = new Circle();
        Shape shape2 = new Triangle();

        shape1.draw();
        shape2.draw();

        Calculator calculator = new Calculator();
        int sum1 = calculator.add(3, 5);
        double sum2 = calculator.add(2.5, 4.7);

        System.out.println("Sum 1: " + sum1); // Outputs: Sum 1: 8
        System.out.println("Sum 2: " + sum2); // Outputs: Sum 2: 7.2
    }
}
