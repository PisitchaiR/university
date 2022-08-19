public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double a){
        if (a <= 0){
            System.out.println("Input number must be a positive integer.");
        }
        else{
            setBalance(getBalance() + a);
            System.out.println(a + " baht is deposited to " + getName() + ".");
        }
    }
    public void withdraw(double amount) throws WithdrawException{
        if (amount <= 0){
            throw new WithdrawException("Account " + getName() + " has not enough money.");

        }
        else if ((getBalance() - amount) < 0){
            throw new WithdrawException("Account " + getName() + " has not enough money.");
        }
        else{
            setBalance(getBalance() - amount);
            System.out.println(amount + " baht is withdrawn from " + getName() + ".");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void showAccount(){
        System.out.println(getName() + " account has " + getBalance() + " baht.");
    }
}

