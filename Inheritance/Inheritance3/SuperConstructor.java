/*
 * Superclass: Animal
 * - has protected fields so subclasses can access them
 * - several constructors to show how super(...) picks them
 */
class Animal {
	protected String name;
	protected int age;

	public Animal() {
		this("Unnamed", 0);
		System.out.println("Animal(): default constructor");
	}

	public Animal(String name) {
		this(name, 0);
		System.out.println("Animal(String): name constructor");
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Animal(String, int): full constructor");
	}

	public void describe() {
		System.out.println("Animal -> name: " + name + ", age: " + age);
	}

	public void speak() {
		System.out.println("Animal makes a sound.");
	}
}

/*
 * Subclass: Dog
 * - calls super(name) in its constructor
 * - overrides describe() and calls super.describe()
 * - accesses super.name to illustrate field access
 */
class Dog extends Animal {
	protected String breed;

	public Dog(String name) {
		super(name); // calls Animal(String)
		this.breed = "Unknown";
		System.out.println("Dog(String): called super(name)");
	}

	@Override
	public void describe() {
		System.out.print("Dog.describe() -> ");
		super.describe(); // reuse parent behaviour
		System.out.println(" (breed: " + breed + ")");
	}

	public void printInfo() {
		System.out.println("Using super.name: " + super.name); // access protected field
		describe();
		super.speak(); // call parent method
	}
}

/*
 * Subclass: Bulldog extends Dog
 * - demonstrates that super(...) can chain through multiple levels
 * - overrides speak() and describe(), but still calls super.describe()
 */
class Bulldog extends Dog {
	public Bulldog(String name, int age) {
		super(name); // calls Dog(String) which calls Animal(String)
		super.age = age; // set inherited field directly (protected)
		this.breed = "Bulldog";
		System.out.println("Bulldog constructor: set breed and age");
	}

	@Override
	public void speak() {
		System.out.println("Bulldog barks loudly!");
	}

	@Override
	public void describe() {
		System.out.print("Bulldog.describe() -> ");
		super.describe(); // calls Dog.describe(), which calls Animal.describe()
	}
}

/*
 * Subclass: Puppy shows another use of super(...) in a no-arg constructor
 */
class Puppy extends Dog {
	public Puppy() {
		super("Tiny"); // calls Dog(String)
		this.age = 0;
		this.breed = "PuppyBreed";
		System.out.println("Puppy(): default puppy constructor");
	}
}


/**
 * Demonstrates the use of the `super` keyword in Java:
 * - calling a superclass constructor with super(...)
 * - accessing a superclass field with super.field
 * - invoking a superclass method with super.method(...)
 * - using super in overridden methods
 *
 * To compile (from Windows bash):
 *   javac "e:/Code/Java-OOPS-CodeSnippets/Inheritance3/SuperConstructor.java"
 * To run:
 *   java -cp "e:/Code/Java-OOPS-CodeSnippets/Inheritance3" SuperConstructor
 */
public class SuperConstructor {
	public static void main(String[] args) {
		System.out.println("Example 1: super() calls");
		Dog d1 = new Dog("Buddy");
		d1.printInfo();

		System.out.println("\nExample 2: calling superclass method with super");
		Bulldog b = new Bulldog("Max", 5);
		b.printInfo();

		System.out.println("\nExample 3: multiple constructors and super()");
		Puppy p = new Puppy();
		p.printInfo();
	}
}
