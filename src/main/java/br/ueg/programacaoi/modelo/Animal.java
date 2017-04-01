package br.ueg.programacaoi.modelo;

public abstract class Animal {
    
    private final String LOCOMOCAO;
    private final String SEXO;
    private final String DESCRICAO;

    protected Animal(String LOCOMOCAO, String SEXO, String descricao) {
        this.LOCOMOCAO = LOCOMOCAO;
        this.SEXO = SEXO;
        this.DESCRICAO = descricao;
    }

    public String getDescricao() {
        return DESCRICAO;
    }

    public String getLocomocao() {
        return LOCOMOCAO;
    }

    public String getSexo() {
        return SEXO;
    } 
    
    public abstract String getGrupo();
    
    public abstract String getParticularidade();
}
