package PlanningPoker.HLEstimation;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HLEstimationController {

    @FXML
    private Button btnNext;

    @FXML
    void openEfficiencyMetrics(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/PlanningPoker/EfficiencyMetrics/Screen5EfficiencyMetrics.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Efficiency Metrics");
        stage.setScene(scene);
        stage.show();
    }

}
