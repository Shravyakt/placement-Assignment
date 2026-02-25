
class Calculator {

    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {

    // Overriding method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class overloadingoverriding {

    public static void main(String[] args) {

        // Demonstrating Method Overloading
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));

        // Demonstrating Method Overriding
        Animal a = new Cat();  // Parent reference, child object
        a.sound();
    }
}
