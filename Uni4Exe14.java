import java.util.Scanner;

public class Uni4Exe14 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        int dias;

        if (m < 1 || m > 12) {
            System.out.println("Data inválida");
            
        }

        if (m == 2) {
            dias = ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) ? 29 : 28;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            dias = 30;
        } else {
            dias = 31;
        }

        if (d >= 1 && d <= dias)
            System.out.println("Data válida");
        else
            System.out.println("Data inválida");

        sc.close();
    }
}