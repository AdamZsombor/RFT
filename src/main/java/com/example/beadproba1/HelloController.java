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
    private Label tippeltszamlabel;

    @FXML
    private Label rangeLabel;

    @FXML
    private VBox jatekvbox;

    @FXML
    private VBox startvbox;

    @FXML
    private Label errorLabel;

    private int keresettszam;
    int elozolegTippeltSzam;


    @FXML
    protected void startgame(){
        try {
            int minimum = Integer.parseInt(minNum.getText());
            int maximum = Integer.parseInt(maxNum.getText());
            keresettszam = rnd.nextInt(maximum - minimum + 1) + minimum;
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
        jatekvbox.setVisible(true);

    }

    @FXML
    protected void szamteszt(){
        int tippeltSzam;
        try
        {
            tippeltSzam = Integer.parseInt(nameField.getText());
        }catch (Exception e)
        {
            massageLabel.setText("Adj meg érvényes számot!");
            return;
        }
        if (keresettszam > tippeltSzam)
        {
            massageLabel.setText("^Nagyobb a keresett szám!^");
        } else if (keresettszam < tippeltSzam) {
            massageLabel.setText("ˇKissebb a keresett szám!ˇ");
        } else {
            massageLabel.setText("Eltaláltad a számot!");
            massageLabel.setTextFill(Color.GREEN);
            tippeltszamlabel.setVisible(false);
            tippeltSzam = 0;
            restart.setVisible(true);
        }

        tippeltszamlabel.setText("Előző tippelt számod: " + elozolegTippeltSzam);
        if (tippeltSzam == 0){
            elozolegTippeltSzam = tippeltSzam;
        } else {
            elozolegTippeltSzam = tippeltSzam;
            tippeltszamlabel.setVisible(true);
        }
    }

    public void restarszam(){
        massageLabel.setText("");
        massageLabel.setTextFill(Color.RED);
        nameField.clear();
        startvbox.setVisible(true);
        startvbox.setManaged(true);
        errorLabel.setText("");
        jatekvbox.setVisible(false);
        //keresettszam = rnd.nextInt(50) + 1;
        restart.setVisible(false);
    }
}