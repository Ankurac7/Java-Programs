package Classroom;

import java.util.Scanner;
public class GCAssignment4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        sc.nextLine();
        double db= sc.nextDouble();
        sc.nextLine();
        String st= sc.nextLine();
        sc.close();

        // Print the output
        System.out.println("String: " + st);
        System.out.println("Double: " + db);
        System.out.println("Int: " + num);
    }
}
