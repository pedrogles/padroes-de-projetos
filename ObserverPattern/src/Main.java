import student.Student;
import test.Test;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pedro");
        Student student2 = new Student("Marcos");
        Student student3 = new Student("Felicia");
        Student student4 = new Student("Joyce");
        Student student5 = new Student("Lucas");

        Test test = new Test();

        test.addObserver(student1);
        test.addObserver(student2);
        test.addObserver(student3);
        test.addObserver(student4);
        test.addObserver(student5);

        test.removeObserver(student2);
        test.removeObserver(student3);

        test.notifyObserver("Tecnologias para Back-end 2");

        /*
        test.removeObserver(student2);
        test.removeObserver(student3);
        test.notifyObserver("Padrão de Projetos");
        test.notifyObserver("Tecnologias para Back-end 2");
        test.notifyObserver("Acessibilidade e Tecnologias Assistivas");
        test.notifyObserver("Banco de Dados 2");
        */



    }
}