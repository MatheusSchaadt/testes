import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        String letra = s.nextLine().toLowerCase();
        char letraChar = letra.charAt(0);


        if (letraChar == 'a' || letraChar == 'e' || letraChar == 'i' || letraChar == 'o' || letraChar == 'u') {
            System.out.println("Vogal");
        } else {
            System.out.println("nao é vogal");
            
        }
 s.close();
    }



    
}
