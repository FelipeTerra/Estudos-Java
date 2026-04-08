package Program;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz: ");
        int n = sc.nextInt();
        int [][] matriz = new int[n][n]; //instanciando a matriz

        //rodando a matriz e gravando cada número dentro das posições i e j
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        //imprimindo a diagonal principal
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
            System.out.println();
        }
        System.out.println("--------------------------");

        //cotando apenas os números negativos
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de números negativos: " + cont);

        sc.close();

    }
}
