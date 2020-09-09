package learning.java.school;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Student[] Student= new Student[]{
                new Student("Edilberto", "45781"),
                new Student("Alain", "41"),
                new Student("Jocelyn", "481"),
                new Student("Kaleb", "81")
        };

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i <Student.length; i++){
            System.out.println(" ");
            System.out.println("Name: " + Student[i].getName() + " code: " + Student[i].getCode());
            System.out.print("Asistio: ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("Y")) {
                System.out.println(Student[i].getName()+" SI");
            } else if (response.equalsIgnoreCase("N")) {
                System.out.println(Student[i].getName()+ " NO");
            } else {
                System.out.println("Incorrecto");
                i--;
            }
        }

    }
}
