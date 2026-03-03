/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaconcepts;
    // Abstract class
abstract class Shape {
    // Abstract method
    abstract double area();
}

// Circle class inheriting Shape
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing area method
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class inheriting Shape
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing area method
    double area() {
        return length * width;
    }
}

public class Main {
    
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Rectangle: " + s2.area());
    }
}

