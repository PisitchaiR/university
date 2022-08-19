public class Wizard extends Person{
    public Wizard(){
        super();
    }
    public Wizard(String name, CheckingAccount myAcct, Item myItem){
        super(name, myAcct, myItem);
    }
    public void buyItem(Person m){
        Merchant merchant = (Merchant) m; // call object merchant
        Item item = merchant.sellItem(this); // collect something return in obj item
        if(item != null){
            this.setItem(item);
            System.out.println("[W] I got it.");
        }else{
            System.out.println("[W] Fail.");
        }
    }
    public boolean pay(Person m, double p){
        if(this.getMyAcct().withdraw(p)){
            Merchant merchant = (Merchant) m;
            merchant.collectMoney(this, p);
            System.out.printf("[W] I have paid the item fees to %s%n", merchant.getName());
            return true;
        }else {
            System.out.println("[W] I don't have enough money");
            return false;
        }
    }
    public String getInfo(){
        return "[W] I'm a "+super.getName()+" Merchant (" + super.getMyAcct() + "). There is a/an " + super.getItem() + " in my bag.";
    }
}
