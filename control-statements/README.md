# Control Statements in Java

Control statements decide which code runs.

## Types

1. **if** – execute a block if condition is true.
2. **if-else** – choose one of two blocks.
3. **if-else-if ladder** – choose among multiple conditions.
4. **switch** – select a block based on a value.

## Example

```java
public class ControlStatementsExample {
    public static void main(String[] args) {
        int score = 78;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 75) {
            System.out.println("Grade B");
        } else if (score >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other day");
        }
    }
}
```
