package com.example.assignment2java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class HelloController {
    @FXML
    private TextField input;
    @FXML
    private TextArea character;
    /*@FXML
    private TextArea pointsper;
    */
    @FXML

    private TextField points;
    @FXML
    private TextArea letters;

    @FXML
    private TextField invalid;
    @FXML
    void initialize()
    {
        HelloApplicationModel.InitializeCount();
        //pointsper.setText(HelloApplicationModel.PointsValues());
        HelloApplicationModel.PointsValues();
        System.out.println("Initialized.");

    }
    @FXML
    void buttonPressed(ActionEvent event) {
        StringBuilder sb = new StringBuilder();
        sb.append(input.getText());

        if(HelloApplicationModel.getValid(sb) == false) {
            invalid.setText("Game Over");
        }
        if (HelloApplicationModel.getAllValues(HelloApplicationModel.count2) == false){
            invalid.setText("Game Over");
        }
        else if (!(((sb.toString().toUpperCase().contains("A") || sb.toString().toUpperCase().contains("E") || sb.toString().toUpperCase().contains("I") || sb.toString().toUpperCase().contains("O") || input.getText().toUpperCase().contains("U") || sb.toString().toUpperCase().contains("Y")) && sb.toString().toUpperCase().length() > 2) && sb.toString().toUpperCase().length() < 8)) {
            invalid.setText("Invalid Word");
        } else if (HelloApplicationModel.getWords().contains(input.getText().toUpperCase()) && HelloApplicationModel.getWords().length() == sb.length()) {
            invalid.setText("Invalid Word");

        } else {
            HelloApplicationModel.Counter(sb);
            letters.setText(HelloApplicationModel.getCounter());

            points.setText(HelloApplicationModel.Points(sb));

            character.setText(HelloApplicationModel.words(sb));
            System.out.println("Run Complete.");

        }
    sb.setLength(0);
    }
}

