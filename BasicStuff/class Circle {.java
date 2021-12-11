package BasicStuff;

class Circle {
    
    // attribute
    private double radius;

    Circle(double r) {
        this.radius = r;
    }

    public void enlarge(double factor) {
        this.radius *= factor;
    }

    
}