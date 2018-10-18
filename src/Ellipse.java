public class Ellipse extends Shape
{
    private int a;
    private int b;
    public Ellipse (int a ,int b)
    {
        super("Ellipse");
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {return a*b*Math.PI;}
    @Override
    public double getPerimeter() { return Math.PI*(3*(a+b)-Math.sqrt((3*a+b)*(a+3*b)));}
}

