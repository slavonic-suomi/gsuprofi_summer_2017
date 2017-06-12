package by.gsu.lesson4;

public class Engine {

     private int power;
     private int weight;
     private double cost;

//     public Engine() {
//     }

     public Engine(int power, int weight) {
         this(power);
         this.weight = weight;
     }


     public Engine(int power) {
         if (power >= 0) {
             this.power = power;
         } else {
             System.out.println("Engine power can't be <= 0");
         }
     }

     public void setPower(int power) {
         if (power >= 0) {
             this.power = power;
         } else {
             System.out.println("Engine power can't be <= 0");
         }
     }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
         return power;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
