class Vehicle {
    // properties
    private final int maxSpeed;
    private final int maxWeight;
    private int weight;

    // constructor
    Vehicle(int maxSpeed, int maxWeight) {
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
        this.weight = 0;
    }

    // getters
    int getMaxSpeed() {
        return this.maxSpeed;
    }

    int getMaxWeight() {
        return this.maxWeight;
    }

    int getWeight() {
        return this.weight;
    }

    double getSpeed() {
        return Math.max(0, (1.1 - (this.getWeight() / this.getMaxWeight()))) * this.getMaxSpeed();
    }

    // setters
    void setWeight(int newWeight) {
        this.weight = newWeight;
    }

}

class Car extends Vehicle {
    private final String model;
    private final int maxPassengers;
    private int numPassengers;

    // constructor
    Car(int maxSpeed, int maxWeight, int maxPassengers, String model) {
        super(maxSpeed, maxWeight);
        this.maxPassengers = maxPassengers;
        this.model = model;
        this.numPassengers = 0;
    }

    // getters
    String getModel() {
        return this.model;
    }

    int getMaxPassengers() {
        return this.maxPassengers;
    }

    int getNumPassengers() {
        return this.numPassengers;
    }

    double getSpeed() {
        return super.getSpeed()*(1 - (this.getNumPassengers() / this.getMaxPassengers()));
    }

    // setters
    void setNumPassengers(int newPassengers) {
        this.numPassengers = newPassengers;
    }
}