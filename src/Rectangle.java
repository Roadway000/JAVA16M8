class Rectangle extends Shape {
    @Override
    /**
     * The area of a rectangle is equal to the product of its adjacent sides
     * https://en.wikipedia.org/wiki/Rectangle
     */
    double Square() {
        return width * height;
    }
    private int width = 1;
    private int height = 1;
    /**
     * shape custom name, width, and height in millimeters
     */
    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    /**
     * takes one parameter to specify width and height with equal sides
     */
    public Rectangle(int width) {
        this.width = width;
        this.height = width;
    }
}
