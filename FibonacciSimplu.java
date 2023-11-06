import java.util.Scanner;

public class FibonacciSimplu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un număr N pentru a afișa șirul Fibonacci până la el: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        while (a <= n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }

        scanner.close();
    }
}
