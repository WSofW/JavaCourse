package third_lesson.src;

interface Animal {
    void makeSound();
}

class DogS implements Animal {
    public void makeSound() {
        System.out.println("Гав!");
    }
}

class CatS implements Animal {
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

class CowS implements Animal {
    public void makeSound() {
        System.out.println("Мууууу!");
    }
}

class AnimalMov {
    public void move() {
        System.out.println("Animal moves.");
    }
}

class Fish extends AnimalMov {
    public void move() {
        System.out.println("Fish swims.");
    }
}

class Bird extends AnimalMov {
    public void move() {
        System.out.println("Bird flies.");
    }
}

class Dog extends AnimalMov {
    public void move() {
        System.out.println("Dog runs.");
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal[] animals = {new DogS(), new CatS(), new CowS()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}