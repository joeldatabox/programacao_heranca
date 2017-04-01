package br.ueg.programacaoi.modelo;

public class Produto {

    private Double preco;
    private String tipo;
    private String categoria;
    private String fabricante;
    private String codBarra;
    private Double percImposto;

    public Produto(){
        preco = 0D;
    }
    
    public Double getPreco() {
        if(preco == null){
            preco = 0d;
        }
        return preco;
    }

    public void setPreco(Double preco) {
        if(preco <0d){
           throw new RuntimeException("Mensagem do sistema. Não é possivel utilizar preço menor que zero!!!!");
        }
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public Double getPercImposto() {
        return percImposto;
    }

    public void setPercImposto(Double percImposto) {
        this.percImposto = percImposto;
    }
    
    
    
    
}
