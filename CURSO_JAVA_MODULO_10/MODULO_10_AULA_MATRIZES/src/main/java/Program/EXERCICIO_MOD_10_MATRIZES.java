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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Informe um valor que desjesa procurar");
        int valor = sc.nextInt();

        //procurando o valor
        boolean buscador = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == valor) {
                    buscador = true;
                }
            }
        }
        if (buscador == false) {
            System.out.print("Valor não encontrado na matriz");
        }
        else {
            System.out.print("Valor encontrado na matriz");
        }

        sc.close();
    }
}
