// Parent class
class Animal {
    // Method in the parent class
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Method in the child class
    public void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test single inheritance
public class Exam5 {
    public static void main(String[] args) {
        // Create an object of the child class
        Dog myDog = new Dog();

        // Call methods from both parent and child classes
        myDog.eat(); // Inherited method from Animal
        myDog.bark(); // Method of Dog class
    }
}