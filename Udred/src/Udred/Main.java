package Udred;

import Udred.Data.PostgresHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
        primaryStage.setTitle("Sensum Udred");
       // primaryStage.getIcons().add(new Image(File.pathSeparator+"Udred"+File.pathSeparator+"EG.png"));
//        primaryStage.getIcons().add(new Image("file:EG.png"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        PostgresHelper DB = new PostgresHelper();
        DB.connect();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
