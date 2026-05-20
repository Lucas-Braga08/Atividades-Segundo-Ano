package com.mycompany.hipotenusa;

import java.util.Scanner;

public class Hipotenusa {

    public static void main(String[] args) {
             Scanner sc = new
                Scanner(System.in);
        
        System.out.println("Cálculo da hipotenusa");
        
        
        System.out.println("Digite o valor da base");
        double b;
        b= sc.nextInt();
        
        System.out.println("Agora o valor da altura");
        double h;
        h = sc.nextInt();
        
        double formula = (b*b) + (h*h);
        System.out.println("O resultado é: " +formula);
      }
 
}