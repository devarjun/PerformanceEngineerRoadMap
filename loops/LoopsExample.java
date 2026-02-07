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
