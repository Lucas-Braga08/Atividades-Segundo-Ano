/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemcaracteres;

/**
 *
 * @author lucas
 */
import javax.swing.JOptionPane; //Cria uma interface gráfica para o usuário interagir

public class ContagemCaracteres
{
    public static void main(String[] args) //Declara o código como respectivo ao método main
    {        
    int t; //Estabelece uma variável t, correspondente ao tamanho da palavra
    String p; //Estabelece uma variável p, correspondente a palavra
    digite(); //Executa as instruções desenvolvidas dentro do método usado
    p= JOptionPane.showInputDialog("Digite uma palavra qualaquer: "); //Exibe a interface gráfica
    t=tamanho(p); // declara que a variável t será correspondente a quantos caracteres existem na variável p
    JOptionPane.showMessageDialog(null,p+ " possui "+t+" caracteres"); //Exibe a resposta
    }
static void digite() { //Declara o método digite
    if (false){ //Estrutura condicional para não exibir a caixa de diálogo abaixo
    JOptionPane.showMessageDialog(null, "Digite uma palavra"); //Caixa de diálogo 
}  
}    
static int tamanho(String x) // declara o método tamanho, que representa uma variável inteira e recebe um parâmetro x do tipo string
{        
    return x.length(); // retorna o tamanho que a string recebeu
}
}
