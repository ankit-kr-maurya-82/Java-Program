
import java.util.Scanner;

// write a function to print the sum of all odd numbers from 1 to n.
class SumOdd {

    public static int sumOdd(int a){
        int sum = 0;
       for(int i=1;i<=a;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                sum+=i;
            }
       }
        System.err.println("");
        System.out.println("sum of odd num: "+sum);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        
        sumOdd(a);

    }
}
