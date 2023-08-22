package lista1;

import java.util.*;

public class questao4 {

    public static void main(String[] args) {
        // 4 - Crie uma matriz 5x5 preenchida aleatoriamente. Selecione o maior e
        // imprima o valor na tela
        int[][] matriz = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(50);

                System.out.println(matriz[i][j] + " ");

            }
            System.out.println();
            System.out.println("-------");

        }
    }
}