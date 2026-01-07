
import java.util.*;




public class MiniCal{
    public static int addNum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static int subNum(int a, int b) {
        int sub = a-b;
        return sub;
    }

     public static int multNum(int a, int b) {
        int mult = a*b;
        return mult;
    }
     public static int divNum(int a, int b) {
        int div = a/b;
        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first_num = sc.nextInt();
        System.out.print("Enter second number: ");
        int second_num = sc.nextInt();
        System.out.println("---------------------------");
        System.out.println("addition = 0");
        System.out.println("substraction = 1");
        System.out.println("multiply = 2");
        System.out.println("divide = 3");
        System.out.println("---------------------------");
        System.out.print("Enter sign to calculate: ");
        int sign = sc.nextInt();
        
        if(sign == 0){
            int result = addNum(first_num, second_num);  
            System.out.println("sign: +"); 
            System.out.println("result: "+ result);
        } else if(sign == 1){
            int result = subNum(first_num, second_num);  
            System.out.println("sign: -");  
            System.out.println("result: "+ result);
        } else if(sign == 2){
            int result = multNum(first_num, second_num);   
            System.out.println("sign: *"); 
            System.out.println("result: "+ result);
        } else if(sign == 3){
            int result = divNum(first_num, second_num); 
            System.out.println("sign: /");   
            System.out.println("result: "+ result);
        }else{
            System.out.println("Invalid sign");
        }
    }
    
}