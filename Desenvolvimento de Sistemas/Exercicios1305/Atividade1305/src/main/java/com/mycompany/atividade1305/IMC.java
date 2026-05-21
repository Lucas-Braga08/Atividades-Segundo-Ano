package com.mycompany.atividade1305;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IMC extends JFrame {

    JLabel peso, altura, resultado;
    JTextField tpeso, taltura;
    JButton calcular;

    public IMC() {

        super("Calculadora IMC");

        Container tela = getContentPane();
        setLayout(null);

        peso = new JLabel("Peso (Kg):");
        altura = new JLabel("Altura (cm):");

        tpeso = new JTextField(5);
        taltura = new JTextField(5);

        calcular = new JButton("Calcular");

        resultado = new JLabel("");

        peso.setBounds(40, 40, 100, 20);
        tpeso.setBounds(120, 40, 100, 20);

        altura.setBounds(40, 80, 100, 20);
        taltura.setBounds(120, 80, 100, 20);

        calcular.setBounds(100, 130, 100, 25);

        resultado.setBounds(40, 190, 300, 20);

        calcular.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    double p, a, imc;

                    p = Double.parseDouble(tpeso.getText());
                    a = Double.parseDouble(taltura.getText());

                    imc = p / (a * a);

                    resultado.setVisible(true);

                    if (imc < 18) {

                        resultado.setText("Abaixo do peso");

                    } else if (imc <= 24.99) {

                        resultado.setText("Peso ideal");

                    } else {

                        resultado.setText("Acima do peso");
                    }
                }
            }
        );

        resultado.setVisible(false);

        tela.add(peso);
        tela.add(altura);

        tela.add(tpeso);
        tela.add(taltura);

        tela.add(calcular);

        tela.add(resultado);

        setSize(350, 280);
        setVisible(true);
    }

    public static void main(String[] args) {

        IMC app = new IMC();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
