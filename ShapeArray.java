public class ShapeArray {



    public static void main(String[] args) {



        // Create objects (unique values)

        Shape sphere = new Sphere(3.7);

        Shape cylinder = new Cylinder(2.5, 6.2);

        Shape cone = new Cone(4.1, 5.3);



        // Store in array

        Shape[] shapeArray = {sphere, cylinder, cone};



        // Loop and print

        for (Shape shape : shapeArray) {

            System.out.println(shape.toString());

        }

    }

}