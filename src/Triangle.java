import java.awt.*;

class Triangle extends Shape {

    @Override
    double Square() {
        return Math.abs((p1.x - p2.x) * (p1.y + p2.y) + (p2.x - p3.x) * (p2.y + p3.y) + (p3.x - p1.x) * (p3.y + p1.y)) / 2;
    }
    private Point p1 = new Point(1,1);
    private Point p2 = new Point(-1,1);
    private Point p3 = new Point(-1,-1);
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public Triangle(String name, Point p1, Point p2, Point p3) {
        this(p1,p2,p3);
        this.name = name;
    }
}
