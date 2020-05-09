package Classes;

import static java.lang.Math.sqrt;

public class Point
{
    private int x;
    private int y;

    public Point()
    {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(){

        return sqrt((x*x)+(y*y));
    }
    public double distance(int x, int y)
    {
        return sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    public double distance(Point another)
    {
        return sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y));
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
