// X is the superclass
class X {
    protected int a;
}

// Y is the subclass of X
class Y extends X {

    // method Y
    Y() {
        super.a = 1; // gives a value of 1
    }
}

class Z {
    // instantiates x of CTT X
    X x;


    Z() {
        // sets x to equal an object X
        this.x = new X();
        this.x.a = 2;
    }   
}