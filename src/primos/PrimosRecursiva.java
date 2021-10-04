package primos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimosRecursiva {

    public static void main(String[] args) {
        List<Integer> primosList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Informa o valor de N:");
            n = scan.nextInt();
            if (n > 0) {
                for(int i = 2; i <= n; ++i) {
                    if (isPrimo(i, 2)) {
                        primosList.add(i);
                    }
                }
            } else {
                System.out.println("Informe um valor maior ou igual a 0!");
            }
        } while (n < 0);
        StringBuilder str = new StringBuilder("P(" + n + ") = [");
        primosList.forEach((p) -> str.append(p).append(" "));
        str.append("]");
        System.out.print(str);
    }
    private static boolean isPrimo(int num, int divisor) {
        if (num / 2 < divisor) {
            return true;
        } else {
            return num % divisor != 0 && isPrimo(num, divisor + 1);
        }
    }
}