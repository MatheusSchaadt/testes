import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) throws Exception {
     Scanner s = new Scanner(System.in);
       int n1, n2;
       n1 = s.nextInt();
       n2 = s.nextInt();
       if (n1 == 0 && n2 == 0) {
        System.out.println("0");
       } else if (n1 >= 1 && n2 >= 1) {
        System.out.println("1");
       } else if (n1 < 0 && n2 > 0) {
        System.out.println("2");
       } else if (n1 < 0 && n2 < 0) {
        System.out.println("3");
       } else if (n1 > 0 && n2 < 0) {
        System.out.println("4");
       }
       













    }      
}
