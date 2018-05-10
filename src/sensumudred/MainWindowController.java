package sensumudred;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainWindowController {

    public GridPane grdMain;
    public Button btnFindCase;
    public Button btnCreateCase;

    public void initialize() throws IOException {


    }

    public void showCaseEditor(ActionEvent event) throws IOException {
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("CaseEditor.fxml"));
        grdMain.getChildren().add(newLoadedPane);
    }

    public void showCaseFinder(ActionEvent event) throws IOException {
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("CaseFinder.fxml"));
        grdMain.getChildren().add(newLoadedPane);
    }



}
