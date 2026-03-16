import java.util.Scanner;

public class uni2Exe10 {


    //entrada; totalSegundos
    //totalH= totalSegundos / 3600
    // resto + totalSegundos % 3600
    //totalM= resto / 60
    //totalS= resto % 60

    public static void main(String[] args) {

        Scanner segundos = new Scanner(System.in);
        System.out.println("Digite o total de segundos: ");
        int totalSegundos = segundos.nextInt();

        int totalH = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;
        int totalM = totalSegundos / 60;
        totalSegundos = totalSegundos % 60;

        System.out.println(totalH + ":" + totalM + ":" + totalSegundos);

        segundos.close();

    }


    
}
