package estruturadedados;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numerosDesejados = new int [20];
        int valorDesejado;
        int numeroPesquisa;
        String resposta = "S";


        do {
            System.out.println(" Digite o Valor Desejado para Armazenar (Máximo 20) : ");
            valorDesejado = scanner.nextInt();
        }
        while (valorDesejado < 1 || valorDesejado > 20);

        System.out.println(" Digite " + valorDesejado + " valores para Armazenar: ");

        for(int i = 0; i <  valorDesejado;i++) {

            numerosDesejados[i] = scanner.nextInt();






        }

       do {

           boolean encontrado = false;

           System.out.println("Qual número deseja saber o Index?: ");

           for (int i = 0; i < valorDesejado; i++) {
               System.out.println(numerosDesejados[i]);
           }

           numeroPesquisa = scanner.nextInt();
           for (int i = 0; i < valorDesejado; i++) {

               if (numerosDesejados[i] == numeroPesquisa) {
                   System.out.println( "Index: " + i + " - " + "Número: " + numeroPesquisa);

                encontrado = true;
                break;
               }




           }

           if(!encontrado){
               System.out.println("Valor não encontrado!");
           }



           System.out.println("Deseja Fazer outra Pesquisa? (S/N) ");
           resposta = scanner.next();

       }
       while (resposta.equalsIgnoreCase("S"));

        System.out.println("Programa finalizado");

        scanner.close();











































    }
}
