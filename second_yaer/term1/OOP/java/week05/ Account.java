class  Account {
    protected double balance;
    protected String name;

    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double a){
        if(a>0){
            balance += a;
            System.out.printf("%f baht is deposited to %s", this.balance, this.name);
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a){
        if(a>0){
            if(balance - a > 0){
                balance -= a;
                System.out.printf("%f baht is withdrawn from %s", this.balance, this.name);
            }else{
                System.out.println("Not enough money!");
            }
        }else {
            System.out.println("Input number must be a positive integer.");
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
        System.out.printf("%s account has %f baht.", this.name, this.balance);
    }
}
