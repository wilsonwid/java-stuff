class Dog {
    String name;

    public void bark(int numBarks) {
        while (numBarks > 0) { 
            System.out.println("Woff! Woff!");
            numBarks--;
        }
    }

    public void eat() {
        System.out.println(name + " is eating something");
    }

    public void chaseCat() {
        System.out.println(name + " is now chasing a cat!");
    }
}

public class dogarray {
    public static void main(String args[]) {
        // making dog1
        Dog dog1 = new Dog();
        dog1.bark(3);
        dog1.name = "Bart";

        // making a Dog array
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        // setting the attributes for each dog
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.println("last dog's name is: " + myDogs[2].name);

        int x = 0;
        while(x < myDogs.length){
            System.out.println("Dog name: " + myDogs[x].name);
            myDogs[x].bark(3);
            x++;
        }
    }
}
