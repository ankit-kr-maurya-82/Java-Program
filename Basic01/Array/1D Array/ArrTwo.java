
import java.util.Scanner;

public class ArrTwo {

    public static void main(String[] args) {

        System.out.print("Input size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.print("Enter the number: ");
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println("output : " + numbers[i]);
        }

        // Linear Search
        System.out.print("Find the number: ");
        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == x){
                System.out.print("x found at index : "+ i);
            }
        }

    }
}
