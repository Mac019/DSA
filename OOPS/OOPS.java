class Pen {
    String color;
    String type; // ballpoint ; gel

    public void write() {
        System.out.println("Writing Something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}
class Student {
    String name;
    int age;


    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    // Student() {
    //     System.out.println("Constructor Called");
    // }  Non-Parametrized Constructor

//     Student(String name , int age) {//Passed Parameters
//         this.name /*(this name is class student {name })*/= name;//passed parameter-<;
//         this.age =  age;
//     }   Parametrized Constructor
// }

Student(Student anu) {  //Passed Parameters
    this.name = anu.name;
    this.age  = anu.age;  // Copy Constructor 
}
Student() {

}
}


public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "blackpoint";

        // pen1.printColor();
        // pen2.printColor();

        // Student mac = new Student("MakJ" , 23);  Parameterized Contructor 
        // mac.age = 22;
        // mac.name = "Makarand"; This code is replaced by constructor 
        Student sam = new Student();
        sam.name = "Sampada";
        sam.age = 25;

        Student anu = new Student(sam);
        anu.printInfo();

  
    }
}
