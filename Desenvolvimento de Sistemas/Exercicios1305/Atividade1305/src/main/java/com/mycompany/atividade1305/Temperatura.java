package com.mycompany.atividade1305;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temperatura extends JFrame {

    JLabel celsius, resultadoF, resultadoK;
    JTextField tc;
    JButton converter;

    public Temperatura() {

        super("Conversor de Temperatura");

        Container tela = getContentPane();
        setLayout(null);

        celsius = new JLabel("Graus Celsius:");

        tc = new JTextField(5);

        converter = new JButton("Converter");

        resultadoF = new JLabel("");
        resultadoK = new JLabel("");

        celsius.setBounds(40, 40, 120, 20);
        tc.setBounds(170, 40, 100, 20);

        converter.setBounds(100, 90, 100, 25);

        resultadoF.setBounds(40, 150, 250, 20);
        resultadoK.setBounds(40, 180, 250, 20);

        converter.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    double c, f, k;

                    c = Double.parseDouble(tc.getText());

                    f = (c * 9 / 5) + 32;

                    k = c + 273.15;

                    resultadoF.setVisible(true);
                    resultadoK.setVisible(true);

                    resultadoF.setText("Fahrenheit: " + f + " °F");

                    resultadoK.setText("Kelvin: " + k + " K");
                }
            }
        );

        resultadoF.setVisible(false);
        resultadoK.setVisible(false);

        tela.add(celsius);

        tela.add(tc);

        tela.add(converter);

        tela.add(resultadoF);
        tela.add(resultadoK);

        setSize(350, 280);
        setVisible(true);
    }

    public static void main(String[] args) {

        Temperatura app = new Temperatura();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
