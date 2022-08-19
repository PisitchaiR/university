public class Pigeon extends Bird{
    private static int numberOfPigeon;

    public Pigeon(){
        this(0,0,0);
    }
    
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        Pigeon.numberOfPigeon += 1;
    }

    public void eat(String food){
        if(food.equals("worm")){
            this.setWeight(this.getWeight()+0.5);
        }else if(food.equals("seed")){
            this.setWeight(this.getWeight()+0.2);
        }else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }

    public String toString(){
        return "Pigeon " + super.getWeight() + " kg and " + super.getHeight() + " cm. There are "+ Pigeon.numberOfPigeon+ " pigeons.";
    }

    public void fly(){
        setWeight(this.getWeight()-0.25);
        if(this.getWeight() >= 5){
            System.out.println("Fly Fly");
        }else {
            System.out.println("I'm hungry.");
        }
    }

    public void takeOff(){
        setWeight(this.getWeight()-0.5);
        if(this.getWeight() >= 5){
            System.out.println("Take Off");
        }else {
            System.out.println("I'm hungry.");
        }
    }

    public void landing(){
        setWeight(this.getWeight()-0.5);
        if(this.getWeight() >= 5){
            System.out.println("Landing");
        }else {
            System.out.println("I'm hungry.");
        }
    }
}
