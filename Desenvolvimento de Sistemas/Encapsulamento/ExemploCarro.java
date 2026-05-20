package com.mycompany.exemplocarro;

class ExemploCarro {
    public static void main (String[] args) {
        Carro umCarro = new Carro();
        
        umCarro.modelo = "Gol";
        umCarro.cor = "Preto";
        umCarro.motor = "1.0";
            
        umCarro.ligar();
        umCarro.mudarMarcha();
        umCarro.acelerar();
        umCarro.brecar();
        umCarro.desligar();
        umCarro.caracteristicas();
        
        
        umCarro = null;
    }
}
