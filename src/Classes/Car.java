package Classes;

public class Car extends Vehicle {
    private int doors;
    private int wheels;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, int size, int doors, int wheels, int gears, boolean isManual) {
        super(name, size);
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): change to  " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction)
    {
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity "+speed+" direction "+direction);
    }


}