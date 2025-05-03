package org.example;

public class Shape {
    private int sides;
    private double length;

    public Shape(int sides, double length) {
        if (sides < 2 || sides > 5) {
            throw new IllegalArgumentException("Number of sides must be between 1 and 5.");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive.");
        }
        this.sides = sides;
        this.length = length;
    }

    public double getPerimeter() {
        return sides * length;
    }

    public double getArea() {
        double angle = Math.PI / sides;
        return (sides * Math.pow(length, 2)) / (4 * Math.tan(angle));
    }

    public String getShapeType() {
        switch (sides) {
            case 3: return "Triangle";
            case 4: return "Quadrilateral";
            case 5: return "Pentagon";
            default: return "Unknown shape";
        }
    }

    public void printShapeInfo() {
        System.out.println("Shape Type: " + getShapeType());
        System.out.println("Number of sides: " + sides);
        System.out.println("Length of each side: " + length);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }

    //can a fit in b?
    public static boolean canFitIn(Shape a, Shape b){
        return a.getArea() < b.getArea();
    }

    public static void main(String[] args) {
        // Example: Create a square with side length of 4
        Shape shape = new Shape(4, 7);
        shape.printShapeInfo();
    }
}