package aritmetica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        //Cotação do Dólar//

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Qual a cotação do dólar em Relação a nossa bela e forte moeda Reais?: ");
        double cotacao = scanner.nextDouble();

        System.out.println("Quantos Dólares você possui?: ");
        double dolarCarteira = scanner.nextDouble();

        double convertidoReal =  dolarCarteira * cotacao;

        scanner.close();

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(" Você possui " + df.format(convertidoReal) +" Reais " + "que equivalem a " + df.format(dolarCarteira) + " Dólares " + " Com a cotação do Dólar em " + df.format(cotacao)) ;
    }
}
