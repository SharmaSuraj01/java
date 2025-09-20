package Recursion;

public class Digits_Sum {
    public static void main(String[] args) {
        int num = 12345;
//        sum(num,0);
        System.out.println(sum(num));
    }

    //    public static void sum(int num,int sum){
    public static int sum(int num) {
        if (num == 0) {
//            System.out.println(sum);
            return 0;
        }
//        int rem=num%10;
        return num % 10+sum(num / 10);

    }
}
