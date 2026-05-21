package com.mycompany.atividade1305;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Triangulo extends JFrame {

    JLabel l1, l2, l3, resultado;
    JTextField t1, t2, t3;
    JButton verificar;

    public Triangulo() {

        super("Tipo de Triângulo");

        Container tela = getContentPane();
        setLayout(null);

        l1 = new JLabel("Lado 1:");
        l2 = new JLabel("Lado 2:");
        l3 = new JLabel("Lado 3:");

        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(5);

        verificar = new JButton("Verificar Tipo");

        resultado = new JLabel("");

        l1.setBounds(40, 30, 100, 20);
        t1.setBounds(120, 30, 100, 20);

        l2.setBounds(40, 70, 100, 20);
        t2.setBounds(120, 70, 100, 20);

        l3.setBounds(40, 110, 100, 20);
        t3.setBounds(120, 110, 100, 20);

        verificar.setBounds(90, 160, 130, 25);

        resultado.setBounds(40, 210, 250, 20);

        verificar.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    double a, b, c;

                    a = Double.parseDouble(t1.getText());
                    b = Double.parseDouble(t2.getText());
                    c = Double.parseDouble(t3.getText());

                    resultado.setVisible(true);

                    if (a == b && b == c) {

                        resultado.setText("Triângulo Equilátero");

                    } else if (a == b || a == c || b == c) {

                        resultado.setText("Triângulo Isósceles");

                    } else {

                        resultado.setText("Triângulo Escaleno");
                    }
                }
            }
        );

        resultado.setVisible(false);

        tela.add(l1);
        tela.add(l2);
        tela.add(l3);

        tela.add(t1);
        tela.add(t2);
        tela.add(t3);

        tela.add(verificar);

        tela.add(resultado);

        setSize(350, 320);
        setVisible(true);
    }

    public static void main(String[] args) {

        Triangulo app = new Triangulo();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
