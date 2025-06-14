package aritmetica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        //Conversão de Celsius para Fahrenheit//

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura em  Celsius: ");
        double celsius = scanner.nextDouble();

        scanner.close();

        double conversao = celsius * 1.8 + 32;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(celsius + "°C equivalem a " + df.format(conversao) + "°F.");


    }
}
