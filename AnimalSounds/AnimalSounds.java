class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow says: Moo");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Cow()
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}