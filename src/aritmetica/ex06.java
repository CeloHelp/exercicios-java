package aritmetica;


import java.text.DecimalFormat;
import java.util.Scanner;

public class ex06 {
    //Velocidade de um carro//

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade Inicial em m/s: ");
        double velocidadeInicial = scanner.nextDouble();

        System.out.println("Digite a aceleração em m/s²: ");
        double aceleracao = scanner.nextDouble();

        System.out.println("Digite o tempo em s: ");
        double tempo = scanner.nextDouble();

        scanner.close();

        double velocidadeFinal= (velocidadeInicial + aceleracao * tempo) * 3.6;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("A velocidade final é de: " + df.format(velocidadeFinal) + " KM/h ");


    }
}
