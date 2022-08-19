public class Ship extends Vehicle implements Floatable{
    public Ship(){
        super();
    }
    public Ship(double fuel){
        super(fuel);
    }

    public void move(){
        this.fl0at();
    }
    
    public void move(int distance){
        for(int i = 0; i < distance; i++){
            if(this.fuel<50){
                System.out.println("Fuel is not enough.");
                break;
            }
            this.fl0at();
        }
    }

    public void fl0at(){
        if(this.fuel >= 50){
            this.fuel -= 50;
            System.out.println("Ship moves");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }

    public void startEngine(){
        if(this.fuel >= 10){
            this.fuel -= 10;
            System.out.println("Engine starts");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }

    public void stopEngine(){
        System.out.println("Engine stops");
    }

    public void honk(){
        System.out.println("Shhhhh");
    }
}
