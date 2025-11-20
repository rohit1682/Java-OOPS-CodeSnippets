// Parent generic abstract class
abstract class Animal {

    // Abstract method (no implementation)
    abstract void sound();

    // Normal method (with implementation)
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

// Main class
public class AbstractClassExample1 {
    public static void main(String[] args) {
        
        // Animal a = new Animal(); // ❌ Not allowed (abstract class)

        Animal dog = new Dog();
        dog.sound();   // Dog's implementation
        dog.sleep();   // Inherited method

        Animal cat = new Cat();
        cat.sound();   // Cat's implementation
        cat.sleep();   // Inherited method
    }
}
