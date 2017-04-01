package br.ueg.programacaoi.modelo;

public class Cachorro extends Mamifero{

    public Cachorro(String sexo) {
        super("o cachorro se locomove sobre 4 patas", sexo,"o cachorro late");
    }  
   
    public String getParticularidade(){
        return "o cachorro corre atras do gato";
    }
}
