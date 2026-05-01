package fundamentos;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        System.out.println(2 + 3); // Adição
        System.out.println(2 - 3); // Subtração
        System.out.println(2 * 3); // Multiplicação
        System.out.println(2 / 3); // Divisão
        System.out.println(2 % 3); // Resto da divisão

        int a = 10;
        int b = 20;

        System.out.println(a + b); // Adição
        System.out.println(a - b); // Subtração
        System.out.println(a * b); // Multiplicação
        System.out.println(a / b); // Divisão
        System.out.println(a % b); // Resto da divisão

        // Ordem de precedência
        System.out.println(((2 + 3) * 4) / 2); // Parênteses, multiplicação e divisão, adição e subtração
        System.out.println(2 + 3 * 4 / 2); // Multiplicação e divisão, adição e subtração
    }
}
