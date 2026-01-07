import java.util.*;

public class MiniProject{
    public static void main(String[] args) {
        // Mini Project

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.print("Guess my number : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("WOOHOO ... CORRECT NUMBER!!!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("your number is too large");
            }else{
                System.out.println("your number is too small");
            }
        } while(userNumber >= 0);
        System.out.println("My number was :  ");
        System.out.println(myNumber);
        
    }
}