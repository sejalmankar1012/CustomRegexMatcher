import java.util.Scanner;

public class CustomRegexMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the regular expression:");
        String regex = scanner.nextLine();

        System.out.println("Enter the input string:");
        String str = scanner.nextLine();

        boolean result = isMatch(regex, str);

        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }

    public static boolean isMatch(String regex, String str) {
        if (regex == null || str == null) {
            throw new IllegalArgumentException("Input strings cannot be null.");
        }

        return isMatchHelper(regex, str, 0, 0);
    }

    private static boolean isMatchHelper(String regex, String str, int regexIndex, int strIndex) {
        if (regexIndex == regex.length() && strIndex == str.length()) {
            return true;
        }

        if (regexIndex >= regex.length()) {
            return false;
        }

        char regexChar = regex.charAt(regexIndex);

        if (regexIndex + 1 < regex.length() && regex.charAt(regexIndex + 1) == '*') {
            char prevChar = regexChar;
            regexIndex += 2;

            while (strIndex <= str.length()) {
                if (isMatchHelper(regex, str, regexIndex, strIndex)) {
                    return true;
                }
                if (strIndex < str.length() && (str.charAt(strIndex) == prevChar || prevChar == '.')) {
                    strIndex++;
                } else {
                    break;
                }
            }
        } else if (regexChar == '.') {
            if (strIndex < str.length()) {
                return isMatchHelper(regex, str, regexIndex + 1, strIndex + 1);
            }
        } else if (strIndex < str.length() && regexChar == str.charAt(strIndex)) {
            return isMatchHelper(regex, str, regexIndex + 1, strIndex + 1);
        }

        return false;
    }
}


