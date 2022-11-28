package student;

import observer.ObserverInterface;
import test.TestInterface;

public class Student implements ObserverInterface, TestInterface {
    private final String studentName;
    //Constructor
    public Student(String studentName) {
        this.studentName = studentName;
    }
    @Override
    public void update(String test) {
        switch (test) {
            case "Padrão de Projetos" -> this.padraoProjeto();
            case "Tecnologias para Back-end 2" -> this.backEnd2();
            case "Acessibilidade e Tecnologias Assistivas" -> this.acessibilidade();
            case "Banco de Dados 2" -> this.bd2();
        }
    }
    @Override
    public void padraoProjeto() {
        System.out.println(studentName + ", você tem uma nova prova de Padrão de Projetos no sistema.");
    }
    @Override
    public void backEnd2() {
        System.out.println(studentName + ", você tem uma nova prova de Tecnologias para Back-end 2 no sistema.");
    }
    @Override
    public void acessibilidade() {
        System.out.println(studentName + ", você tem uma nova prova de Acessibilidade e Tecnologias Assistivas no sistema.");
    }
    @Override
    public void bd2() {
        System.out.println(studentName + ", você tem uma nova prova de Banco de Dados 2 no sistema.");
    }
}
