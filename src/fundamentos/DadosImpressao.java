package fundamentos;

public class DadosImpressao {
    public static void main(String[] args){
        String name = "Rafael";
        int age = 10;

        //Print + nova linha
        System.err.println("Nome: ");
        System.err.println(name);
        System.err.println("Age: ");
        System.err.println(age);

        // Print + mesma linha
        System.err.print("Nome: ");
        System.err.print(name);
        System.err.print("Age: ");
        System.err.print(age);

        //Concatenação
        System.err.println("Nome: " + name);
        System.err.println("Age: " + age);

        System.out.print("Java");
        System.out.print(" ");
        System.out.println("101");
    }
}
