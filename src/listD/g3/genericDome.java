package listD.g3;

import java.util.ArrayList;

public class genericDome {
    public static void main(String[] args) {
        ArrayList<BMW> bwm = new ArrayList<>();
        bwm.add(new BMW());
        bwm.add(new BMW());
        bwm.add(new BMW());
        ArrayList<BENZ> benz = new ArrayList<>();
        benz.add(new BENZ());
        benz.add(new BENZ());
        benz.add(new BENZ());
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
    }

    public static void go(ArrayList<? extends car> cars) {

    }

}

class Dog {

}

class car {

}

class BENZ extends car {

}

class BMW extends car {

}
