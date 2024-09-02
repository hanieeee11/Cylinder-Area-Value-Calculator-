import java.util.Scanner;

// Base class
class CylinderCalculator {
    public static double pi = Math.PI; // Storing pi value in pi variable
    public double area(double x, double y){
        return 2 * (pi * x * (x + y));
    }
    public double vol(double x, double y){
        return pi * (x * x) * y;
    }
}
// Main class inherits the attributes of the previous class.
class Main extends CylinderCalculator{
    public static void main(String[] args) {
        Scanner dimensions = new Scanner(System.in);
        CylinderCalculator calc = new CylinderCalculator(); // Instantiating calc object

        try{
            System.out.println("Enter the radius: ");
            double rad = dimensions.nextDouble(); // Radius input

            System.out.println("Enter the height: ");
            double height = dimensions.nextDouble(); // Height input

            // Accessing the attributes of the calc object to perform computations
            double area = calc.area(rad,height);
            double volume = calc.vol(rad,height);

            System.out.println("The area of the cylinder is: " + area);
            System.out.println("The volume of the cylinder is: " + volume);

        } catch (Exception e) {
            System.out.println("VALUE ERROR: ENTER AN INTEGER!!");
    }

        dimensions.close(); // Close scanner object
    }
}
