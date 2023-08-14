final class A{
    final int a=5;
    final void disp(){
        System.out.println("In A");
    }
}
class B extends A{
    void chng(){
        a = 10;
        System.out.println(a);
    }
    void disp(){
        System.out.println("In B");
    }
}