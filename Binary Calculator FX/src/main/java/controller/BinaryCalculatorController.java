package controller;

import hello.BinaryCalculator;
import hello.InvalidDivisionException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class BinaryCalculatorController {

    private BinaryCalculator model;

    @FXML
    private TextField firstNumber;

    @FXML
    private TextField secondNumber;

    @FXML
    private Label result;

    @FXML
    public void initialize(){
        model = new BinaryCalculator();
    }

    public void calculate(ActionEvent actionEvent){
        Button button = (Button) actionEvent.getSource();

        if(button.getId().equals("addButton")){
            result.setText(model.binaryAdd(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("subButton")){
            result.setText(model.binarySubtract(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("multButton")){
            result.setText(model.binaryMultiply(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("divButton")){
            try {
                result.setText(model.binaryDivide(firstNumber.getText(), secondNumber.getText()));
            } catch (InvalidDivisionException e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Division by zero!");
                alert.show();
            }
        }
    }


}
