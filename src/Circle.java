class Circle extends Shape {
    //    @Override
    public Circle(int radius) { this.radius = radius; }
    public Circle(String name) { super(name); }
    double Square() {
        return 2 * Math.PI * radius * radius;
    }
    private int radius = 1; // mm
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
