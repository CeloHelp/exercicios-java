package aritmetica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        // Nota para aprovação //



        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite a nota da P1: ");
        double n1 = scanner.nextDouble();

        scanner.close();

        while (n1 < 0 || n1 > 10) {
            System.out.println("Digite uma nota válida entre 1 e 10: ");
            n1 = scanner.nextDouble();
        }

        double necessarioP2 = 10 - n1;

        DecimalFormat df = new DecimalFormat("0.0");


        System.out.println("Para o Aluno passar ele tem que tirar: " + df.format(necessarioP2) + " Em sua P2 ");




    }
}
