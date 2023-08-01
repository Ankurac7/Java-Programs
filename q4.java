import java.util.Scanner;
class InputEx {
    /**
     *
     */
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Integer value: ");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.println("Enter a string: ");
        String s= sc.nextLine();
        for(int i=0;i<a;i++){
            System.out.println(s);
        }
    }
}
