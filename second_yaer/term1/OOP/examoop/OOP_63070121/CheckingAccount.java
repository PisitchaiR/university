public class CheckingAccount extends Account implements WithdrawAble{
    private static double RATE = 0.1;
    
    public CheckingAccount(){
        this(0, "");
    }
    public CheckingAccount(double balance, String name){
        super(balance, name);
    }
    public void setRATE(double rate){
        CheckingAccount.RATE = rate;
    }
    public double getRATE(){
        return RATE;
    }
    public void showInterest(){
        System.out.println(super.balance * this.RATE);
    }
    public void showInterest(int year){
        System.out.println(super.balance * this.RATE * year);
    }
    public void getInfoAcct(){
        System.out.println(super.name + "Checking Account has " + super.balance + " Baht.");
    }
    public boolean deposit(double a){
        if(a>0){
            super.balance += a;
            return true;
        }else{
            return false;
        }
    }
    public boolean withdraw(double a){
        if(a>0){
            if(super.balance-a >= 0){
                super.balance -= a;
                System.out.println("[CA] Transaction success.");
                return true;
            }else{
                System.out.println("[CA] Transaction fail.");
                return false;
            }
        }else{
            System.out.println("Not support zero or negative nymber.");
            return false;
        }
    }

}
