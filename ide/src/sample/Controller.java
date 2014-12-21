package sample;

import groovy.lang.GroovyClassLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private TextArea codeTextArea;

    private Main mainApp;

    public void runCode(ActionEvent event) {
        String code = codeTextArea.getText();
        System.out.println(code);
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}
