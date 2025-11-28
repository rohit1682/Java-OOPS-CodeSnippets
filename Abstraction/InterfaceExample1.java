/*
 Example showing how interfaces provide abstraction in Java.
 - Animal is an interface (abstract contract).
 - Dog and Cat implement the contract.
 - InterfaceDemo demonstrates polymorphism via interface references,
    a default method, a static method, constants, and an anonymous implementation.
*/

interface Animal {
     String TYPE = "Mammal"; // public static final

     void eat();             // public abstract
     void makeSound();       // public abstract

     // default method with a shared implementation
     default void sleep() {
          System.out.println("Animal is sleeping (default)");
     }

     // static helper method on the interface
     static void info() {
          System.out.println("Interfaces provide abstraction and polymorphism");
     }
}

class Dog implements Animal {
     @Override
     public void eat() {
          System.out.println("Dog eats bones");
     }

     @Override
     public void makeSound() {
          System.out.println("Woof");
     }

     @Override
     public void sleep() { // override default
          System.out.println("Dog sleeps in its kennel");
     }
}

class Cat implements Animal {
     @Override
     public void eat() {
          System.out.println("Cat eats fish");
     }

     @Override
     public void makeSound() {
          System.out.println("Meow");
     }
     // uses default sleep()
}

public class InterfaceExample1 {
     public static void main(String[] args) {
          // Use the interface type to refer to different implementations
          Animal a1 = new Dog();
          Animal a2 = new Cat();

          Animal.info();                       // static interface method
          System.out.println("Type: " + Animal.TYPE);

          a1.eat(); a1.makeSound(); a1.sleep();
          a2.eat(); a2.makeSound(); a2.sleep();

          // Anonymous implementation of the interface
          Animal bird = new Animal() {
                @Override public void eat() { System.out.println("Bird pecks seeds"); }
                @Override public void makeSound() { System.out.println("Chirp"); }
          };
          bird.makeSound();
          bird.eat();
     }
}