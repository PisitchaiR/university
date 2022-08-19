public class Main {
    public static void main(String[] args) {
        Merchant m1 = new Merchant("Peter",new CheckingAccount(5000,"Peter"),new
       Item("Broom V1", 1000));
        Merchant m2 = new Merchant("Robert",new CheckingAccount(3000,"Robert"),new
       Item("Broom V2", 2000));
       
        Wizard w1 = new Wizard("Harry", new CheckingAccount(10000,"Harry"),null);
       
       
        System.out.println(w1.getInfo());
        System.out.println(m2.getInfo());
        System.out.println("========================================");
        w1.buyItem(m2);
        System.out.println("========================================");
        System.out.println(w1.getInfo());
        System.out.println(m2.getInfo());
        m2.getMyAcct().showInterest();
        m2.getMyAcct().showInterest(3);
    }
}
