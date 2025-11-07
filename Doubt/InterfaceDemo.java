interface Shape {
    double area();
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public double area() {
        return length * breadth;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape s = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + s.area());
    }
}
