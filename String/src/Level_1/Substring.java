package Level_1;

import java.util.Scanner;

public class Substring {
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        String manualSubstring = createSubstring(text, start, end);
        String builtinSubstring = text.substring(start, end);

        boolean result = compareStrings(manualSubstring, builtinSubstring);

        System.out.println("Substring using charAt: " + manualSubstring);
        System.out.println("Substring using substring: " + builtinSubstring);
        System.out.println("Both are same: " + result);
    }
}
