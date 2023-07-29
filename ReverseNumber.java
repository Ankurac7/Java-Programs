public class ReverseNumber {
    public static void main(String[] args){  
        int num= 12345678, rev= 0;
        int temp= num;
        while(num != 0){  
            int dig= num%10;  
            rev= rev* 10+dig;  
            num= num/10;  
        }  
        System.out.println("The reverse of the given number is: " + rev);  
    }  
}
