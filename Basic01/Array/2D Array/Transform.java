
import java.util.Scanner;

class Transform{
    public static void main(String args[]){
        // 1. Write a program to input a 2 dimensional array of 3x3 and transform it
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        int[][] transform = new int[rows][cols];

        System.out.print("Enter number: ");
        for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++) {
            matrix[i][j] = sc.nextInt();
           }
        }

        System.out.println("Output: ");
        for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++) {
            System.out.print(matrix[i][j] + " ");
           }
           System.out.println("");
        }  

        for(int i = 0; i<rows; i++)  {
            for(int j=0; j<cols; j++){
                transform[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transform: ");
        for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++) {
            System.out.print(transform[i][j] + " ");
           }
           System.out.println("");
        } 


    }
}