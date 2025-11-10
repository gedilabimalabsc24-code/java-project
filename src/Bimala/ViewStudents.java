package student.gui;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewStudents {
    public void showView() {
        VBox root = new VBox(10, new Label("List of Students (Demo view)"));
        root.setStyle("-fx-padding: 20;");
        Stage stage = new Stage();
        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("View Students");
        stage.show();
    }
}
