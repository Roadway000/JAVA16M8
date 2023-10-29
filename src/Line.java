public class Line extends Shape {
    @Override
    double Square() {
        return 0;
    }
    private int length = 1;
    public Line(String name, int length) {
        super(name);
        this.length = length;
    }
    public Line(int length) {
        this.length = length;
    }
}
