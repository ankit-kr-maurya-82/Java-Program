// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

class ArrThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];

        System.out.println("Input---------------------");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        System.out.println("Output---------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i+1+": "+names[i]);
        }
    }
}