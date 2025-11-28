package PrivateModifier;

public class Person {
    private int age = 25;

    // getter method to access private variable
    public int getAge() {
        return age; // ✅ Allowed within same class
    }

    // setter method to modify private variable
    public void setAge(int age) {
        this.age = age; // ✅ Allowed within same class
    }

    private void displayAge() {
        System.out.println("Age: " + age);
    }

    public void show() {
        displayAge(); // ✅ Allowed within same class
    }
}
