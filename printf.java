import java.util.Scanner;
//Question: https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true 
class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s", s1);
                System.out.printf("%03d%n", x );
            }
            System.out.println("================================");

    }
}


