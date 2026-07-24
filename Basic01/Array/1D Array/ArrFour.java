
import java.util.Scanner;

class ArrFour{
    public static void main(String[] args) {

        System.out.print("Input size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        // input
        System.out.print("Enter a number: ");
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println(i+": "+ num[i]);
        
        }
        
    
    }
}