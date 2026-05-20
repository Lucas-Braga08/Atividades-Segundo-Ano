package com.mycompany.pessoa;

public class ExemploPessoa{
      public static void main(String[] args) {
        Pessoa umaPessoa = new Pessoa();
        
        umaPessoa.nome = "Joao";
        umaPessoa.sexo= "Masculino";
        umaPessoa.país = "Brasil";
            
        umaPessoa.caracteristicas();
        umaPessoa.andar();
        umaPessoa.falar();
        umaPessoa.correr();
        umaPessoa.estudar();
        umaPessoa.brincar();
        
        umaPessoa = null;
    }
}
