class Animal {
    void makeSound() {
        System.out.println("Some sound");

    }
    void Nosound() {
        System.out.println("Not making any Sound! ");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal myAnimal;  // Reference of type Animal

        myAnimal = new Dog();  // myAnimal refers to a Dog object
        myAnimal.makeSound();  // Output: Bark
        myAnimal = new Cat();

         // myAnimal now refers to a Cat object
        myAnimal.makeSound();  // Output: Meow
        myAnimal.Nosound();
    }
}
