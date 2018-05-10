package sensumudred;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginWindowController {
    public Button btnLogin;

    public void initialize() throws IOException
    {

        btnLogin.setOnMouseClicked((event) ->
        {
                Parent root;
                try
                {
                    root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
                    Stage stage = new Stage();
                    stage.setTitle("Sensum Udred");
                    stage.getIcons().add(new Image("/Udred/EG.png"));
                    stage.setScene(new Scene(root, 700, 800));
                    stage.show();
                    // Hide this current window (if this is what you want)
                    ((Node)(event.getSource())).getScene().getWindow().hide();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            });

    }

}
