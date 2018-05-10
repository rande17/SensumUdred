package Udred.caseTemplates;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import Udred.GUI.Main;

public class CitizenController {

    @FXML
    public void initialize() {

    }

    public void mouseEnter(MouseEvent mouseEvent) {
        Main.MainController.mouseEnter(mouseEvent);
    }

    public void mouseExit(MouseEvent mouseEvent) {
        Main.MainController.mouseExit(mouseEvent);
    }

}
