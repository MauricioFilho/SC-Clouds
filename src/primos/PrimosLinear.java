package primos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimosLinear {
  public static void main(String[] args) {
        int primo = 0;
        Scanner scan = new Scanner(System.in);
        List<Integer> primosList = new ArrayList<>();

        int n;
        do {
            System.out.print("Informa o valor de N:");
            n = scan.nextInt();
            if (n < 0) {
                System.out.println("Informe um valor maior ou igual a 0!");
            } else {
                for(int i = 0; i <= n; ++i) {
                    for(int j = 1; j <= i; ++j) {
                        if (i % j == 0) {
                            ++primo;
                        }
                    }
                    if (primo == 2) {
                        primosList.add(i);
                    }
                    primo = 0;
                }
            }
        } while(n < 0);

        StringBuilder str = new StringBuilder("P(" + n + ") = [");
        primosList.forEach((p) -> str.append(p).append(" "));
        str.append("]");
        System.out.print(str);
    }
}

