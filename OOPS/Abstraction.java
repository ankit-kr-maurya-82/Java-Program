abstract class Animal{
    abstract void walk();

    public Animal() {
        System.out.println("You are creating a new Animal");
    }
    
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Create a Horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends  Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

class Abstraction{
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}