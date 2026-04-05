import java.util.Scanner;

public class Uni4Exe29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        char operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.println(valor1 + valor2);
                break;
            case '-':
                System.out.println(valor1 - valor2);
                break;
            case '*':
                System.out.println(valor1 * valor2);
                break;
            case '/':
                if (valor2 == 0) {
                    System.out.println("Erro: divisão por zero");
                } else {
                    System.out.println(valor1 / valor2);
                }
                break;
            default:
                System.out.println("Operação inválida");
        }

        scanner.close();
    }
}
