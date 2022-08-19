public abstract class Account implements DepositeAble{
    protected double balance;
    protected String name;

    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public String toString(){
        return this.name+ "Account has" + this.balance + "Bath.";
    }
    public abstract void getInfoAcct();
    public void setBalance(double balance){

    }
    public double getBalance(){
        return this.balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
