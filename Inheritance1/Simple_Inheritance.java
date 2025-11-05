/* 
Inheritance allows one class to acquire the properties (fields) and behaviors (methods) of another class.
It promotes code reusability and establishes an IS-A relationship between classes.
*/

/*
Stack Space Diagram:
JRE [Java Runtime Environment] -> Simple_inheritance Class
Child Class
Parent Class


Call Stack Diagram:
Simple_Inheritance.main()
   -> new Child() 2. 
       -> Child() Constructor 
           -> Parent() Constructor 1.
*/


class Parent {
    int x;
    Parent() {
        System.out.println("Parent class instantiated");
    }
    Parent(int x) {
        this.x = x;
        System.out.println("Parent class instantiated with value: " + x);
    }

    // additional fields and methods
    void display() {
        System.out.println("Value of x: " + x);
    }
}

class Child extends Parent {
    // additional fields and methods
    Child() {
        // super();
        System.out.println("Child class instantiated");
    }

    Child(int x) {
        // super(x);
        // if this line is not written, compiler will add super() as the first statement by default and call the default constructor of the parent class
        //  constructor overloading concept
        
        // System.out.println("Child class instantiated with value: " + x);
    }

    void display1() {
        System.out.println("Child class display method. Value of x: " + x);
    }
}

public class Simple_Inheritance {
    public static void main(String[] args) {
        Simple_Inheritance() {
            // Child childInstanceWithValue = new Child(20);

            /*
            Call Stack Diagram:
                Simple_Inheritance.main()           3.
                   -> new Child()                   2. 
                       -> Child() Constructor 
                           -> Parent() Constructor  1.
*/
            */

        }

        // Child childInstance = new Child();
        // System.out.println("Child instance created: " + childInstance);

        // childInstance.x = 10;
        // childInstance.display();

        Child childInstanceWithValue = new Child(20);
        childInstanceWithValue.display();

    }
}