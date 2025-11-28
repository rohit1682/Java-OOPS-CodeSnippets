interface A {
    default void display() {
        System.out.println("Interface A");
    }
}

interface B extends A {
    default void display() {
        System.out.println("Interface B");
    }
}

interface C extends A {
    default void display() {
        System.out.println("Interface C");
    }
}

class Diamond implements B, C {
    @Override
    public void display() {
        B.super.display();  // Explicitly resolve diamond problem
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        Diamond d = new Diamond();
        d.display();  // Output: Interface B
    }
}