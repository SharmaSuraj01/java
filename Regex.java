import java.util.regex.*;
public class Regex {
         public static void main(String[] args) {
//            String regex = "^[a-zA-Z0-9_.+-`1]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
//            Pattern pattern = Pattern.compile(regex);
//            String[] emails = {"surajsh4646@gmail.com", "adityabuu@ga.a.o", "user@domain"};
//
//
//            for (String email : emails) {
//                Matcher matcher = pattern.matcher(email);
//                System.out.println(email + " is valid: " + matcher.matches());
//            }
             String text = "Java is amazing. I love Java.";
             String regex = "Java";
             Pattern pattern = Pattern.compile(regex);
             Matcher matcher = pattern.matcher(text);
             while (matcher.find()) {
                 System.out.println("Found: " + matcher.group());
             }
             System.out.println("Matches entire string: " + text.matches(regex));
         }
    }
