// In this file we understand the access modifier
// In Java, four different types of access modifiers are available.

// When we don't write anything before a function or parameter, it is the default modifier.

class Account {
    public String name; // Here, String uses a public type access modifier, making this value accessible by any class.

    String color; // This is the default type.

    protected String email; // This is accessible within the program and by subclasses in the same package.

    private String password; // Private members are accessible only within the same class.

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class OOPS5 {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "savings account"; // name is accessible by OOPS5 class because in Account class, it's declared as public.
        account1.email = "hmpiprotar@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
