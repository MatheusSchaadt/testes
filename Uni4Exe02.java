import java.util.Scanner;
//entrada; valor
// saida: valor impar

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor = s.nextInt();
        int parOuImpar = valor % 2;

        if (parOuImpar == 0) {
            System.out.print("o numero é par");
        }

        else {
            System.out.print("o numero é impar");
        }

        s.close();

    }

}
