class GrandParent {
    GrandParent() {
        System.out.println("GrandParent Constructor");
    }
    GrandParent(int x) {
        System.out.println("GrandParent Constructor with value: " + x);
    }
}   

class Parent {
    /*
     * If the parent class does not have a default constructor (a constructor with no parameters), and 
     * the child calls the parent constructor using super() without arguments, it will not throw an error.
     * the compiler created an empty default constructor for the parent class. 
    */

    Parent() {
        System.out.println("Parent Constructor");
    }
    Parent(int x) {
        // super();
        System.out.println("Parent Constructor with value: " + x);
    }
}

class Child extends Parent {
    Child() {
        super(); // calls Parent's constructor
        System.out.println("Child Constructor");
    }
    Child(int x) {
        super(x); // calls Parent's constructor with parameter
        System.out.println("Child Constructor with value: " + x);
    }
}


public class ConstructorExample {
    
}
