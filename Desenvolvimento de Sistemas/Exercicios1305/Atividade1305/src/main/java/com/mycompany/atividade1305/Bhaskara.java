package com.mycompany.atividade1305;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bhaskara extends JFrame {

    JLabel a, b, c, x1, x2;
    JTextField ta, tb, tc;
    JButton calcular;

    public Bhaskara() {

        super("Fórmula de Bhaskara");

        Container tela = getContentPane();
        setLayout(null);

        a = new JLabel("Valor de a:");
        b = new JLabel("Valor de b:");
        c = new JLabel("Valor de c:");

        ta = new JTextField(5);
        tb = new JTextField(5);
        tc = new JTextField(5);

        calcular = new JButton("Calcular");

        x1 = new JLabel("");
        x2 = new JLabel("");

        a.setBounds(40, 30, 100, 20);
        ta.setBounds(140, 30, 100, 20);

        b.setBounds(40, 70, 100, 20);
        tb.setBounds(140, 70, 100, 20);

        c.setBounds(40, 110, 100, 20);
        tc.setBounds(140, 110, 100, 20);

        calcular.setBounds(100, 160, 100, 25);

        x1.setBounds(40, 210, 250, 20);
        x2.setBounds(40, 240, 250, 20);

        calcular.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    double va, vb, vc, delta, r1, r2;

                    va = Double.parseDouble(ta.getText());
                    vb = Double.parseDouble(tb.getText());
                    vc = Double.parseDouble(tc.getText());

                    delta = Math.pow(vb, 2) - (4 * va * vc);

                    r1 = (-vb + Math.sqrt(delta)) / (2 * va);
                    r2 = (-vb - Math.sqrt(delta)) / (2 * va);

                    x1.setVisible(true);
                    x2.setVisible(true);

                    x1.setText("x' = " + r1);
                    x2.setText("x'' = " + r2);
                }
            }
        );

        x1.setVisible(false);
        x2.setVisible(false);

        tela.add(a);
        tela.add(b);
        tela.add(c);

        tela.add(ta);
        tela.add(tb);
        tela.add(tc);

        tela.add(calcular);

        tela.add(x1);
        tela.add(x2);

        setSize(350, 350);
        setVisible(true);
    }

    public static void main(String[] args) {

        Bhaskara app = new Bhaskara();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
