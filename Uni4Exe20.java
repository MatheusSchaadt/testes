import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        double notaProva1, notaProva2, notaProva3, notaExercicios;
        System.out.println("Digite a nota da prova 1: ");
        notaProva1 = s.nextDouble();
        System.out.println("Digite a nota da prova 2: ");
        notaProva2 = s.nextDouble();
        System.out.println("Digite a nota da prova 3: ");
        notaProva3 = s.nextDouble();
        System.out.println("Digite a nota dos exercícios: ");
        notaExercicios = s.nextDouble();
        
        double mediaFinal = (notaProva1 + (notaProva2 *2) + (notaProva3*3) + notaExercicios) / 7;   
            if (mediaFinal >= 9) {
                System.out.println("A aprovado");
            } else if (mediaFinal >= 7.5 ) {
                System.out.println("B aprovado");
            } else if (mediaFinal >= 6) {
                System.out.println("C aprovado");
            } else if (mediaFinal >= 4) {
                System.out.println("D reprovado");
            } else {
                System.out.println("E reprovado");
            }
            System.out.printf("A média de aproveitamento foi: " + (dc).format(mediaFinal));


    }
    
}
