
import java.util.Scanner;



public class ArrOne{
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 33;
        // marks[1] = 78;
        // marks[2] = 98;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        // input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        
        // output
        for(int i=0; i<size; i++){
            System.out.println("num: "+numbers[i]);
        }
     

    }
}