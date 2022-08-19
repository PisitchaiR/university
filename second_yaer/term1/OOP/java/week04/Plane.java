public class Plane extends Vehicle {
    public void setPlaneInfo(int s, String t) {
        this.setFuel(s);
        this.setTopSpeed(t);
    }
    public void showPlaneInfo() {
        System.out.println("Plane detail is, Fuel is "+getFuel()+" litre and Top Speed is " +getTopSpeed()+ " m/s.");
    }
    public void fly() {
        int f = this.getFuel();
        f -= 200;
        if(f<=0) {
           System.out.println("Please add fuel."); 
        }else{
            System.out.println("Fly.");
            this.setFuel(f);
        }
    }
}