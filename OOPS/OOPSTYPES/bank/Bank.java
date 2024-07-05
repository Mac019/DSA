package bank;

class Account {
    public String name; 
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    } 

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account accc1 = new Account();
        accc1.name = "Stanford";
        accc1.email = "mac08@gmail.com";
        // accc1.password = "1234";         // Can't access like this 
        accc1.setPassword("mac019");
        System.out.println(accc1.getPassword());
    }
}
