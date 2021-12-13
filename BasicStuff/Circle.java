package BasicStuff;

class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String toString() {
        return "Point at (" + this.x + ", " + this.y + ")";
    }
}

class Circle {
    
    // attribute
    private final double radius;
    private final Point centre;

    Circle(double radius, Point centre) {
        this.radius = radius;
        this.centre = centre;
    }

    public Circle enlarge(double factor) {
        return new Circle(this.radius*factor, this.centre);
    }

    

    public String toString() {
        return "Circle with centre (";
    }

    
}