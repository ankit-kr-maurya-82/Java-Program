
import java.util.Scanner;

public class ArrTwo {

    public static void main(String[] args) {

        System.out.println("Input size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the number: ");
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println("output : " + numbers[i]);
        }

        // Linear Search
        System.out.println("Find the number: ");
        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == x){
                System.out.println("x found at index : "+ i);
            }
        }

    }
}
