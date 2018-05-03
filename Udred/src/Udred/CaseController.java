package Udred;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TitledPane;
import javafx.scene.*;
import Udred.templates.CustomControl;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class CaseController {

    @FXML
    private TitledPane tlpCitizen;
    public TitledPane tlpCaseworker;
    public TitledPane tlpCaseInformation;
    public TitledPane tlpCaseInformation2;
    public TitledPane tlpMeeting;

    public VBox vBoxCitizens;
    public VBox vBoxCaseWorkers;
    public VBox vBoxCaseInformation;
    public VBox vBoxMeetings;




    @FXML
    public void initialize() throws IOException {


        Node citizen = (Node)FXMLLoader.load(getClass().getResource("templates/Citizen.fxml"));
        tlpCitizen.setContent(citizen);


        Node caseWorker = (Node)FXMLLoader.load(getClass().getResource("templates/CaseWorker.fxml"));
        tlpCaseworker.setContent(caseWorker);


        Node caseInformation = (Node)FXMLLoader.load(getClass().getResource("templates/CaseInformation.fxml"));
        tlpCaseInformation.setContent(caseInformation);


        Node caseInformation2 = (Node)FXMLLoader.load(getClass().getResource("templates/CaseInformation.fxml"));
        tlpCaseInformation2.setContent(caseInformation2);


        Node meeting = (Node)FXMLLoader.load(getClass().getResource("templates/Meeting.fxml"));
        tlpMeeting.setContent(meeting);

        // translate the titledpane arrow and header so that the arrow is displayed to right of the header.
//        StackPane connectivityArrow = (StackPane) tlpCitizen.lookup(".arrow");
//        connectivityArrow.translateXProperty().bind(
//                tlpCitizen.widthProperty().subtract(connectivityArrow.widthProperty().multiply(2))
//        );
//        Pane connectivityTitle = (Pane) tlpCitizen.lookup(".header");
//        connectivityTitle.translateXProperty().bind(
//                connectivityArrow.widthProperty().negate()
//        );
    }

    public void addCitizen() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Ny Borger");
        Node citizen = (Node)FXMLLoader.load(getClass().getResource("templates/Citizen.fxml"));
        cst.setContent(citizen);
        vBoxCitizens.getChildren().add(cst);
    }

    public void addCaseWorker() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Ny Sagsbehandler");
        Node citizen = (Node)FXMLLoader.load(getClass().getResource("templates/CaseWorker.fxml"));
        cst.setContent(citizen);
        vBoxCaseWorkers.getChildren().add(cst);
    }
    public void addCaseInformation() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Ny Information");
        Node citizen = (Node)FXMLLoader.load(getClass().getResource("templates/CaseInformation.fxml"));
        cst.setContent(citizen);
        vBoxCaseInformation.getChildren().add(cst);
    }
    public void addMeeting() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Nyt Møde");
        Node citizen = (Node)FXMLLoader.load(getClass().getResource("templates/Meeting.fxml"));
        cst.setContent(citizen);
        vBoxMeetings.getChildren().add(cst);
    }



}
