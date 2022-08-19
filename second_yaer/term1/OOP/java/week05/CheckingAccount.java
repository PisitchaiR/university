class CheckingAccount extends Account{
    private double credit;

    public CheckingAccount(){
        super(0, "");
        this.credit = 0.0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if(credit < 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    public void withdraw(double a){
        if(a>0){
            if(this.getBalance() - a >= 0){
                System.out.printf("%f baht is withdrawn from %s and your credit balance is %d",a, super.name, this.credit);
                this.setBalance(this.getBalance()-a);
            }else if(this.getBalance() - a + this.credit >= 0){
                this.setBalance(0);
                this.setCredit(this.getBalance() - a + this.getCredit());
                System.out.printf("%f baht is withdrawn from %s and your credit balance is %d",a, super.name, this.credit);
            }else{
                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(String a){
        double value = Double.parseDouble(a);
        this.withdraw(value);
    }

}
