package learning.java.school.model;

public class Grupo {
    private Professor professor;
    private int availability;
    private Student[] students;
    private int enrolled;

    public Grupo(int availability) {
        this.availability = availability;
        students = new Student[availability];
        enrolled = 0;
    }

    public Grupo (int availability, Professor professor) {
        this.availability = availability;
        this.professor= professor;
        students= new Student[availability];
        enrolled = 0;
    }

    public Professor getProfessor() {

       return professor;

    }



    public int getEnrolled() {
        return enrolled;
    }

    public int getAvailability() {
        return availability;
    }

    public void setProfessor(Professor professor) {
    this.professor= professor;

    }

    public void addStudent(Student student) {
        if(enrolled<= availability){
            students[enrolled] = new Student(student.getName(),student.getCode());
            enrolled++;
        }
    }

    public void printStudentsList() {
        for (int i=0;i<enrolled;i++){
            System.out.println(students[i].getName());
        }
    }
}