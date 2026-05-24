
import java.util.Scanner;

// write a function which  takes  in 2 numbers and returns the greater of those two

class QsThree{
    public static int greaterNumber(int a, int b){
        
        if(a>b){
            System.out.println(a+" is a greater number");
        }else if(b>a){
            System.out.println(b+" is a greater number");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
        greaterNumber(a, b);
    }
}