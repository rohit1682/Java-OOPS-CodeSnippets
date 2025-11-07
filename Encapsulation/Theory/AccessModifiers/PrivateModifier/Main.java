package PrivateModifier;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        // p.displayAge(); // ❌ Not allowed
        p.show(); // ✅ Works through public method
    }
}
