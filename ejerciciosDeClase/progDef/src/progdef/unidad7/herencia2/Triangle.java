package progdef.unidad7.herencia2;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // A no-arg constructor that creates a default triangle
    public Triangle(){
            this.side1 = 1;
            this.side2 = 1;
            this.side3 = 1;
    }

    // A constructor that creates a triangle with the specified side1, side2, and side3.
    public Triangle(double side1, double side2, double side3){
        if (isValid()){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("This triangle does not exist.");
        }
    }

    /** A method named getArea() that returns the area of this triangle. */
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** A method named getPerimeter() that returns the perimeter of this triangle. */
    public double getPerimeter(){
        return (side1 + side2 + side3);
    }

    /** A method that returns a string description for the triangle. */
    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }

    /** A method returns true if triangle build from sides exists */
    public boolean isValid(){
        if(side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1){
            return true;
        } else{
            return false;
        }
    }

    // The accessor methods for all three data fields
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}