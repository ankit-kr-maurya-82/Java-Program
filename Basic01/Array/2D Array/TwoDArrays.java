
import java.util.Scanner;

public class TwoDArrays{
    public static void main(String[] args) {  
    //    2D Arrays
        // |5|3|4|1|
        // |7|8|3|9|
        // |6|7|4|6|
        // rows = 3
        // colums = 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter numbers of columns :");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // rows
        System.out.println("Enter the number in matrix: ");
        for(int i=0; i<rows; i++){
            // columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }


        System.out.println("Output Matrix: ");
        // output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}