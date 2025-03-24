import java.io.*;
import java.util.*;

class GFG {

    static boolean checkString(String s1, String s2,
                               int indexFound, int Size)
    {
        for (int i = 0; i < Size; i++) {

            if (s1.charAt(i)
                    != s2.charAt((indexFound + i) % Size))
                return false;
        }

        return true;
    }
    public static void main(String args[])
    {
        String s1 = "sample";
        String s2 = "pleasm";

        if (s1.length() != s2.length()) {
            System.out.println(
                    "s2 is not a rotation on s1");
        }
        else {

            ArrayList<Integer> indexes = new ArrayList<
                    Integer>();

            int Size = s1.length();

            char firstChar = s1.charAt(0);

            for (int i = 0; i < Size; i++) {
                if (s2.charAt(i) == firstChar) {
                    indexes.add(i);
                }
            }

            boolean isRotation = false;
            for (int idx : indexes) {
                isRotation = checkString(s1, s2, idx, Size);

                if (isRotation)
                    break;
            }

            if (isRotation)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}