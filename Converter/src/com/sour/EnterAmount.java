package com.sour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EnterAmount extends JTextField implements FocusListener {

    private String placeholder = "Text";

    EnterAmount(String placeholder, Rectangle r){

        this.placeholder = placeholder;
        this.setText(this.placeholder);
        this.setBounds(r);
        this.addFocusListener(this);
        this.setForeground(Color.lightGray);

    }

    @Override
    public void focusGained(FocusEvent e) {

        if (this.getText().equals(placeholder)){

            this.setText("");
            this.setForeground(Color.black);

        }

    }

    @Override
    public void focusLost(FocusEvent e) {

        if (this.getText().isEmpty()){

            this.setForeground(Color.lightGray);
            this.setText(placeholder);

        }

    }
}
