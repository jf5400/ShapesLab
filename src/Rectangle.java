public class Rectangle extends Shape
{
    /**
     * identifies both sides of the rectangle
     */
    private int side1;
    private int side2;
    public Rectangle(int side1, int side2)
    {
        super("Rectangle");
        this.side1=side1;
        this.side2=side2;
    }

    /**
     * calculates the area and perimeter
     * @returns both as well
     */
    @Override
    public double getArea()
    {
        return (side1*side2);
    }

    @Override
    public double getPerimeter() {
        return (2*side1+2*side2);
    }
}
