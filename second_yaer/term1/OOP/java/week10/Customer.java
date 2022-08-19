
public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    public Customer(){
        this("", "", null);
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return this.acct;
    }
    public String toString(){
        if (this.acct == null){
            return firstName + " " + lastName + " doesn't have account.";
        }
        else{
            return "The " + firstName +" account has " + acct.getBalance() + " baht and " + acct.getCredit() + " credits.";
        }
    }
    public boolean equals(Customer c){
        return (firstName.equals(c.firstName)) && (lastName.equals(c.lastName));
    }
    public static void main(String[] args) {
        CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
        Customer c1 = new Customer();
        Customer c2 = new Customer("Harry","Potter");
        Customer c3 = new Customer("Harry","Potter",a1);
        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c2));
        }
}
