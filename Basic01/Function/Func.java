
import java.util.*;

public class Func{
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static int age(int age){
        return age;
    }

    


    public static int calculateProduct(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of 2 numbers is :  "+calculateProduct(a, b));
        int age = sc.nextInt();
        int myAge = age(age);
        System.out.println("age: "+myAge);
    }
}