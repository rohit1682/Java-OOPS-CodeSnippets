package PrivateModifier;

public class Person {
    private int age = 25;

    private void displayAge() {
        System.out.println("Age: " + age);
    }

    public void show() {
        displayAge(); // ✅ Allowed within same class
    }
}
