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
        int []aux=new int[Student.length];
        for(int i = 0; i <Student.length; i++){
            System.out.println(" ");
            System.out.println("Name: " + Student[i].getName() + " code: " + Student[i].getCode());
            System.out.print("Asistio: ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("Y")) {
                aux[i]=1;
                System.out.println(Student[i].getName()+" SI");
            } else if (response.equalsIgnoreCase("N")) {
                aux[i]=0;
                System.out.println(Student[i].getName()+ " NO");
            } else {
                System.out.println("Intente de nuevo");
                i--;
            }
        }
        System.out.println("-");
            for (int j=0;j< Student.length;j++){
                if(aux[j]==1){
                    System.out.println(Student[j].getName() + ": si Asistio");
                }
                else{
                    System.out.println(Student[j].getName() + ": No Asistio");
                }
        }

    }
}
