import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1 = scanner.nextDouble();
        double valor2 = scanner.nextDouble();
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(valor1 + valor2);
                break;
            case 2:
                System.out.println(valor1 - valor2);
                break;
            case 3:
                System.out.println(valor1 * valor2);
                break;
            case 4:
                if (valor2 != 0) {
                    System.out.println(valor1 / valor2);
                } else {
                    System.out.println("Erro: divisão por zero");
                }
                break;
            default:
                System.out.println("Erro: opção inválida");
        }

        scanner.close();
    }
}
