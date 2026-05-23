import java.util.*;
public class Main {
    public static void main(String args[]){
        // System.out.println("Hello World");
        // System.out.println("Hello World");

        // variable
        // String name= "Ankit";
        int a=20;
        int b=30;
        // output
        // System.out.println(b);
        b=3;
        // System.out.println(b);  
        // System.out.print("ankit \nkumar");

        // data type
        // 8bits = 1byte
        // primitive - byte, short, char[2], boolean[1], int[4], long[8], float[4], double[8]
        // non-primitive - String, Array, Class, Object, Interface

         a=10;
         b=5;
        int ans =(a*b)/(a-b);
        // System.out.println(ans);

        // input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // nextInt()
        // nextFloat()
        // System.out.println("name: "+name);
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int sum = num1+num2;
        System.out.println("sum: "+ sum);
    }
}