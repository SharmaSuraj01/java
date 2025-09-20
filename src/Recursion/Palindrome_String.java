package Recursion;

public class Palindrome_String {
    public static void main(String[] args) {
        String st = "madam";
        System.out.println(palin(st, 0, st.length() - 1));
    }
    public static boolean palin(String st, int s, int e) {
        if (s >= e) {
            return true;
        }
        if (st.charAt(s) != st.charAt(e)) {
            return false;
        }
        return palin(st, s + 1, e - 1);
    }
}
