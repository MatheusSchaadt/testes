import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        if (num1 == num2) {
            System.out.print("o valor " + num1 + " é igual que o valor " + num2);
        } else if (num1 > num2) {
            System.out.print("o valor " + num1 + " é maior que o valor " + num2);

        } else {
            System.out.print("o valor " + num2 + " é maior que o valor " + num1);
        }
        s.close();
    }

}
