package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private TextArea codeTextArea;

    private Main mainApp;

    public void runCode(ActionEvent event) {
        System.out.println(codeTextArea.getText());
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}
