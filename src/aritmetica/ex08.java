package aritmetica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        // compra e troco //



        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de 5  Produtos: ");
        double valor1 = scanner.nextDouble();
        double valor2 = scanner.nextDouble();
        double valor3 = scanner.nextDouble();
        double valor4 = scanner.nextDouble();
        double valor5 = scanner.nextDouble();

        double valorTotal = valor1 + valor2 + valor3 + valor4 + valor5;


            System.out.println("O valor total da compra foi de: " + valorTotal);

            System.out.println("Digite o valor utilizado para pagar a compra: ");
            double pagamento = scanner.nextDouble();

            scanner.close();

            if(valorTotal > pagamento){
                System.out.println("Pagamento insuficiente. Por favor, verifique os valores.");
                return;
            }

            double troco = pagamento - valorTotal;



          DecimalFormat df = new DecimalFormat("0.00");
          System.out.println("O troco para sua compra é de " + df.format(troco) + " Reais ");

















    }
}
