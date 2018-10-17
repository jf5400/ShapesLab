public class ETriangle extends Shape
{
    private int side;

    public ETriangle(int side)
    {
        super("ETriangle");
        this.side=side;
    }
    @Override
    public double getArea(){
        return (Math.pow(3,.5)*(1/4)*Math.pow(side, 2));
    }
    @Override
    public double getPerimeter(){
        return side*3;
    }
}
