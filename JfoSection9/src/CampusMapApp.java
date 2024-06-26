
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CampusMapApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create dorms and center points, add them to a Pane
        Dorm dorm1 = new Dorm("Dorm1", 50, 100, 100);
        Dorm dorm2 = new Dorm("Dorm2", 30, 200, 200);
        CenterPoint centerPoint1 = new CenterPoint("Center1", 150, 150);
        CenterPoint centerPoint2 = new CenterPoint("Center2", 250, 250);

        Pane root = new Pane();
        root.getChildren().addAll(dorm1.getVisual(), dorm1.getLabel(),
                                  dorm2.getVisual(), dorm2.getLabel(),
                                  centerPoint1.getVisual(), centerPoint1.getLabel(),
                                  centerPoint2.getVisual(), centerPoint2.getLabel());

        // Set up the scene
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Campus Map");
        primaryStage.show();
    }
}
