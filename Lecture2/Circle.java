class Circle {
    
    // property(ies)
    protected final double radius;

    // constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // getters
    double getRadius() {
        return this.radius;
    }

    double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    double getPerimeter() {
        return 2 * Math.PI * this.getRadius();
    }
}