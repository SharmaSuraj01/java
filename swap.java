public class swap {
    public static void main(String[] args) {
        int a=15;
        int b=26;
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
