package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.NumberConverter;

public class ConverterController {

    @FXML
    private TextField decimalNumber;

    @FXML
    private TextField binaryNumber;

    @FXML
    private TextField hexaNumber;

    @FXML
    private TextField octalNumber;

    @FXML
    private void initialize(){
        decimalNumber.textProperty().bindBidirectional(binaryNumber.textProperty(), new NumberConverter(10,2));
        decimalNumber.textProperty().bindBidirectional(hexaNumber.textProperty(), new NumberConverter(10,16));
        decimalNumber.textProperty().bindBidirectional(octalNumber.textProperty(), new NumberConverter(10,8));

    }
}
