package estruturadedados;

public class ArrayDuplicado  {
    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,1};

        for(int i=0;i<numeros.length-1;i++){
            for(int j=i+1;j<numeros.length;j++){
                if(numeros[i] == numeros[j]){
                    System.out.println( "Número duplicado: " + numeros[i]);
                }
            }
        }

    }
}
