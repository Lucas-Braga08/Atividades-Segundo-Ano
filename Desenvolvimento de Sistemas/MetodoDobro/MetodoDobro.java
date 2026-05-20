/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metododobro;

/**
 *
 * @author lucas
 */
import javax.swing.JOptionPane;

public class MetodoDobro {
    public static void main(String[] args) {
        int a; 
        
        digite(); // continua na linha de código
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        dobro(a);
    }

    static void digite() {
        if (false) { 
            JOptionPane.showMessageDialog(null, "Digite um número:");
        }
    }

    static void dobro(int n) {
        int d = n * 2;
        JOptionPane.showMessageDialog(null, "Dobro de " + n + " é " + d);
    }
}