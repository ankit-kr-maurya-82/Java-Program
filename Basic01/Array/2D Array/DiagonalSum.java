
import java.util.Scanner;

class DiagonalSum{
    public static void main(String args[]){
        // 2. Write  a program to input 3x3 matrix and print diagonal elements also sum of these elements
        Scanner sc = new Scanner(System.in);
        int rows= 3;
        int cols = 3;
        int sum=0;
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter number: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Output: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Diagonal Matrix:");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][i] + " ");
            sum +=matrix[i][i];
        }
        System.out.println("\nSum of diagonal elememts: " + sum);
    }
}