package third_lesson.src;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;
    private final String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Гендер: " + gender);
    }

    public void increaseAge() {
        age++;
    }

    public void changeName(String newName) {
        this.name = newName;
    }
}

class Worker extends Person {
    private final double salary;

    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Worker {
    private final List<Worker> subordinates;

    public Manager(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Worker worker) {
        subordinates.add(worker);
    }

    public void displaySubordinates() {
        for (Worker worker : subordinates) {
            worker.displayInfo();
        }
    }
}
