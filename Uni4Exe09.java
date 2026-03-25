import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        int numero2 = s.nextInt();
        int resultado = numero %   numero2;
        int resultado2 = numero2  % numero;

        if (resultado == 0) {
            System.out.println(numero + " é múltiplo de " + numero2);
        } else {
            System.out.println(numero + " não é múltiplo de " + numero2);
        }
        if (resultado2 == 0) {
            System.out.println(numero2 + " é múltiplo de " + numero);
        } else {
            System.out.println(numero2 + " não é múltiplo de " + numero);
        }
            s.close();
    }


}
       

