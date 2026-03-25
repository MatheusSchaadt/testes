import java.util.Scanner;

public class Uni4Exe07 {
    //O custo do selo de uma carta com até 50 gramas é de R$ 0,45. 
    // As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em que excedem aquele peso. E
    // screva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.
    //
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double peso = s.nextDouble();
        double custo = 0.45;
        if (peso > 50) {
            double excesso = peso - 50;
            int adicionais = (int) Math.ceil(excesso / 20);
            custo += adicionais * 0.45;
        }
        System.out.printf("O custo do selo é: R$ %.2f", custo);
            
        s.close();
    }


    
}
