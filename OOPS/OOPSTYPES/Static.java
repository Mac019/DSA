class Student {
    static String School;
    String name;

    public static void changeSchool(){
        School = "newSchool";
    }
}

public class Static {

    public static void main(String[] args) {
        Student.School = "PVB";
        Student S1 = new Student();
        S1.name = "Tony Stark";
        System.out.println(Student.School); // Access the static variable through the class name
    }
}
