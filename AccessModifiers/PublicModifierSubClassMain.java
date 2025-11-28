import PublicModifier.Animal;

public class PublicModifierSubClassMain extends Animal {
    
    // public static void main(String[] args) {
    //     PublicModifierSubClassMain subClass = new PublicModifierSubClassMain();
    //     subClass.sound(); // Calling inherited method from Animal class
    // }

    void display() {
        sound();
    }
}
