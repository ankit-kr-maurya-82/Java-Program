import java.util.*;

public class Qs{
    // Enter 3 numbers from the user & make a function to print their average;
    public static int average(int a, int b, int c){
        int sum=a+b+c;
        int avg=sum/3;
        System.out.println("average of 3 numbers: "+avg);
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        average(a,b,c);
    }
}