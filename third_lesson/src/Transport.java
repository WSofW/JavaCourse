package third_lesson.src;

abstract class Transport {
    public abstract void move();
}

class Car extends Transport {
    public void move() {
        System.out.println("Машина едет.");
    }
}

class Bike extends Transport {
    public void move() {
        System.out.println("Велик едет.");
    }
}
