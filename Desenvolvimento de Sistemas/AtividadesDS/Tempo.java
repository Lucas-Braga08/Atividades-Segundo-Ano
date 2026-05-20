package com.mycompany.tempo;

import java.util.Scanner;

public class Tempo {

    public static void main(String[] args) {
        Scanner Horas = new Scanner(System.in);

        System.out.println("Converter horas pra minutos");
        
        System.out.print("Digite a quantidade de horas que quer converter: ");
        double horas = Horas.nextDouble();
              
        converterParaHoras(horas);
    }

    public static void converterParaHoras(double horas) {
        double minutos = horas * 60;
        
        System.out.println("Isso da: " + minutos + "minutos");
    }
}
