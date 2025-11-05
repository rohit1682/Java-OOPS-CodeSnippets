// Code to understand multi level inheritance in java

class GrandParent {
    void showGrandParent() {
        System.out.println("This is the GrandParent class");
    }
}
class Parent extends GrandParent {
    void showParent() {
        System.out.println("This is the Parent class");
    }
}
class Child extends Parent {
    void showChild() {
        System.out.println("This is the Child class");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.showGrandParent(); // Inherited from GrandParent
        child.showParent();      // Inherited from Parent
        child.showChild();       // From Child class
    }
}