
class Parent {
    void showParent() {
        System.out.println("Parent class");
    }
}

class Child1 extends Parent {
    void showChild1() {
        System.out.println("Child1 class");
    }
}

class Child2 extends Parent {
    void showChild2() {
        System.out.println("Child2 class");
    }
}

public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        c1.showParent();
        c2.showParent();
    }
}