package observable;

import student.Student;

public interface ObservableInterface {
    void addObserver(Student student);
    void removeObserver(Student student);

    void notifyObserver(String testName);

}
