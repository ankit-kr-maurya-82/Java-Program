
import java.util.*;
    // camelCase - java
    // print_name - python
public class Func{

    // my function create
    public static void myName(String name){
        System.out.println(name);
        return;
    }
        

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       myName(name);  //call
    }
}