class m {
    void calculate(int x,int y){
        int z=x+y;
        System.out.println(z);
    }
    void calculate(float m, float n){
        float f=m+n;
        System.out.println(f);
    }
}
class test_Overload{
    public static void main(String s[]){
        m objM=new m();
        objM.calculate(10, 20);
        objM.calculate(4.5f, 6.8f);
    }
}
