abstract class Shape {
    protected String name;

    private String getName() {
        String n = String.valueOf(this.getClass());
        if (n.indexOf("class") == -1)
            this.name = n;
        else
            this.name = n.substring(6);
        return this.name;
    }

    public Shape(String name) {
        this.name = name;
    }
    public Shape() {
        this.name = getName();
    }

    @Override
    public String toString() {
        return name;
    }
    abstract double Square();
}
