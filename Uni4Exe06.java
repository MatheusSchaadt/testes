import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String letras = s.nextLine().toUpperCase();

        if (letras.contains("M")) {
            System.out.print("masculino");
        } else if (letras.contains("F")) {
            System.out.print("feminino");
        } else if (letras.contains("I")) {

            System.out.print("nao informado");
        } else {

            System.out.print("informaçao incorreta");
        }
        s.close();

    }

}
