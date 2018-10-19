public class Runner
{
    public static void main(String[] args)
    {
        Shape shape1 = new Circle(6);
        Shape shape2 = new ETriangle(8);
        Shape shape3 = new Rectangle(9,4);
        Shape shape4 = new Ellipse(5,7);
        Shape shape5 = new ITriangle(4,6);
        Shape shape6 = new Rectangle(4);

        Shape[] shapes = {shape1, shape2, shape3,shape4, shape5, shape6 };

        for (Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My area is " + cur.getArea());
            System.out.println("My perimeter is " + cur.getPerimeter());
        }
    }
}
