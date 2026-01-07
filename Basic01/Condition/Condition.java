
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        // boolean isSunUp = false;
        // if(isSunUp == true){
        //     System.out.println("day");
        // }else{
        //     System.out.println("night");
        // }

        // int age = 3;
        // if(age > 18){
        //     System.out.println("can vote");
        // }else{
        //     System.out.println("cannot vote");
        // }


        // Scanner sc = new Scanner(System.in);

        // int cash = sc.nextInt();
        // if(cash < 10){
        //     System.out.println("cannot buy anything");
        //     System.out.println("get more cash");
        // }
        // else if(cash > 10 && cash < 50){
        //     System.out.println("can get 1 thing");
        // }
        // else{
        //     System.out.println("can get both");
        // }

        Scanner sc = new Scanner(System.in);

        int cash = sc.nextInt();
        if(cash<10){
            System.out.println("can get 1 thing");
            System.out.println("get more cash");
        }else if(cash>10 && cash<50){
            System.out.println("can get 1 thing");
        }else{
            System.out.println("can get both");
        }
    }
}