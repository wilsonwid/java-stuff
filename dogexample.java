class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }
}

class DogTest {
    // code to test the Dog class
    public static void main(String[] args){
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }

}
