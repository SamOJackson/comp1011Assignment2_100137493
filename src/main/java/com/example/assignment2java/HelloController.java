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
        HelloApplicationModel.PointsValues();
        System.out.println("Initialized.");

    }
    @FXML
    void buttonPressed(ActionEvent event) {
        invalid.setText("");
        StringBuilder sb = new StringBuilder();
        sb.append(input.getText());

        if(HelloApplicationModel.getValid(sb) == false) {
            invalid.setText("Game Over");
        }
        if (HelloApplicationModel.getAllValues(HelloApplicationModel.count2) == false){
            invalid.setText("Game Over");
        }
        if (!(((input.getText().toUpperCase().contains("A") || input.getText().toUpperCase().contains("E") || input.getText().toUpperCase().contains("I") || input.getText().toUpperCase().contains("O") || input.getText().toUpperCase().contains("U") || input.getText().toUpperCase().contains("Y")) && input.getText().toUpperCase().length() > 2) && input.getText().toUpperCase().length() < 8)) {
            invalid.setText("Invalid Word");
        } else if (HelloApplicationModel.getWords().contains(input.getText())) {
            for(String s :HelloApplicationModel.words) {
                if(s.length() == sb.length()){
                    invalid.setText("Invalid Word");
                }
            }
        } else {
            HelloApplicationModel.Counter(sb);
            letters.setText(HelloApplicationModel.getCounter());

            points.setText(HelloApplicationModel.Points(sb));

            character.setText(HelloApplicationModel.words(sb));
            System.out.println("Run Complete.");

        }
    }
}

