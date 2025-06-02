package aritmetica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        float valor1,valor2,valor3,valor4;

        System.out.println("Digite o valor 1: ");
        valor1 = scanner.nextFloat();

        System.out.println("Digite o valor 2: ");
        valor2 = scanner.nextFloat();

        System.out.println("Digite o valor 3: ");
        valor3 = scanner.nextFloat();

        System.out.println("Digite o valor 4: ");
        valor4 = scanner.nextFloat();

        float media = (valor1+valor2+valor3+valor4)/4;

        scanner.close();

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("A média dos números é: " + df.format(media));






    }
}
