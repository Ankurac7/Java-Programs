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