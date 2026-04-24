package fundamentos;
import  java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome1 = teclado.next(); 
        // Apenas o primeiro nome será lido
        System.out.println("Olá, " + nome1 + "!");

        String nome2 = teclado.nextLine(); 
        // A linha completa será lida, incluindo espaços
        System.out.println("Olá, " + nome2 + "!");

        //Outros tipos de leitura
        System.out.println("Digite sua idade:");    
        int idade = teclado.nextInt();
        System.out.println("Você tem " + idade + " anos.");
        // Valor Inteiro

        System.out.println("Digite sua altura:");
        double altura = teclado.nextDouble();   
        System.out.println("Sua altura é " + altura + " metros.");
        // Valor fracionario

        System.err.println("Esta feliz:");
        boolean feliz = teclado.nextBoolean();
        System.out.println("Feliz: " + feliz);
        // Valor booleano
        teclado.close();
    }
}
