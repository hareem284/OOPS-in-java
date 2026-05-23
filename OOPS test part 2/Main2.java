//Consider the following class definition: public class Circle
// { private double radius; public(double r) { radius = r; }
//  public double getRadius() { return radius; } public double area()
//  { return Math.PI * radius * radius; } public double circumference()
//  { return 2 * Math.PI * radius; } } Write the complete Circle class 
// definition, including instance variables and method headers, to model
//  a circle with a radius and providing methods to get the radius,area, and circumference of the circle. 

public class Main2 {
    public static void main(String[] args) {
        circle c1 = new circle(4.0);
        System.out.println("the radius is : " + c1.get_radius());
        System.out.println("the area is " + c1.area());
        System.out.println("the circumference is " + c1.circumference());
    }
}
