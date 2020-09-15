package learning.java.school;

import learning.java.school.model.Grupo;
import learning.java.school.model.Professor;
import learning.java.school.model.Student;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        Grupo[] groups = prepareOOPGroups();

        for (Grupo grupo : groups) {
            System.out.println("Profesor: " + grupo.getProfessor().getName());
            System.out.println("Cupo: " + grupo.getAvailability() + ", Inscritos: " + grupo.getEnrolled());
            System.out.println("Students: ");
            grupo.printStudentsList();
            System.out.println("---------------------------------------");
        }

        groups[1].addStudent(new Student("Caleb", "asd"));

    }

    public static Grupo[] prepareOOPGroups() {
        Grupo[] groups = new Grupo[2];
        Professor professorIvan = new Professor();
        Professor professorPaco = new Professor();

        professorIvan.setName("Ivan Uresti");
        professorPaco.setName("Paco Torres");

        groups[0] = new Grupo(20);
        groups[1] = new Grupo(15,professorIvan);

        groups[0].setProfessor(professorPaco);

        groups[0].addStudent(new Student("Isaias", "100"));
        groups[1].addStudent(new Student("Arturo", "201"));
        groups[0].addStudent(new Student("Angel", "101"));
        groups[1].addStudent(new Student("Jocelyn", "202"));
        groups[0].addStudent(new Student("Jose", "102"));
        groups[1].addStudent(new Student("Alain", "200"));
        groups[1].addStudent(new Student("Antonio", "203"));

        return groups;

    }
}
