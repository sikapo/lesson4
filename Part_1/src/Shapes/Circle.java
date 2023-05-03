package Shapes;

public class Circle implements Calkulateble {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calkArea() {
        return Math.PI * Math.sqrt(radius);
    }
}
