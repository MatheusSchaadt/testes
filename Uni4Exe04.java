import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numero = s.nextLine();
        if (numero.contains(".")) {
            System.out.print("casas decimais foram digitadas");
        } else {
            System.out.print("casas decimais nao foram digitadas");
        }
        s.close();
    }

}
