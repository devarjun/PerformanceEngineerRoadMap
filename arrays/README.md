# Arrays in Java

An array stores multiple values of the same data type in a single variable.

## Key Points

- Arrays have fixed size.
- Index starts at `0`.
- Access using index: `arr[0]`.

## Example

```java
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92};

        System.out.println("First mark: " + marks[0]);

        marks[2] = 80; // update value

        System.out.println("All marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        System.out.println("Array as text: " + Arrays.toString(marks));
    }
}
```
