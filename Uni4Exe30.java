import java.util.Scanner;

public class Uni4Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        int opcao;

        do {
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;

                case 2:
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo: " + saldo);
                    break;

                case 3:
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo = saldo - saque;
                        System.out.println("Saldo: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 4);

        scanner.close();
    }
}