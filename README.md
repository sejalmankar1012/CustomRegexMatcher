# CustomRegexMatcher

This Java program implements a custom regex matcher that checks whether a given input string matches a provided regular expression pattern. The program supports alphanumeric characters, period (.), and the asterisk (*) wildcard.

## Usage

1. **Compilation**:
   - Make sure you have the Java Development Kit (JDK) installed on your computer.
   - Open a terminal or command prompt.
   - Navigate to the directory containing the `CustomRegexMatcher.java` file.
   - Compile the Java code by running the following command:
     ```
     javac CustomRegexMatcher.java
     ```

2. **Running the Program**:
   - After successful compilation, run the program using the following command:
     ```
     java CustomRegexMatcher
     ```
   
3. **Input Instructions**:
   - The program will prompt you to enter the regular expression pattern. Enter the desired pattern and press Enter.
   - Next, you'll be prompted to input the string you want to check against the regular expression. Enter the string and press Enter.

4. **View Results**:
   - The program will process your inputs and display whether the input string matches the provided regular expression or not.

## Examples

Here are some example interactions when running the program:

```
Enter the regular expression:
a.b*

Enter the input string:
abbbc

The string matches the regular expression.
```

## Notes

- The program validates input parameters and handles edge cases according to the specified requirements.
- The matching logic includes recursive handling of the '*' wildcard.
- Feel free to customize the program, add more test cases, or modify the code as needed.

---
