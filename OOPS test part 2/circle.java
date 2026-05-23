public class circle {
    private double radius;

    // constructor
    public circle(double r) {
        this.radius = r;

    }

    public double get_radius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;

    }
}
