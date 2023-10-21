package exerciciosNelioAlves.secao10_memoria_arrays_listas.aula103;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrix
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        // Read the matrix values
        int[][] matrix = new int[M][N];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Read the value to search for
        System.out.print("Enter the value to search (X): ");
        int X = scanner.nextInt();

        // Find and display the neighboring values
        boolean found = false;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == X) {
                    System.out.println("Value found at position (" + i + ", " + j + ")");
                    System.out.println("Neighboring values:");
                    // Check left
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    // Check above
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    // Check right
                    if (j < N - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    // Check below
                    if (i < M - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Value not found in the matrix.");
        }

        scanner.close();
    }
}
