package aritmetica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite a Quantidade de milhas marítimas: ");
        int milhasMaritimas = scanner.nextInt();
        scanner.close();
        double conversorKm = milhasMaritimas * 1.852;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(milhasMaritimas + " milhas marítimas valem " + df.format(conversorKm) + " Km ");



    }
}
