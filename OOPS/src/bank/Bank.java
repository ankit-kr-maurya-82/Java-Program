// package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    // getters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank{
    public void main(){
        Account account1 = new Account();
        account1.name = "Ankit";
        account1.email = "ankit@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}