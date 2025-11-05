class Parent {
    int num = 100;

    void update() {
        num = 50;
    }
}

class Child extends Parent {
    //overrideing variable. If this variable is not present, it will refer to parent's variable
    int num = 200;

    void display() {
        System.out.println("Child num: " + num);          // refers to child's variable
        System.out.println("Parent num: " + super.num);    // refers to parent's variable
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
