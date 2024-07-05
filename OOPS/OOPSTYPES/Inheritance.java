import Bank;


// class Shape { // Base Class / Parent Class
//     String color;
// }

// class Triangle extends Shape{ // Sub Class / Child Class

// }

class Shape{
    public void area (){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println(1/2*l*h); // Single Level Inheritance 
    }
}


class EquilateralTriangle  extends Triangle{ // Multi-Level Inheritance
    public void area(int l , int h ){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14*r*r));   // Hierarchial Inheritance 
    }
}





public class Inheritance {
    public static void main(String[] args) {
        // Triangle t1 = new Triangle();
        // t1.color = "red";
        //Encapsulation

        bank.Account acc1 = new bank.Account();
        acc1.name = " Customer1";


        
    }
    
}
