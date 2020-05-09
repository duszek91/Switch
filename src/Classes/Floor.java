package Classes;

public class Floor {
    private double width;
    private double length;


    public Floor(double width, double length) {
        if(width>0){
        this.width = width;}
        else this.width=0;
        if (length>0){
        this.length = length;}
        else this.length=0;
    }
    public double getArea(){
        return width*length;
    }
}
class Carpet{
    private double cost;

    public Carpet(double cost) {
        if(cost>0){
        this.cost = cost;}
        else this.cost=0;
    }

    public double getCost() {
        return cost;
    }
}
class Calculator{
   private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}
