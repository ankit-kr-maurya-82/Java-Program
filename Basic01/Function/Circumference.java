
import java.util.Scanner;

// write a function that takes in the radius as input and returns the  circumference of a circle

class Circumference{
    public static int circumference(int r){
        Double pi= 3.14;
        System.out.println("circumference of circle: "+ 2 * pi * r);
        return r;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r= sc.nextInt();
        circumference(r);
    }
}