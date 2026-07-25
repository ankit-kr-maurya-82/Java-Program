
import java.util.Scanner;

 

class ArrFour{

   public static int delete(int arr[], int size, int pos){
        for(int i=pos-1; i<size-1; i++){
            arr[i] = arr[i+1];
        }

        return size -1;
    }
    public static void update(int arr[], int size, int pos, int value) {
        arr[pos-1]=value;
    }


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

        // delete

        System.out.println("Enter position to delete: ");
        int pos = sc.nextInt();

        if(pos < 1 || pos > size){
            System.out.println("Invalid");
        }else{
           size = delete(num, size, pos);
            
            System.out.println("Array after deletion: ");
            for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
            }
        }

        // update
        System.out.println("\nEnter position to update: ");
        pos = sc.nextInt();

        if(pos < 1 || pos > size){
            System.out.println("Invalid");
        }else{
           System.out.print("Enter value: ");
           int value = sc.nextInt();

           update(num, size, pos, value);

           System.err.println("Array after update");

           for (int i = 0; i < size; i++) {
                System.out.print(num[i] + " ");
            }
        }



        
    
    }
}