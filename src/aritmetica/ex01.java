package aritmetica;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        //Área do quadrado//
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o valor do lado do Quadrado: ");
        double lado = scanner.nextDouble();



        double areaQuadrado = (lado*lado);

        System.out.println("A área do quadrado é: " + areaQuadrado);



    }
}
