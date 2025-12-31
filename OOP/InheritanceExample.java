class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat Meows");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        Animal myDog = new Dog();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.makeSound();
    }
}