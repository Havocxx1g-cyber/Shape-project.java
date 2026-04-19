public class Cylinder extends Shape {

    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder -> Radius: " + radius + ", Height: " + height +
               ", Surface Area: " + String.format("%.2f", surface_area()) +
               ", Volume: " + String.format("%.2f", volume());
    }
}