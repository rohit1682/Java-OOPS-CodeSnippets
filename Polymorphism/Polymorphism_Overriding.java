// code to define run time polymorphism in java
class Animal {
    String name;
    int age;

    Animal() {
        System.out.println("Animal class instantiated");
    }

    public void eats() {
        System.out.println("Animal eats food");
    }

    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog class instantiated");
    }

    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    Cat() {
        System.out.println("Cat class instantiated");
    }

    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism_Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        Animal myDog = new Dog();       // Create a Dog object as an Animal
        Animal myCat = new Cat();       // Create a Cat object as an Animal

        myDog.name = "mugu";
        myCat.name = "tom";

        // myAnimal.sound(); // Calls the Animal's sound method
        // myDog.sound();    // Calls the Dog's overridden sound method
        // myCat.sound();    // Calls the Cat's overridden sound method
    }
}