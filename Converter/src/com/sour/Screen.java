package com.sour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {

    Eur euro = new Eur();
    Aud aus = new Aud();
    Usd usd = new Usd();
    Yen yen = new Yen();
    Gbp gbp = new Gbp();

    CurrencySelector topSelector;
    CurrencySelector bottomSelector;

    EnterAmount enterAmountTf;
    JButton convertBtn;

    String currency1;
    String currency2;
    double converted;

    JLabel toLabel;
    JLabel convertedLabel;

    Rectangle textFieldBounds;
    Rectangle topSelectorBounds;
    Rectangle bottomSelectorBounds;

    String[] currencies = {"Euro", "USD", "AUD", "Yen", "GBP"};


    Screen(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setSize(400,250);
        this.setFocusable(true);
        this.getContentPane().setBackground(Color.DARK_GRAY);

        textFieldBounds = new Rectangle(155,20,90,25);
        enterAmountTf = new EnterAmount("Enter amount", textFieldBounds);

        convertBtn = new JButton("Convert");
        convertBtn.setBounds(150, 135, 100,25);
        convertBtn.setFocusable(false);
        convertBtn.addActionListener(this);

        topSelectorBounds = new Rectangle(150,50,100,25);
        topSelector = new CurrencySelector(currencies, topSelectorBounds);

        toLabel = new JLabel("To");
        toLabel.setForeground(Color.white);
        toLabel.setBounds(150,75,100,25);
        toLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        bottomSelectorBounds = new Rectangle(150,100,100,25);
        bottomSelector = new CurrencySelector(currencies, bottomSelectorBounds);

        convertedLabel = new JLabel("Converted amount");
        convertedLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        convertedLabel.setForeground(Color.lightGray);
        convertedLabel.setBackground(Color.WHITE);
        convertedLabel.setOpaque(true);
        convertedLabel.setBounds(138, 170, 125, 25);

        this.add(enterAmountTf);
        this.add(convertBtn);
        this.add(topSelector);
        this.add(toLabel);
        this.add(bottomSelector);
        this.add(convertedLabel);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == convertBtn){

            currency1 = topSelector.getSelectedItem().toString();
            currency2 = bottomSelector.getSelectedItem().toString();

            if (currency1.equals("Euro")){
                euro.setAmount(Double.parseDouble(enterAmountTf.getText()));
                switch (currency2){
                    case "AUD" -> converted  = euro.toAud();
                    case "USD" -> converted = euro.toDollar();
                    case  "Yen" -> converted = euro.toYen();
                    case "Euro" -> converted = euro.getAmount();
                }

            } else if (currency1.equals("GBP")){
                gbp.setAmount(Double.parseDouble(enterAmountTf.getText()));
                switch (currency2){
                    case "AUD" -> converted  = gbp.toAud();
                    case "USD" -> converted = gbp.toDollar();
                    case  "Yen" -> converted = gbp.toYen();
                    case "Euro" -> converted = gbp.toEuro();
                    case "GBP" -> converted = gbp.getAmount();
                }

            }else if (currency1.equals("USD")){
                usd.setAmount(Double.parseDouble(enterAmountTf.getText()));
                switch (currency2){
                    case "AUD" -> converted  = usd.toAud();
                    case "GBP" -> converted = usd.toGbp();
                    case  "Yen" -> converted = usd.toYen();
                    case "Euro" -> converted = usd.toEuro();
                    case "USD" -> converted = usd.getAmount();
                }

            }else if (currency1.equals("AUD")){
                aus.setAmount(Double.parseDouble(enterAmountTf.getText()));
                switch (currency2){
                    case "AUD" -> converted  = aus.getAmount();
                    case "GBP" -> converted = aus.toGbp();
                    case  "Yen" -> converted = aus.toYen();
                    case "Euro" -> converted = aus.toEuro();
                    case "USD" -> converted = aus.toUsd();
                }

            }else if (currency1.equals("Yen")){
                yen.setAmount(Double.parseDouble(enterAmountTf.getText()));
                switch (currency2){
                    case "AUD" -> converted  = yen.toAud();
                    case "GBP" -> converted = yen.toGbp();
                    case  "Yen" -> converted = yen.getAmount();
                    case "Euro" -> converted = yen.toEuro();
                    case "USD" -> converted = yen.toUsd();
                }

            }
            convertedLabel.setForeground(Color.black);
            convertedLabel.setText("" + converted);

        }

    }
}
