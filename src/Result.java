import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Result {

    public static List<String> tableOfContents(List<String> text) {
        List<String> result = new ArrayList<>();
        int chapterCount = 0;
        int sectionCount = 0;

        for (String line : text) {
            line = line.trim();  // Remove leading/trailing spaces to handle inconsistencies
            if (line.startsWith("# ")) {
                chapterCount++;
                sectionCount = 0;  // Reset section count for new chapter
                // Add the chapter to the table of contents
                result.add(chapterCount + ". " + line.substring(2).trim());
            } else if (line.startsWith("## ")) {
                sectionCount++;
                // Add the section under the current chapter
                result.add(chapterCount + "." + sectionCount + " " + line.substring(3).trim());
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int textCount = Integer.parseInt(bufferedReader.readLine().trim());

        // Read input lines into a list
        List<String> text = new ArrayList<>();
        for (int i = 0; i < textCount; i++) {
            text.add(bufferedReader.readLine());
        }

        // Process the table of contents
        List<String> result = Result.tableOfContents(text);

        // Print the result to console instead of writing to a file
        for (String line : result) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
