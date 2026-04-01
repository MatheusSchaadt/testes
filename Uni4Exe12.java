import java.util.Scanner;

public class Uni4Exe12 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt(); 
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        if (num1 < num2 + num3 &&
            num2 < num1 + num3 &&
            num3 < num1 + num2) {

        if ( num1 == num2 && num1 == num3) {
            System.out.println("equilátero");}      
            else if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("isósceles"); }
                else {
                    System.out.println("escaleno");
                }
        } else {
                 
            System.out.println("Não forma um triângulo");}
        
        s.close();
    }
}
