import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" digite a quantidade de meses que foi admitido:");
        int meses = sc.nextInt();
        
        if (meses <= 12) {
            System.out.println("5%");
        } else if (meses >= 13 && meses <= 48) {
            System.out.println("7%");
        } else {
            System.out.println("Reajuste não informado");
            sc.close();
        }
    }
}
