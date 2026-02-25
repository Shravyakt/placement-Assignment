
    
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Derived class (Single Inheritance)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}
public class Inheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Calling method of base class
        d.eat();

        // Calling method of derived class
        d.bark();
    }
}
    
