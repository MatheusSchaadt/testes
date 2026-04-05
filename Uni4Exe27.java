import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaChegada = scanner.nextInt();
        int minChegada = scanner.nextInt();
        int horaSaida = scanner.nextInt();
        int minSaida = scanner.nextInt();

        if (horaChegada < 0 || horaChegada > 23 ||
            minChegada < 0 || minChegada > 59 ||
            horaSaida < 0 || horaSaida > 23 ||
            minSaida < 0 || minSaida > 59) {
            System.out.println("Horário inválido");
        } else {
            int chegadaMinutos = horaChegada * 60 + minChegada;
            int saidaMinutos = horaSaida * 60 + minSaida;

            if (saidaMinutos < chegadaMinutos) {
                System.out.println("Horário inválido");
            } else {
                int tempo = saidaMinutos - chegadaMinutos;
                int horasCobradas;

                if (tempo < 30) {
                    horasCobradas = 1;
                } else {
                    horasCobradas = tempo / 60;
                    if (tempo % 60 >= 30) {
                        horasCobradas++;
                    }
                    if (horasCobradas == 0) {
                        horasCobradas = 1;
                    }
                }

                double preco;

                switch (horasCobradas) {
                    case 1:
                        preco = 5.0;
                        break;
                    case 2:
                        preco = 10.0;
                        break;
                    case 3:
                        preco = 17.5;
                        break;
                    case 4:
                        preco = 25.0;
                        break;
                    default:
                        preco = 25.0 + (horasCobradas - 4) * 10.0;
                }

                System.out.println("Preço cobrado = R$" + String.format("%.2f", preco).replace('.', ','));
            }
        }

        scanner.close();
    }
}