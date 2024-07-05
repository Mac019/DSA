class Student {
    String name;
    int age;

    public void printInfor(String name) {
        System.out.println(name);
    }

    public void printInfor(int age) {
        System.out.println(age);
    }

    public void printInfor(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mac";
        s1.age = 23;

        s1.printInfor(s1.name, s1.age);
    }
}
