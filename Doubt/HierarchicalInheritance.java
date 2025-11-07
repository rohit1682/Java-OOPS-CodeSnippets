class Shape {
    double length;
    double breadth;

    void getData(double l, double b) {
        length = l;
        breadth = b;
    }
}

class Rectangle extends Shape {
    double area() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double area() {
        return 0.5 * length * breadth;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();

        rect.getData(10, 5);
        tri.getData(10, 5);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
    }
}
