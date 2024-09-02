import java.util.Scanner;

class Cylinder{
    // This will be our base class
}
/*To make the code much shorter I only made one class that extends the base class, I also want to make the structure of the code more clean and OOP-based */
class CylinderCalculator extends Cylinder{ 
    public static pi = Math.PI;
    public double area(double x, double y){ // I've put parameters x,y sso there's no need to declare the variables for radius and height
        return 2 * pi * x * (x + y); 
    }
    public double vol(double x, double y){
        return pi * (x * x) * y;
    }
}
// Main class inherits the attributes of the previous class.
class Main extends CylinderCalculator{
    public static void main(String[] args) {
        Scanner dimensions = new Scanner(System.in);
        CylinderCalculator calc = new CylinderCalculator(); //Creating object 

        System.out.println("Enter the radius: ");
        double rad = dimensions.nextDouble(); //To input the radius.
        System.out.println("Enter the height: ");
        double height = dimensions.nextDouble(); //To input the height.
      
        //Calling the object and the method to calculate the volume and the area.
        double area = calc.area(rad,height);  
        double volume = calc.vol(rad,height);

        //Print/display the answer
        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);

        dimensions.close(); //To close the scanner.
    }
}
