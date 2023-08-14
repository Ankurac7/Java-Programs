class A{
    protected int i=10;

}
class B extends A{
    void disp(){
        System.out.println("The value of i is "+i);
    }
}
class test{
    public static void main(String args[]){
        B obj1= new B();
        obj1.disp();
    }
}

