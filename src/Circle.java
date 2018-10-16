public class Circle extends Shape
{
    private int radius;
    public Circle (int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    public double getArea()
    {
        return Math.pow(Math.PI*radius,2);
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
