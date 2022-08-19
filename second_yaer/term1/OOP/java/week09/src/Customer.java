import java.util.Objects;
import java.util.ArrayList;

/**
 *
 * @author tathustheerachuwiwat
 */
public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    private int numOfAccount = 0;

    public Account getAccount(int index) {
//        return (Account)acct.get(index);
        return acct.get(index);
    }

    public void addAccount(Account acct) {
        this.acct.add(acct);
    }

    public int getNumOfAccount() {
        return this.acct.size();
    }

    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        acct = new ArrayList();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName + " Have " + acct.size() + " Account";
    }

    public boolean equals(Customer c) {
        return true;
    }
}
