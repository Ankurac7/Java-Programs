class RecAccess{

    int a; //default access, public within its own package
    public int b; //public access, it can be accessed from anywhere, from outside also
    
    private int c; //private access, it can be acessed by the methods within this class only
    //methods to access c


    void setc(int i){
        c=i; //set value of c
    }
    //methods to get c
    int getc(){
        return c;
    }
}
class AccessTest{
    public static void main(String args[]){
        RecAccess obj= new RecAccess();
        //a and b may be accessed directly
        obj.a=10;
        obj.b=20;
        //c cannot be accessed directly
        //obj.c=30;
        //c can be accessed through its methods

        obj.setc(100);

        System.out.println("values of a,b,c are:" + obj.a+ " "+obj.b+" "+obj.getc());
    }
}