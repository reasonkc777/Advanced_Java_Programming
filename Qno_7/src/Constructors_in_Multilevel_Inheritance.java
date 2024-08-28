class Animal_ {
    Animal_() {
        System.out.println("Animal constructor is called");
    }
}

class Dog_ extends Animal_ {
    Dog_() {
        System.out.println("Dog constructor is called");
    }
}

class BabyDog extends Dog_ {
    BabyDog() {
        System.out.println("BabyDog constructor is called");
    }
}

public class Constructors_in_Multilevel_Inheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
