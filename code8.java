class AnimalSound {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends AnimalSound {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends AnimalSound {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Main {
    public static void main(String[] args) {

        AnimalSound a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
