public class ITriangle
{
    private int side1;
    private int side2;

    public ITriangle(int side1, int side2)
    {
        super("ITriangle");
        this.side1=side1;
        this.side2=side2;
    }
    @Override
    public double getArea()
    {
        return (side2*(.5)*(Math.pow((Math.pow(side1,2)-Math.pow((side2*.5),2)),.5)));
    }
    @Override
    public double getPerimeter(){
        return (side1*2)+side2;
    }
}
