import java.util.*;

public class a{

    public static String parseTernary(String expression) {
        Deque<Character> stk = new ArrayDeque<>();
        boolean cond = false;
        for (int i = expression.length() - 1; i >= 0; --i) {
            char c = expression.charAt(i);
            if (c == ':') {
                continue;
            }
            if (c == '?') {
                cond = true;
            } else {
                if (cond) {
                    if (c == 'T') {
                        char x = stk.pop();
                        stk.pop(); // remove the false branch
                        stk.push(x); // push the true branch back
                    } else {
                        stk.pop(); // discard the true branch
                    }
                    cond = false;
                } else {
                    stk.push(c);
                }
            }
        }
        return String.valueOf(stk.peek());
    }

    public static void main(String[] args) {
        // Get user input
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        // Call the parseTernary method and display the result
        String result = parseTernary(expression);
        System.out.println( result);

    }
}
