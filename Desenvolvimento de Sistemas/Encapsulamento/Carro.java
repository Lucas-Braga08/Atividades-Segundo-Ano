ackage com.mycompany.exemplocarro;

public class Carro { 
    public static void main (String[] args) {

    }    
       String cor;
       String modelo;
       String motor;
       
       void caracteristicas() {
    
    System.out.println("modelo: " +modelo);
    System.out.println("cor: " +cor);
    System.out.println("motor: " +motor);
    
    }
       
    void ligar() {
       System.out.println("Ligando o carro");
   }
   
   void desligar() {
       System.out.println("Desligando o carro");
   }
   void acelerar() {
       System.out.println("Acelerando o carro");
   }
   
   void brecar() {
       System.out.println("Brecando o carro");
   }
   
   void mudarMarcha() {
       System.out.println("Marcha engatada");
   }
  
}

