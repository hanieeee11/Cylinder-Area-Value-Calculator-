import java.util.Scanner;

// Base class
class Cylinder {
    public static final double pi = Math.PI; // Storing pi value in PI constant

    double radius;
    double height;

    public void getInput() {
        Scanner dimensions = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = dimensions.nextDouble(); // Radius input

        System.out.println("Enter the height: ");
        height = dimensions.nextDouble(); // Height input

        dimensions.close(); // Close the scanner to avoid resource leaks
    }

    public double area() {
        return 2 * (pi * radius * (radius + height));
    }
}
//Derived class
class CylinderVol extends Cylinder {
    public double volume() {
        return pi * (radius * radius) * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Cylinder calc = new Cylinder(); // Instantiating calc object
        CylinderVol calcu = new CylinderVol();

        try { // Error handling
            // Get user input
            calc.getInput();

            calcu.radius = calc.radius; // Transfer radius value
            calcu.height = calc.height; // Transfer height value

            // Accessing the attributes of the calc object to perform computations
            double area = calc.area();
            double volume = calcu.volume();

            System.out.println("The area of the cylinder is: " + area);
            System.out.println("The volume of the cylinder is: " + volume);
        } catch (Exception e) {
            System.out.println("VALUE ERROR: ENTER A VALID NUMBER!");
        }
    }
}
