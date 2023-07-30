class q3 {
    //triangle
    void calculate(double d,double e){
        double a=(e*d)/2;
        System.out.println(a);
    }
    //circle
    void calculate(float r){
        float pi=3.14f;
        float z=4*pi*r*r;
        System.out.println(z);
    }
    //rectangle
    void calculate(float m, float n){
        float f=m*n;
        System.out.println(f);
    }
}
class area {
    public static void main(String s[]) {
        q3 objArea = new q3();
        objArea.calculate((float) 1.0); // circle (explicitly cast to float)
        objArea.calculate(6, 3);        // triangle (int)
        objArea.calculate(6.9, 4.2);    // rectangle (double)
    }
}
