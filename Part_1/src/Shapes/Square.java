package Shapes;

public class Square implements Calkulateble {
    private final double side;

    public Square(double side) {
        this.side = side;
    }
    public double calkArea(){
        return Math.sqrt(side);
    }
}
