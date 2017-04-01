package br.ueg.programacaoi.modelo;

public class Macaco extends Mamifero{

    public Macaco(String sexo) {
        super("O macaco se locomove atravez das arvores", sexo, "Pula de arvore em arvore");
    } 

    @Override
    public String getParticularidade() {
       return "come bananas";
    }
}
