

public class Main {
    public static void main(String args[]){
        System.out.println("Hello World");
        // Variables
        // String name = "Ankit";
        String neighbour = "AKM";
        // int age = 22;
        String friend = neighbour;

        System.out.println(friend);

        // Datatypes
        // 1. Primitive types
        // byte - 1 [-128 to 127]
        // short - 2
        // int - 4
        // long - 8
        // float - 4
        // double - 8
        // char - 2
        // /boolean - 1 true/false

        // byte age = 30;
        // int phone = 1234567890;

        // 2. Non -primitive types
        String name = new String("harsh");
        System.out.println(name.length());
        // String
        // concatenate
        String name1 = "Aman";
        String name2 = "Harsh";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);
        // charAt
        System.out.println(name1.charAt(0));
        // length
        System.out.println(name1.length());
        // replace
        String name4 = name2.replace("a", "b");
        System.out.println(name4);
        // substring
    }
}