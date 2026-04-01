import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int irmao1 = s.nextInt();
        int irmao2 = s.nextInt();
        int irmao3 = s.nextInt();

        if (irmao1 == irmao2 && irmao1 == irmao3) {
            System.out.println("são trigemeos");
        } else if (irmao1 == irmao2 || irmao2 == irmao3 || irmao1 == irmao3) {
            System.out.println("são gemeos");
        }
        else if (irmao1 == irmao2 || irmao1 == irmao3) {
            System.out.println("são gemeos");

        } else {
            System.out.println("apenas irmaos");
        }
        s.close();
    }
}
