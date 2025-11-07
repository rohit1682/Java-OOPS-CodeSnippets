class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

public class FigureDemo {
    public static void main(String[] args) {
        Figure f;
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 5);

        f = r;
        System.out.println("Area of Rectangle: " + f.area());

        f = t;
        System.out.println("Area of Triangle: " + f.area());
    }
}
