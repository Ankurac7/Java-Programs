class Pen{
    String color;
    String type; //ballpoint; gel
    public void printColorNType(){
       System.out.println("The color of this pen is " + this.color);
       System.out.println("The type of "+this.color+" pen is " + this.type);
    }
    public void write(){
    System.out.println("Writing something");
    }
}

public class PenInfo{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.color ="blue";
        p1.type="gel";
 
 
        Pen p2 = new Pen();
        p2.color ="black";
        p2.type ="fountain";
 
        Pen p3 = new Pen();
        p3.color ="red";
        p3.type="ballpoint";
 
 
        p1.printColorNType();
        p2.printColorNType();
        p3.printColorNType();
    } 
}
