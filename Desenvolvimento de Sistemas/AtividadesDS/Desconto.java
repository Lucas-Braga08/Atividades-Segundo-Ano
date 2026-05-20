package com.mycompany.desconto;

import java.util.Scanner;

public class Desconto {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("Calculo de preços");
        
        System.out.print("Digite o nome de um produto: ");
        String nome = valor.next();
        
        System.out.print("Agora digite o preço do produto: ");
        double preco = valor.nextDouble();
        
        calcularDesconto(nome, preco);
    }

    public static void calcularDesconto(String nome, double preco) {
        double desconto = preco - (preco * 0.15);
        
        System.out.println("O produto " + nome + " custa " + desconto + "R$ com um desconto de 15% aplicado");
    }
}
