import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculateVolume();
}

class Triangle extends Shape{
    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculateVolume() {
        return 0;
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculateVolume() {
        return 0;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }

    @Override
    double calculateVolume() {
        return 0;
    }
}

class Sphere extends Shape{
    double Radius;

    Sphere(double radius){
        this.Radius = radius;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * Radius * Radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Radius * Radius * Radius;
    }
}

class Cube extends Shape{
    double Length;

    Cube(double length){
        this.Length = length;
    }

    @Override
    double calculateArea() {
        return 6 * Length * Length;
    }

    @Override
    double calculateVolume() {
        return Length * Length * Length;
    }
}
public class ShapeCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape: 1. Triangle, 2. Circle, 3. Rectangle, 4. Sphere, 5. Cube");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the base and height of the triangle: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.print("Area of the triangle: " + triangle.calculateArea());
                break;

            case 2:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.print("Area of the circle:" + circle.calculateArea());
                break;

            case 3:
                System.out.print("Enter the length and breadth of the rectangle: ");
                double length = scanner.nextDouble();
                double breadth = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, breadth);
                System.out.print("Area of the rectangle: " + rectangle.calculateArea());
                break;

            case 4:
                System.out.print("Enter the radius of the Sphere: ");
                double Radius = scanner.nextDouble();
                Sphere sphere = new Sphere(Radius);
                System.out.println("Area of the sphere: " + sphere.calculateArea());
                System.out.print("Volume of the sphere: " + sphere.calculateVolume());
                break;

            case 5:
                System.out.print("Enter the length of the cube: ");
                double Length = scanner.nextDouble();
                Cube cube = new Cube(Length);
                System.out.println("Area of the cube :" + cube.calculateArea());
                System.out.print("Volume of the cube :" + cube.calculateVolume());
                break;

            default:
                System.out.print("You entered a wrong number!");

        }
    }
}