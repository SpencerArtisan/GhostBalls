package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private TextArea codeTextArea;

    public void runCode(ActionEvent event) {
        String code = codeTextArea.getText();
        System.out.println(code);
    }
}
