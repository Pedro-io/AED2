/*3 - Leia 10 n ́umeros inteiros em um vetor, selecione o maior e imprima o valor na tela.*/
package lista1;
import java.util.Random;

public class questao3 {
    public static void main(String[] args) {
        Random random = new Random(); 
        int[] v = new int[10];
        int maior = 0;

        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(50);
            System.out.print(v[i] + " "); // Apenas para visualização dos valores gerados
        }

        // Encontrar o maior valor
        for (int i = 0; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }

        System.out.println("\n###########################");
        System.out.println("O maior número neste vetor é " + maior);
    }
}
