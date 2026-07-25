
import java.util.Scanner;



class SearchingArray{

    public static void search(int arr[], int size, int key){
        for(int i=0; i<size; i++){
             if (arr[i] == key) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a Input size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        // input
        System.out.print("Enter number: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }


        // searching
        System.out.print("\nEnter Search number: ");
        Scanner search = new Scanner(System.in);
        int key = search.nextInt();

        search(num, size, key);


    }
}