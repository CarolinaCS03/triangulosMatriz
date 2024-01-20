
package triangulosmatriz;
/*
@author CAROLINA CEVALLOS
 */
public class Matriz {
   
    // metodo para mostrar el triángulo A
    public static void imprimirTrianguloA(int n) {
        char[][] matriz = new char[n][n];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }
        // Rellenar la matriz con una letra en forma triángulo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = 'J';
            }
        }
        // Imprimir la matriz
        imprimirMatriz(matriz);
    }
    // Método para imprimir el triángulo B
    public static void imprimirTrianguloB(int n) {
        char[][] matriz = new char[n][n];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }
        // Rellenar la matriz con una letra en forma de triángulo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                matriz[i][j] = 'L';
            }
        }
        // Imprimir la matriz
        imprimirMatriz(matriz);
    }
    // metodo para imprimir una matriz de caracteres
    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}




