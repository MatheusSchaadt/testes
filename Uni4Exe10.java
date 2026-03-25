import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int marquinho = s.nextInt();
        int zezinho = s.nextInt();
        int luluzinha = s.nextInt();

        if (marquinho < zezinho && marquinho < luluzinha) {
            System.out.println("Marquinho é o mais novo");
        } else if (zezinho < marquinho && zezinho < luluzinha) {
            System.out.println("Zezinho é o mais novo");
        } else if (luluzinha < marquinho && luluzinha < zezinho) {
            System.out.println("Luluzinha é a mais nova");
        }
        s.close();

    }

}
