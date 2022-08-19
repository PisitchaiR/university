public class Merchant extends Person{
    public Merchant(){
        super();
    }
    public Merchant(String name, CheckingAccount myAcct, Item myItem){
        super(name, myAcct, myItem);
    }
    public Item sellItem(Person w){
        Wizard wizard = (Wizard) w; //call obj
        if(wizard.pay(this, this.getItem().getPrice())){
            Item tempItem = this.getItem();
            this.setItem(null);
            System.out.println("[M] Exchange Complete");
            return tempItem;
        }else{
            System.out.println("[M] Exchange Incomplete");
            return null;
        }

    }
    public boolean collectMoney(Person w, double p){
        if(this.getMyAcct().deposit(p)){
            System.out.printf("[M] I got " + w.getName() + "money (%.2f)%n", p);
            return true;
        }else{
            System.out.printf("[M] %s is not enough money.", w.getName());
            return false;
        }
    }
    public String getInfo(){
        return "[M] I'm a "+super.getName()+" Merchant (" + super.getMyAcct() + "). There is a/an " + super.getItem() + " in my bag.";
    }
}
