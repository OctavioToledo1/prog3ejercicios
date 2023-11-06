import javax.swing.plaf.IconUIResource;
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        System.out.printf("BIENVENIDO");
        System.out.println("---------------------");

        String[] dna = {"ATGCTA", "CAGTGC", "TTATGT", "AGAAGG", "TTCCTA", "TCACTG"};
        //String[] dna2 = {"AAAGTA", "CATGGC", "TTACGT", "AGTAGG", "TTCCTA", "TCACTG"};
         //String[] dna3 = {"ATTTTA", "CAACGC", "TTTAGT", "AGGGGG", "TGGTTA", "TTTCTG"};
        // String[] dna4 = {"ATAATA", "CAGCGG", "AAACGT", "AGATGG", "TTAATA", "TCAGGG"};
        // String[] dna5= = {"AAACTA", "CTACGC", "GGACGT", "CCCCGG", "TAACTA", "TCAAGG"};
        // String[] dna6 = {"ATGCTA", "CAGCGC", "TTACGT", "AGACGG", "TTCCTA", "TCACTG"};

        boolean esMutante = isMutant(dna);
        System.out.println("¿Es mutante? " + esMutante);




    }
    public static boolean isMutant(String[] dna) {
        int n = dna.length;
        char[][] matrix = new char[n][n];
        int count = 0; // Contador de secuencias encontradas

        // Convertir el array de Strings en una matriz de caracteres
        for (int i = 0; i < n; i++) {
            matrix[i] = dna[i].toCharArray();
        }

        // Verificar secuencias horizontales y verticales
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char aux = matrix[i][j];

                // Verificar secuencia horizontal
                if (j + 3 < n && matrix[i][j + 1] == aux && matrix[i][j + 2] == aux && matrix[i][j + 3] == aux) {
                    count++;
                }

                // Verificar secuencia vertical
                if (i + 3 < n && matrix[i + 1][j] == aux && matrix[i + 2][j] == aux && matrix[i + 3][j] == aux) {
                    count++;
                }
            }
        }

        // Verificar secuencias diagonales (de arriba izquierda a abajo derecha)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char aux = matrix[i][j];

                // Verificar diagonal hacia abajo y hacia la derecha
                if (i + 3 < n && j + 3 < n && matrix[i + 1][j + 1] == aux && matrix[i + 2][j + 2] == aux && matrix[i + 3][j + 3] == aux) {
                    count++;
                }
            }
        }

        // Verificar secuencias diagonales (de arriba derecha a abajo izquierda)
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                char aux = matrix[i][j];

                // Verificar diagonal hacia abajo y hacia la izquierda
                if (i + 3 < n && j - 3 >= 0 && matrix[i + 1][j - 1] == aux && matrix[i + 2][j - 2] == aux && matrix[i + 3][j - 3] == aux) {
                    count++;
                }
            }
        }

        // Si se encuentran más de una secuencia de cuatro letras iguales, devuelve true
        return count >= 2;
    }

}

