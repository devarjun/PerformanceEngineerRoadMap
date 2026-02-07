# Variables and Data Types in Java

Variables store data in memory. In Java, every variable has a **type** that defines what kind of value it can hold.

## Common Data Types

- `byte`, `short`, `int`, `long` → whole numbers
- `float`, `double` → decimal numbers
- `char` → single character
- `boolean` → `true` or `false`
- `String` → text (reference type)

## Example

```java
public class VariablesAndDataTypesExample {
    public static void main(String[] args) {
        int age = 21;
        double height = 5.9;
        char grade = 'A';
        boolean isJavaFun = true;
        String name = "Alex";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);
    }
}
```
