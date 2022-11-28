package test;

import student.Student;
import observable.ObservableInterface;

import java.util.ArrayList;

public class Test implements ObservableInterface {
    private ArrayList<Student> students = new ArrayList<>();
    @Override
    public void addObserver(Student student) {
        if(!students.contains(student)) {
            this.students.add(student);
        }
    }
    @Override
    public void removeObserver(Student student) {
        this.students.remove(student);
    }
    @Override
    public void notifyObserver(String testName) {
        for (Student student : this.students) {
            student.update(testName);
        }
    }
}
