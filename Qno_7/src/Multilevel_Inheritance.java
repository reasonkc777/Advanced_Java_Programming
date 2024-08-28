//Qno7c Implementation of Multilevel Inheritance

class Grandparent {
    Grandparent() {
        System.out.println("Grandparent Constructor");
    }
}

class Parent_ extends Grandparent {
    Parent_() {
        System.out.println("Parent Constructor");
    }
}

class Child_ extends Parent {
    Child_() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
