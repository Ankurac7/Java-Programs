class Student{
   String name;
   int age;
  
   public void getInfo(){
       System.out.println("The name of this Student is " + this.name);
       System.out.println("The age of this Student is " + this.age);
   }
}
public class StudentInfo{
   public static void main(String args[]){
       Student s1 = new Student();
       s1.name = "Ankur";
       s1.age = 20;
       s1.getInfo();


       Student s2 = new Student();
       s2.name = "Rick";
       s2.age = 19;
       s2.getInfo();
   }
}
