package Classes;

public class Vehicle {
    private String name;

    private int size;

    private int currntVelocity;
    private int currentDirection;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;

        this.currntVelocity=0;
        this.currentDirection=0;

    }
 public void steer (int direction){
     this.currentDirection+=direction;
     System.out.println("Vehicle.steer(): Steering at "+ currentDirection+ "degrees. ");
 }
 public void move(int velocity, int direction){
        currntVelocity=velocity;
        currentDirection=direction;
     System.out.println("Vehicle.move() Moving at " +currntVelocity+ " in direction " + currentDirection);
 }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrntVelocity() {
        return currntVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop(){
        this.currntVelocity=0;
    }
}
