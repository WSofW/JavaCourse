package task_3.src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private final String name;
    private final String group;
    private final double grade;

    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getGroup() {
        return group;
    }
}

class University {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> sortByName() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public List<Student> filterByGrade(double threshold) {
        return students.stream()
                .filter(student -> student.getGrade() >= threshold)
                .collect(Collectors.toList());
    }
}
