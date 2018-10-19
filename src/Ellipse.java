public class Ellipse extends Shape
{
    /**
     * identifies the length of a from the center
     * identifies the length of b from the center
     */
    private int a;
    private int b;
    public Ellipse (int a ,int b)
    {
        super("Ellipse");
        this.a = a;
        this.b = b;
    }

    /**
     * calculates and returns the area
     * calculates and returns the perimeter
     */
    public double getArea() {return a*b*Math.PI;}
    public double getPerimeter() { return Math.PI*(3*(a+b)-Math.sqrt((3*a+b)*(a+3*b)));}
}

