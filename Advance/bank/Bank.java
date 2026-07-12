package bank;

public class Account {

    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Bank {

    public static void main(String[] args) {

        Account account1 = new Account();

        account1.name = "Ankit Kumar Maurya";
        account1.email = "ankit@gmail.com";
        account1.setPassword("abcd");

        System.out.println(account1.name);
        System.out.println(account1.email);
        System.out.println(account1.getPassword());
    }
}