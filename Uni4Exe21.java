import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Massa (em kg): ");
        double massa = scanner.nextDouble();

        double imc = massa / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc <= 24.9) {
            System.out.println("Saudável");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }

        scanner.close();
    }
}