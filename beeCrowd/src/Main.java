import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // entradas; hTrabalhasMes, valorHora
        // saida: salarioMes
        // processo= if(hTrabalhasMes <= 160){
        // salarioMes = hTrabalhasMes * valorHora
        // }else{
        // salarioMes = (160 * valorHora) + ((hTrabalhasMes - 160) * valorHora * 1.5)
        // }

        Scanner s = new Scanner(System.in);
        System.out.println("Digite as horas trabalhadas no mês: ");
        int hTrabalhas = s.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        int valorHora = s.nextInt();
        int horaMes = 160;
        double salario = hTrabalhas * valorHora;
        if (hTrabalhas > horaMes) {
            double horaExtra = hTrabalhas - horaMes;
            double valorExtra = horaExtra * (valorHora * 0.5);
            salario = salario + valorExtra;
        }

        System.out.println("O salário do mês é: " + salario);

        s.close();

    }

}
