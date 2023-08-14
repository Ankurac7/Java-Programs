package Classroom;

import java.util.Scanner;
public class GCAssignment3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n >= 1 && n <= 100){
            if (n % 2 == 1 || (n % 2 == 0 && n >= 6 && n <= 20)){
                System.out.println("Weird");
            }
            else
                System.out.println("Not Weird");
        }
        else
            System.out.println("Invalid input. n must be between 1 and 100.");
        
    }
}
