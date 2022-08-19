
public class CheckingAccount extends Account {

    private double credit;

    public CheckingAccount() {
        this(0, "", 0);
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit() {
        return credit;
    }

    public void withdraw(double a) {
        if (a > 0 && this.balance - a > 0) {
            this.balance -= a;
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        } else if (a > 0 && this.balance - a < 0 && this.credit + (this.balance - a) > 0) {
            this.credit += this.balance - a;
            this.balance = 0;
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        } else {
            System.out.println("Not enough money!");
        }
    }

    public void withdraw(String a) {
        double b = Double.parseDouble(a);
        if (b > 0 && this.balance - b > 0) {
            this.balance -= b;
            System.out.println(b + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        } else if (b > 0 && this.balance - b < 0) {
            System.out.println("Not enough money!");
        }
    }

    public String toString() {
        return "The" + name + " account has" + balance + " baht and " + credit + " credits.";
    }
}
