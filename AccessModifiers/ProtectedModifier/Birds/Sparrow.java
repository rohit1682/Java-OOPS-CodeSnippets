package ProtectedModifier.Birds;

import ProtectedModifier.Animals.Bird;

public class Sparrow extends Bird {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.fly(); // ✅ Works because Sparrow is a subclass
    }
}