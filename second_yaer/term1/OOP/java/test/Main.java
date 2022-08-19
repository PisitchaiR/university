package test;

class Encap {
    private String name;
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return this.name;
    }
}

public class Main {
    public static void main(String[] agrs) {
        Encap en = new Encap();
        en.setName("pisitchai");
        System.out.println(en.getName()); 
    }
}