import java.util.Scanner;

public class Uni4Exe16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int home1 = sc.nextInt();
        int home2 = sc.nextInt();
        int mulher1 = sc.nextInt();
        int mulher2 = sc.nextInt();

        int homemVelho, homemNovo;
        int mulherVelha, mulherNova;

        if (home1 > home2) {
            homemVelho = home1;
            homemNovo = home2;
        } else {
            homemVelho = home2;
            homemNovo = home1;
        }

        if (mulher1 > mulher2) {
            mulherVelha = mulher1;
            mulherNova = mulher2;
        } else {
            mulherVelha = mulher2;
            mulherNova = mulher1;
        }

        int soma = homemVelho + mulherNova;
        int produto = homemNovo * mulherVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);

        sc.close();
    }
}