package com.mycompany.exemplobotao;

import javax.swing.*;
import java.awt.*;

public class ExemploBotao extends JFrame {

    JButton botao1;
    JButton botao2;
    JButton botao3;
    ImageIcon icone;

    public ExemploBotao() {
        super("Exemplo com JButton");

        Container tela = getContentPane();
        setLayout(null);

        // Botão 1 (somente texto)
        botao1 = new JButton("Novo");
        botao1.setBounds(50, 20, 120, 30);

        // Ícone
        icone = new ImageIcon("apply.png");

        // Botão 2 (texto + ícone)
        botao2 = new JButton("Abrir", icone);
        botao2.setBounds(50, 70, 120, 30);

        // Botão 3 (somente ícone)
        botao3 = new JButton(icone);
        botao3.setBounds(50, 120, 120, 30);

        // Adicionando na tela
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);

        setSize(300, 220);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        ExemploBotao app = new ExemploBotao();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


