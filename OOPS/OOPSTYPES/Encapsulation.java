
// abstract class Animal {
//     abstract void walk();
//     public void eat(){
//         System.out.println("Animal Eats");
//     }
// }

// class  Horse extends Animal{
//         public void walk(){
//             System.out.println("Walks on 4 legs ");
//         }
//     }

// class Chicken extends Animal {
//     public void walk(){
//         System.out.println("Walk on 2 legs ");
//     }
// }

interface Animal {
    int eyes = 2;
   public void walk();
}

interface Herbivore{

}

class Horse implements Animal , Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}


public class Encapsulation {
public static void main(String[] args) {
    Horse H1 = new Horse();
    H1.walk();
    // Animal A1 = new Animal();
    // A1.walk();   Not Possible 
   
}
    
}