package ca.nait.dmit.domain;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

//    public void setRadius(double radius) throws Exception {
//        if (radius <= 0) {
//            throw new Exception("Radius must be greater than zero.");
//        }
//
//        this.radius = radius;
//    }

    public void setRadius (double radius) {
        // for less important errors, we can just use the runtime exception
        if (radius <= 0) {
            throw new RuntimeException("Radius must be greater than zero.");
        }
        this.radius = radius;
    }

    public Circle() {
        //Sets our class to default values.
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

