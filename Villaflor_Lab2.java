import java.util.Scanner;

class Cylinder{
    // This will be our base class
}
class CylinderCalculator extends Cylinder{ /*To make the code much shorter I only made one class that extends the base class, I also want to make the structure of the code more clean and OOP-based */
    public static double area(double x, double y){ // I've put parameters x,y sso there's no need to declare the variables for radius and height
        return 2 * Math.PI * x * (x + y); 
    }

    public static double vol(double x, double y){
        return Math.PI * Math.pow(x, 2) * y;
    }
}

class Main {
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
        System.out.println("the area is: " + area);
        System.out.println("the volume is: " + volume);

        dimensions.close(); //To close the scanner.
    }
}
