package Recursion;

public class Exponantiotion {
    public static void main(String[] args) {
        int x=2;
        int n=3;
        System.out.println(power(x,n));

    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
//        return x*power(x,n-1);
       if(n%2==0){
           return power(x,n/2)*power(x,n/2);
       }else
           return power(x,n/2)*power(x,n/2)*x;

    }

}
