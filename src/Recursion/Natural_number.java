package Recursion;

public class Natural_number {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(nat(n));
    }
    public static int nat(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        int x=n+nat(n-1);
        return x;
    }
}