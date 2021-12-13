package Lecture1;

class Circle {
    
    // properties
    private final Point centre;
    private final double radius;

    // constructor
    Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    // getters
    double getRadius() {
        return this.radius;
    }

    Point getCentre() {
        return this.centre;
    }

    // methods
    boolean contains(Point point) {
        return this.getCentre().distanceTo(point) < this.getRadius();
    }

    Circle setRadius(double newRadius) {
        return new Circle(this.getCentre(), newRadius());
    }

    public String toString() {
        return "Circle centred at " + this.getCentre() + " with radius " + this.getRadius();
    }
}
