package com.mycompany.atividade1305;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pitagoras extends JFrame {

    JLabel cat1, cat2, resultado;
    JTextField t1, t2;
    JButton calcular;

    public Pitagoras() {

        super("Teorema de Pitágoras");

        Container tela = getContentPane();
        setLayout(null);

        cat1 = new JLabel("Cateto A:");
        cat2 = new JLabel("Cateto B:");

        t1 = new JTextField(5);
        t2 = new JTextField(5);

        calcular = new JButton("Calcular");

        resultado = new JLabel("");

        cat1.setBounds(40, 40, 100, 20);
        t1.setBounds(140, 40, 100, 20);

        cat2.setBounds(40, 80, 100, 20);
        t2.setBounds(140, 80, 100, 20);

        calcular.setBounds(100, 130, 100, 25);

        resultado.setBounds(40, 190, 250, 20);

        calcular.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    double a, b, h;

                    a = Double.parseDouble(t1.getText());
                    b = Double.parseDouble(t2.getText());

                    h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                    resultado.setVisible(true);

                    resultado.setText("Hipotenusa: " + h);
                }
            }
        );

        resultado.setVisible(false);

        tela.add(cat1);
        tela.add(cat2);

        tela.add(t1);
        tela.add(t2);

        tela.add(calcular);

        tela.add(resultado);

        setSize(350, 280);
        setVisible(true);
    }

    public static void main(String[] args) {

        Pitagoras app = new Pitagoras();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
