public class Circle extends Shape
{
    /**
     * identifies the radius of the circle
     * identifies type of shape as "Circle"
     */
    private int radius;
    public Circle (int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    /**
     * calculates and returns area
     * calculates and returns perimeter
     */
    public double getArea()
    {
        return Math.pow(Math.PI*radius,2);
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
