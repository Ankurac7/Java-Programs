package Arrays;

public class sum {
    public static void main(String[] args){
        int [] arr = new int [] {10,15,35,10,30};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
           sum = sum + arr[i];
        }
        System.out.println("Sum of the elements in the array: " + sum);
    }
}
