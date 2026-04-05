import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char opcao = Character.toUpperCase(scanner.next().charAt(0));
        double area = 0;

        switch (opcao) {
            case 'T':
                double baseT = scanner.nextDouble();
                double alturaT = scanner.nextDouble();
                area = (baseT * alturaT) / 2;
                break;

            case 'Q':
                double lado = scanner.nextDouble();
                area = lado * lado;
                break;

            case 'R':
                double baseR = scanner.nextDouble();
                double alturaR = scanner.nextDouble();
                area = baseR * alturaR;
                break;

            case 'C':
                double raio = scanner.nextDouble();
                area = 3.14159 * raio * raio;
                break;

            default:
                System.out.println("Opção inválida");
                scanner.close();
                return;
        }

        if (area == (int) area) {
            System.out.println((int) area);
        } else {
            System.out.printf("%.2f%n", area);
        }

        scanner.close();
    }
}