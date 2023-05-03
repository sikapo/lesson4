package Shapes;

public class Triangle implements Calkulateble {
    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calkArea() {
        return 0.5 * height * base;
    }
}
