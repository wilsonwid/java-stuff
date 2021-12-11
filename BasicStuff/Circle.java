package BasicStuff;

class Circle {
    
    // attribute
    private final double radius;
    private final double centre;

    Circle(double radius, double centre) {
        this.radius = radius;
        this.centre = centre;
    }

    public void enlarge(double factor) {
        this.radius *= factor;
    }

    
}