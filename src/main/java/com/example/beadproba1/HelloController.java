package com.example.beadproba1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.Random;

public class HelloController {
    Random rnd = new Random();
    @FXML
    private Label massageLabel;

    @FXML
    private TextField nameField;

    @FXML
    private TextField minNum;

    @FXML
    private TextField maxNum;

    @FXML
    private Button restart;

    @FXML
    private Button tipButton;

    @FXML
    private Button startButton;

    @FXML
    private Label tipNumberlabel;

    @FXML
    private Label rangeLabel;

    @FXML
    private VBox gamevbox;

    @FXML
    private VBox startvbox;

    @FXML
    private Label errorLabel;

    private int numToSearch;
    int lastTipNumber;



    @FXML
    protected void startgame(){
        try {
            int minimum = Integer.parseInt(minNum.getText());
            int maximum = Integer.parseInt(maxNum.getText());
            numToSearch = rnd.nextInt(maximum - minimum + 1) + minimum;
            if(minimum >= maximum)
            {
                errorLabel.setText("a minimum nem lehet nagyobb mint a maximum!");
                return;
            }
        }catch (Exception e)
        {
            errorLabel.setText("Adj meg érvényes számokat!");
            return;
        }
        startvbox.setVisible(false);
        startvbox.setManaged(false);
        rangeLabel.setText("Tippelj egy számot " + minNum.getText() + " és " + maxNum.getText() + " között");
        gamevbox.setVisible(true);
        startButton.setDefaultButton(false);
        tipButton.setDefaultButton(true);
    }

    @FXML
    protected void testNum(){
        int tipNumber;
        try
        {
            tipNumber = Integer.parseInt(nameField.getText());
        }catch (Exception e)
        {
            massageLabel.setText("Adj meg érvényes számot!");
            return;
        }
        if (numToSearch > tipNumber)
        {
            massageLabel.setText("^Nagyobb a keresett szám!^");
        } else if (numToSearch < tipNumber) {
            massageLabel.setText("ˇKissebb a keresett szám!ˇ");
        } else {
            massageLabel.setText("Eltaláltad a számot!");
            massageLabel.setTextFill(Color.GREEN);
            tipNumberlabel.setVisible(false);
            tipNumber = 0;
            restart.setVisible(true);
        }

        tipNumberlabel.setText("Előző tippelt számod: " + lastTipNumber);
        nameField.setText("");
        nameField.requestFocus();
        if (tipNumber == 0){
            lastTipNumber = tipNumber;
        } else {
            lastTipNumber = tipNumber;
            tipNumberlabel.setVisible(true);
        }
    }

    public void resetNumber(){
        massageLabel.setText("");
        massageLabel.setTextFill(Color.RED);
        nameField.clear();
        startvbox.setVisible(true);
        startvbox.setManaged(true);
        errorLabel.setText("");
        gamevbox.setVisible(false);
        restart.setVisible(false);
        tipButton.setDefaultButton(false);
        startButton.setDefaultButton(true);
    }
}