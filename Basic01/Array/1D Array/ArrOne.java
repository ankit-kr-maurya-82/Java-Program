
import java.util.Scanner;

class ArrOne{
    public static void main(String[] args) {
        System.out.print("Input Size:");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Input  number ------------");
        for (int i = 0; i < size; i++) {
            number[i]= sc.nextInt();
        }

        System.out.println("Output---------------");

        for (int i = 0; i < size; i++) {
            System.out.println(i+": "+number[i]);
        }
    }
}