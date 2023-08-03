import java.util.Scanner;
public class prime_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int num = sc.nextInt();
        boolean flag=false;
        if (num==1)
            System.out.println(num+" is not a prime number");
        else if (num > 1){
            for (int i = 2; (int)i <= num/2; i++){
                if (num % i == 0){
                    flag=true;
                    break;
                }
            }
            if (flag==true)
                System.out.println(num+ " is not a prime number");
            else
                System.out.println(num+ " is a prime number");
        }
    }
}