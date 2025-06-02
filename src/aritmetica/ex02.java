package aritmetica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // Volume da Esfera //
        Scanner scanner = new Scanner(System.in);

        System.out.println("Forneça do Diâmetro da Esfera: ");
        int diametro = scanner.nextInt();

        int raio = diametro / 2;

        double volumeMultiplicacao = 4 * Math.PI * Math.pow(raio, 3);

        double volumeTotal = volumeMultiplicacao / 3;

        scanner.close();

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("O volume da esfera é : " + df.format(volumeTotal));

    }
}
