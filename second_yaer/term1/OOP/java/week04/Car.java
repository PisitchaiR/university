public class Car extends Vehicle {
    private String typeEngine;

    public void setTypeEngine(String t) {
        this.typeEngine = t;
    }
    public String getTypeEngine() {
        return typeEngine;
    }
    public void showCarInfo() {
        System.out.println("Car engine is " + this.typeEngine + ".\nFuel is " + getFuel() + " litre and Top Speed is " + getTopSpeed() + " m/s.");
    }
    public void setCarInfo(int s, String t, String y) {
        this.setFuel(s);
        this.setTopSpeed(t);
        this.typeEngine = y;
    }
    public void move() {
        int f = this.getFuel();
        f -= 50;
        if(f<=0) {
           System.out.println("Please add fuel."); 
        }else{
            System.out.println("Move.");
            this.setFuel(f);
        }
    }
}
