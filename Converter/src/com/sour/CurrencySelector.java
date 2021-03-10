package com.sour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencySelector extends JComboBox<String> implements ActionListener {

    private String currency = "Euro";

    CurrencySelector(String[] choices, Rectangle bounds){

        for (int i = 0; i < choices.length; i++) {

            this.addItem(choices[i]);

        }
        this.setFocusable(false);
        this.addActionListener(this);
        this.setBounds(bounds);

    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
