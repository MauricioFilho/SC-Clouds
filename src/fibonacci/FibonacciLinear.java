package fibonacci;

import java.util.Scanner;

public class FibonacciLinear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;

        int n;
        do {
            System.out.print("Informe o valor de N:");
            n = scan.nextInt();
            if (n >= 0) {
                int i = n;

                for(int j = 0; i > 0; ++j) {
                    System.out.print("fib(" + j + ") = " + n1 + "\n");
                    int n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                    --i;
                }
            } else {
                System.out.println("Informe um valor maior ou igual a 0!");
            }
        } while(n < 0);
    }
}