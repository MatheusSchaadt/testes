import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int carta1 = s.nextInt();
        int carta2 = s.nextInt();
        int carta3 = s.nextInt();
        int soma = 0;
        if (carta1 == 2 || carta1 == 3 || carta1 == 1) {
            soma++;  }
        if (carta2 == 2 || carta2 == 3 || carta2 == 1) {
            soma++;  }
        if (carta3 == 2 || carta3 == 3 || carta3 == 1) {
            soma++;  }
        System.out.println(soma);
        s.close();
    
    if (soma == 1) {
            System.out.println("TRUCO");
        } else if (soma == 2) {
            System.out.println("SEIS");
        } else if (soma == 3) {
            System.out.println("NOVE");
        }
        else {
            System.out.println("-");
        }
}
}
