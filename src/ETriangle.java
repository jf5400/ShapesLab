public class ETriangle extends Shape
{
    /**
     * identifies the side of the Equilateral triangle
     */
    private int side;
    public ETriangle(int side)
    {
        super("ETriangle");
        this.side=side;
    }
    /**
    * Calculates the area of an Equilateral triangle
    * @return the area calculated
    */
    public double getArea(){
        return ((Math.pow(3,.5)*.25)*side*side);
    }
    /**
     * Calculates the perimeter of an Equilateral triangles
     * @return the perimeter calculated
     */
    public double getPerimeter(){
        return side*3;
    }
}
