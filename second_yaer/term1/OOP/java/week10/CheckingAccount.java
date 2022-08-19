public class CheckingAccount extends Account {
    private double credit;
    public CheckingAccount() {
        this(0, "", 0);
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit <= 0){
            System.out.println("Input number must be a positive integer.");
        }
        else{
            this.credit = credit;
        }
    }
    public double getCredit(){
        return credit;
    }
    public void withdraw(double amount) throws WithdrawException{
        if ((balance - amount) >= 0){
            if (amount <= 0){
                throw new WithdrawException("Account " + getName() + " has not enough money.");
            }
            else if ((getBalance() - amount) < 0){
                throw new WithdrawException("Account " + getName() + " has not enough money.");
            }
            else{
                setBalance(getBalance() - amount);
                System.out.println(amount + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
        }
        else{
            if (((balance - amount)+ credit) >= 0){
                setCredit((credit + balance) - amount); 
                setBalance(0);
                System.out.println(amount + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
            else if (((balance - amount)+ credit) < 0){
                throw new WithdrawException("Account " + getName() + " has not enough money.");
                
            }
        }
    }
    public void withdraw(String amount) throws WithdrawException{
        double b = Double.parseDouble(amount);
        this.withdraw(b);
    }
    public String toString(){
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
