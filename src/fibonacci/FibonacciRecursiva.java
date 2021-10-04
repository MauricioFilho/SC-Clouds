package fibonacci;

import java.util.Scanner;

public class FibonacciRecursiva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Informe o valor de N:");
            n = scan.nextInt();
            if (n >= 0) {
                for(int i = 0; i <= n; ++i) {
                    System.out.print("fib(" + i + ") = " + fibonacciRecursivo(i) + "\n");
                }
            } else {
                System.out.println("Informe um valor maior ou igual a 0!");
            }
        } while(n < 0);
    }
    static long fibonacciRecursivo(int n) {
        return n < 2 ? (long)n : fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}
