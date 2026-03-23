import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a cor é azul? ");
        boolean sim = s.nextBoolean();

        if (sim) {

            System.out.print("sim");

        } else {

            System.out.print("nao");
        }
        s.close();
        
    }

}
