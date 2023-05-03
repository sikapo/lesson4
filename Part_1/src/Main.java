import Shapes.Calkulateble;
import Shapes.Circle;
import Shapes.Square;
import Shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Calkulateble[] shapes = new Calkulateble[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Triangle(5, 6);
        shapes[2] = new Square(8);

        double amount = 0;
        for (Calkulateble shape: shapes) {
            amount += amount + shape.calkArea();
        }
        String shortAmount = String.format("%.2f", amount);
        System.out.println("Sum of all shapes' square is " + shortAmount);
    }
}