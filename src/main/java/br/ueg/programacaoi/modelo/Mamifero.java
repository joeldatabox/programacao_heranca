package br.ueg.programacaoi.modelo;

public abstract class Mamifero extends Animal{
    private final String GRUPO="Mamifero";
    
    protected Mamifero(String LOCOMOCAO, String SEXO, String descricao) {
        super(LOCOMOCAO, SEXO, descricao);
    }

    public String getGrupo() {
        return GRUPO;
    }
    
}
