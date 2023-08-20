/*Write a program to count the number of objects created in main method. 
Use static keyword.*/


class countobj {
    static int c=0;
    public countobj(){
        c++;
    }
    public static void main(String[] args){
        countobj obj1= new countobj();
        countobj obj2= new countobj();
        countobj obj3= new countobj();
        System.out.println(c);
    }
}
