import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class Dorm {
    private String name;
    private int population;
    private double x;
    private double y;

    // Constructor, getters, setters...

    public Circle getVisual() {
        Circle circle = new Circle(x, y, 10, Color.BLUE);
        return circle;
    }

    public Text getLabel() {
        Text label = new Text(x - 20, y - 20, name + " (" + population + ")");
        return label;
    }
}
