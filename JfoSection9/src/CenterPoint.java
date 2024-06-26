import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class CenterPoint {
    private String name;
    private double x;
    private double y;

    // Constructor, getters, setters...

    public Circle getVisual() {
        Circle circle = new Circle(x, y, 5, Color.RED);
        return circle;
    }

    public Text getLabel() {
        Text label = new Text(x + 10, y + 10, name);
        return label;
    }
}
