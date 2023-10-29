import java.awt.*;

class ShapeTest {
    public static void main(String[] args) {
        final int shapeCount = 10;
        Shape[] shapes = new Shape[shapeCount];
        shapes[0] = new Circle(10);
        shapes[1] = new Circle("circle2");
        shapes[2] = new Rectangle(10);
        shapes[3] = new Rectangle("rectangle2",5,4);
        shapes[4] = new Quad(new Point(1,1),new Point(1,-1),new Point(-1,-1),new Point(-1,1));
        shapes[5] = new Quad("quad2", new Point(2,1),new Point(3,-2),new Point(-2,-1),new Point(-1,2));
        shapes[6] = new Line(12);
        shapes[7] = new Line("line2", 8);
        shapes[8] = new Triangle(new Point(3,2),new Point(2,-2),new Point(-1,-4));
        shapes[9] = new Triangle("triangle2", new Point(2,1),new Point(3,-2),new Point(-2,-1));

        for (Shape sp: shapes)
            System.out.println(sp.toString()+", площа (mm): "+sp.Square());
    }
}