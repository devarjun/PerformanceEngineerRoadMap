# Loops in Java

Loops are used to repeat code.

## Types of Loops

1. **for loop** – repeat for a known number of times.
2. **while loop** – repeat while condition is true.
3. **do-while loop** – execute once, then repeat while condition is true.
4. **enhanced for loop (for-each)** – iterate through arrays/collections.

## Example

```java
public class LoopsExample {
    public static void main(String[] args) {
        System.out.println("for loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        System.out.println("while loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println(j);
            j++;
        }

        System.out.println("do-while loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 3);

        System.out.println("for-each loop:");
        int[] numbers = {10, 20, 30};
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
```
