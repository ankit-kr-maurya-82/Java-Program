
import java.util.Scanner;

// package bank;
// Encapsulation


class Account{
    public String name;
    protected String email;
    private String password;

    // getters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}


class Student{
    String name;
    String course;
    int rollNo;
}

public class Encapsulation{
    public void main(){
        Account account1 = new Account();
        account1.name = "Ankit";
        account1.email = "ankit@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

        Student student1 = new Student();
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        student1.name = Name;
        System.err.println("name: "+ student1.name);

    }
}