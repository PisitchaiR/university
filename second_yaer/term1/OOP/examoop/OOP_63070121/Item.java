public class Item {
    private String name;
    private double price;

    public Item(){}
    public Item(String name, double price){
        setName(name);
        setPrice(price);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public String toString(){
        return this.name;
    }
}
