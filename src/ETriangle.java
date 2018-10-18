public class ETriangle extends Shape
{
    //identifies the side of the triangle
    private int side;
    public ETriangle(int side)
    {
        super("ETriangle");
        this.side=side;
    }
    //Calculates and returns the area of the triangle
    @Override
    public double getArea(){
        return ((Math.pow(3,.5)*.25)*side*side);
    }
    //Calculates and returns the perimeter of the triangle
    @Override
    public double getPerimeter(){
        return side*3;
    }
}
