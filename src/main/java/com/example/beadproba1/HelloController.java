package com.example.beadproba1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.util.Random;

public class HelloController {
    Random rnd = new Random();
    @FXML
    private Label massageLabel;

    @FXML
    private TextField nameField;

    @FXML
    private Button restart;

    private int keresettszam = rnd.nextInt(50)+1;
    @FXML
    private Label tippeltszamlabel;
    int elozolegTippeltSzam;

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
        keresettszam = rnd.nextInt(50) + 1;
        restart.setVisible(false);
    }
}