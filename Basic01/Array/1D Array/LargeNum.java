
import java.util.Scanner;


class LargeNum{

    
    public static void main(String[] args){
        System.out.print("Input size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        // input num
        System.out.println("Enter number: ");
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        } 

        // output num
        for(int i=0; i<size; i++){
            System.out.print(num[i]+" ");
        }

        System.out.println("");

        // Searching

        System.out.print("Search number: ");
        int search = sc.nextInt();

        // find
        System.out.print("search number:");
        for(int i=0; i<size; i++){
            if(search  == num[i]){
                System.out.println(num[i]);
            }
        }

    }
}