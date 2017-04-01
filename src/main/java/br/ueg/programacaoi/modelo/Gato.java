package br.ueg.programacaoi.modelo;


public class Gato extends Mamifero{
    public Gato(String sexo) {
        super("o gato se locomove entre 4 patas como o cachorro", sexo, "O gato mia");
    }

    @Override
    public String getParticularidade() {
        return "Corre atras do rato";
    }
}
