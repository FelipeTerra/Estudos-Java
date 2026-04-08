package Program;

import java.util.Locale;
import java.util.Scanner;

public class EXERCICIO_MOD_10_MATRIZES {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas terá a matriz? ");
        int n = sc.nextInt();
        System.out.println("Quantas colutas terá a matriz? ");
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];

        System.out.println("Informe os valores da matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz gravada com sucesso");
        System.out.println();
        System.out.println("-----------------------------------");

        System.out.println("Informe um valor que desjesa procurar");
        int valor = sc.nextInt();
        System.out.println();
        System.out.println("-----------------------------------");

        //contando quantas vezes o valor aparece na matriz
        int contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == valor) {
                    contador ++;
                }
            }
        }

        //validando se o valor aparece na matriz
        if (contador == 0) {
            System.out.println("Valor não encontrado na matriz");
        } else {
            System.out.println("O valor aparece " + contador + " vezes ");

            //imprimindo todas as ocorrências
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matriz[i][j] == valor) {

                        System.out.println("\nPosição: [" + i + "][" + j + "]");

                        //esquerda
                        if(j > 0){
                            System.out.println("Valor a esquerda: " + matriz[i][j - 1]);
                        } else {
                            System.out.println("Não possui valor a esquerda");
                        }

                        //direita
                        if(j < m - 1){
                            System.out.println("Valor a direita: " + matriz[i][j + 1]);
                        } else {
                            System.out.println("Não possui valor a direita");
                        }

                        //acima
                        if(i > 0){
                            System.out.println("Valor acima: " + matriz[i - 1][j]);
                        }  else {
                            System.out.println("Não possui valor a acima");
                        }

                        //abaixo
                        if(i < m - 1){
                            System.out.println("Valor a abaixo: " + matriz[i + 1][j]);
                        }  else {
                            System.out.println("Não possui valor a abaixo");
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
