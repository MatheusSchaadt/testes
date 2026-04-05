
import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();
        int opcao = scanner.nextInt();

        int menor, meio, maior;

        if (valor1 <= valor2 && valor1 <= valor3) {
            menor = valor1;
            if (valor2 <= valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            menor = valor2;
            if (valor1 <= valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 <= valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        switch (opcao) {
            case 1:
                System.out.println(menor + " " + meio + " " + maior);
                break;
            case 2:
                System.out.println(maior + " " + meio + " " + menor);
                break;
            case 3:
                System.out.println(menor + " " + maior + " " + meio);
                break;
        }

        scanner.close();
    }
}