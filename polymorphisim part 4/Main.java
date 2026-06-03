// public class AreaCalculator 
// { public double sumAreas(Shape[] shapes) { double totalArea = 0; for (Shape shape : shapes)
//  { totalArea += shape.getArea(); } return totalArea; } } 
// a. Explain what polymorphism is and how it is used in this code. 
// b. Write code to create an array of Shape objects that contains
//  at least one Rectangle and at least one Circle. Pass this array to an instance
//  of the AreaCalculator class and print the sum of the areas of the shapes in the array.

//interface
interface shape {
    double getarea();

}

class Rectangle implements shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    @Override
    public double getarea() {
        return width * height;
    }
}

class circle implements shape {
    private double radius;

    // the constructor of circle
    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getarea() {
        return Math.PI * radius * radius;
    }
}

class areacalculator {
    public double sum_areas(shape[] shapes) {
        double totalarea = 0;
        for (shape shape : shapes) {
            totalarea += shape.getarea();
        }
        return totalarea;
    }

}

public class Main {
    public static void main(String[] args) {
        shape[] s = new shape[2];
        s[0] = new Rectangle(3.4, 11.3);
        s[1] = new circle(34);
        areacalculator ac = new areacalculator();
        System.out.println("the total area is " + ac.sum_areas(s));
    }
}