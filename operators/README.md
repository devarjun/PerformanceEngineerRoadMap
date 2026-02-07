# Operators in Java

Operators perform operations on variables and values.

## Types of Operators

1. **Arithmetic**: `+`, `-`, `*`, `/`, `%`
2. **Relational (Comparison)**: `==`, `!=`, `>`, `<`, `>=`, `<=`
3. **Logical**: `&&`, `||`, `!`
4. **Assignment**: `=`, `+=`, `-=`, `*=`, `/=`
5. **Unary**: `++`, `--`

## Example

```java
public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Arithmetic: a + b = " + (a + b));
        System.out.println("Arithmetic: a % b = " + (a % b));

        System.out.println("Relational: a > b = " + (a > b));
        System.out.println("Relational: a == b = " + (a == b));

        boolean x = true, y = false;
        System.out.println("Logical: x && y = " + (x && y));
        System.out.println("Logical: x || y = " + (x || y));

        a += 5;
        System.out.println("Assignment: a after a += 5 is " + a);

        b++;
        System.out.println("Unary: b after b++ is " + b);
    }
}
```
