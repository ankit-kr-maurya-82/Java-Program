
class Student {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(this.name);
    }

    public void printInfo(int age){
        System.out.println(this.age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}

class Polymorphism {
    public  void main() {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 12;

        s1.printInfo(s1.name, s1.age);
    }
}