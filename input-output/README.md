# Input and Output in Java

Input means taking data from the user. Output means displaying data.

## Input

Use `Scanner` to read user input from keyboard.

## Output

Use `System.out.println()` to print text and values.

## Example

```java
import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}
```
