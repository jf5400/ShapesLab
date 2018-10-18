public class ITriangle extends Shape
{
    //identifies the length of the two different sides of the Isosceles triangle
    private int side1;
    private int side2;
    public ITriangle(int side1, int side2)
    {
        super("ITriangle");
        this.side1=side1;
        this.side2=side2;
    }
    //Calculates and returns the area of the triangle
    @Override
    public double getArea()
    {
        return (side2*(.5)*(Math.sqrt((Math.sqrt(side1)-Math.sqrt(side2*.5)))));
    }
    //Calculates and returns the perimeter of the triangle
    @Override
    public double getPerimeter(){
        return (side1*2)+side2;
    }
}
