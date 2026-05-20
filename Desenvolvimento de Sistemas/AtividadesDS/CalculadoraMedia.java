package com.mycompany.media;

import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);

        System.out.println("Calculo de media");
        
        System.out.print("Digite o primeiro numero: ");
        double num1 = Num.nextDouble();
        
        System.out.print("Agora digite o segundo numero: ");
        double num2 = Num.nextDouble();
        
        System.out.print("Agora, o terceiro numero: ");
        double num3 = Num.nextDouble();
        
        calcularMedia(num1, num2, num3);
    }

    public static void calcularMedia(double num1, double num2, double num3) {
        double media = (num1 + num2 + num3) / 3;
        
        System.out.println("A media dos 3 números: " + media);
    }
}
