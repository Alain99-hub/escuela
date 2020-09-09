package learning.java.school;

class Grupo {
    private Professor professor;
    private int availability;
    private Student[] students;

    Grupo(int availability) {
        this.availability = availability;
        students = new Student[availability];
    }

}