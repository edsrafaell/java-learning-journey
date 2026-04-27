package fundamentos;

import java.util.Scanner;

public class OperacoesInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println(sum);

        sum += a;
        System.out.println(sum);

        sum -= a;
        System.out.println(sum);

        sum *= a;
        System.out.println(sum);

        // inclemento e declemento
        int as = 10;
        int bs = ++as; // Incremento pré-fixado: a é incrementado antes de ser atribuído a b
        System.out.println("as: " + as); // as: 11
        System.out.println("bs: " + bs); // bs: 11

        int bs2 = as++; // Incremento pós-fixado: a é atribuído a b antes de ser incrementado
        System.out.println("as: " + as); // as: 12
        System.out.println("bs2: " + bs2); // bs2: 11
    }
}
