package com.mycompany.atividade1305;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MediaNotas extends JFrame {

    JLabel n1, n2, n3, n4, resultado;
    JTextField t1, t2, t3, t4;
    JButton calcular;

    public MediaNotas() {

        super("Média de Notas");

        Container tela = getContentPane();
        setLayout(null);

        n1 = new JLabel("Nota 1:");
        n2 = new JLabel("Nota 2:");
        n3 = new JLabel("Nota 3:");
        n4 = new JLabel("Nota 4:");

        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(5);
        t4 = new JTextField(5);

        calcular = new JButton("Calcular");

        resultado = new JLabel("");

        n1.setBounds(40, 30, 100, 20);
        t1.setBounds(120, 30, 100, 20);

        n2.setBounds(40, 60, 100, 20);
        t2.setBounds(120, 60, 100, 20);

        n3.setBounds(40, 90, 100, 20);
        t3.setBounds(120, 90, 100, 20);

        n4.setBounds(40, 120, 100, 20);
        t4.setBounds(120, 120, 100, 20);

        calcular.setBounds(120, 160, 100, 25);

        resultado.setBounds(40, 210, 250, 20);

        calcular.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    double nota1, nota2, nota3, nota4, media;

                    nota1 = Double.parseDouble(t1.getText());
                    nota2 = Double.parseDouble(t2.getText());
                    nota3 = Double.parseDouble(t3.getText());
                    nota4 = Double.parseDouble(t4.getText());

                    media = (nota1 + nota2 + nota3 + nota4) / 4;

                    resultado.setVisible(true);
                    resultado.setText("Média: " + media);
                }
            }
        );

        resultado.setVisible(false);

        tela.add(n1);
        tela.add(n2);
        tela.add(n3);
        tela.add(n4);

        tela.add(t1);
        tela.add(t2);
        tela.add(t3);
        tela.add(t4);

        tela.add(calcular);

        tela.add(resultado);

        setSize(350, 300);
        setVisible(true);
    }

    public static void main(String[] args) {

        MediaNotas app = new MediaNotas();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
