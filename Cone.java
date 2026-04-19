public class Cone extends Shape {



    private double radius;

    private double height;



    // Constructor

    public Cone(double radius, double height) {

        this.radius = radius;

        this.height = height;

    }



    // Surface Area: πr(r + √(h² + r²))

    public double surface_area() {

        double slantHeight = Math.sqrt(height * height + radius * radius);

        return Math.PI * radius * (radius + slantHeight);

    }



    // Volume: (1/3)πr²h

    public double volume() {

        return (1.0 / 3.0) * Math.PI * radius * radius * height;

    }



    // toString

    public String toString() {

        return "Cone -> Radius: " + radius + ", Height: " + height +

               ", Surface Area: " + String.format("%.2f", surface_area()) +

               ", Volume: " + String.format("%.2f", volume());

    }

}
