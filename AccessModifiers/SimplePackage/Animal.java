package SimplePackage;
// always the folder name will be the package name

// ekta package er moddhe onek class thakte pare jei classes gulo either extend hote pare ba na o hote pare. but file er name shob somoy file er entry point package er name e hbe

class LivingBeing {
    // default access modifier
    void breathe() {
        System.out.println("Living being is breathing.");
    }
}

public class Animal extends LivingBeing {
    String name;
    int age;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// only the entry point class will be exported when we import the package. no other class can be instantiated from outside the package unless it is public

// Multiple classes can be defined in a single file, but only one class can be public and the file name must match the public class name.