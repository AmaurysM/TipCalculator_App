package com.example.tipcalculator_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class TipCalculatorController {

    @FXML
    private TextField AmountaTextField;

    @FXML
    private Button CalculateButton;

    @FXML
    private Slider PercentSlider;

    @FXML
    private Label PercentageTextField;

    @FXML
    private TextField TipTextField;

    @FXML
    private TextField ToTalTextFiled;

    @FXML
    private void sliderMoved(MouseEvent event){
        PercentageTextField.setText(String.valueOf(Math.round(PercentSlider.getValue())));
    }
    @FXML
    private void buttonPressed_CalculateTip(ActionEvent event) {
        try{
            System.out.println((Math.round(PercentSlider.getValue()) )/100.00);
            TipTextField.setText(String.valueOf(Double.valueOf(AmountaTextField.getText())*( (Math.round (PercentSlider.getValue()) )/100.00 )));
            ToTalTextFiled.setText(String.valueOf(Double.valueOf(AmountaTextField.getText()) + Double.valueOf(TipTextField.getText())));
        }catch (NumberFormatException ex){
            AmountaTextField.setText("Try Entering a Number");
        }
    }

}
