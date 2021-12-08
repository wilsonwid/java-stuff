class Point { 
    // instance variables (attributes)
    private double x;
    private double y;

    // constructor
    Point(double x, double y) { 
        this.x = x;
        this.y = y;
    }

    // getters
    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    // methods
    double distanceTo(Point otherPoint) { 
        double distX = this.x - otherPoint.getX();
        double distY = this.y - otherPoint.getY();
        return Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
    }

    Point move(double x, double y) {
        return new Point(x, y);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}