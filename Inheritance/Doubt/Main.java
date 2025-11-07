class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
    void show() { System.out.println("Parent show"); }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
    void show() { System.out.println("Child show"); }
    void display() { System.out.println("Child display"); }
}

public class Main {
    public static void main(String[] args) {
        Parent ob1 = new Child();
        ob1.show();     // ✅ allowed (Parent method)
        // ob1.display(); // ❌ not allowed (Parent reference doesn’t know this)
    }
}