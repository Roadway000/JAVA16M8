import java.awt.*;

class Quad extends Shape {
    @Override
    /**
     * Area of an arbitrary quadrilateral whose vertices are specified by coordinates (х1; у1), (х2; у2), (х3; у3), (х4; у4),
     * S = abs((х1 - х2) * (у1 + у2) + (х2 - х3) * (у2 + у3) + (х3 - х4) * (у3 + у4) + (х4 - х1) * (у4 + у1)) / 2
     */
    double Square() {
        return Math.abs((p1.x - p2.x) * (p1.y + p2.y) + (p2.x - p3.x) * (p2.y + p3.y) + (p3.x - p4.x) * (p3.y + p4.y) + (p4.x - p1.x) * (p4.y + p1.y)) / 2;
    }
    private Point p1 = new Point(1,1);
    private Point p2 = new Point(-1,1);
    private Point p3 = new Point(-1,-1);
    private Point p4 = new Point(-1,1);
    public Quad(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    public Quad(String name, Point p1, Point p2, Point p3, Point p4) {
        this(p1,p2,p3,p4);
        this.name = name;
    }
}
