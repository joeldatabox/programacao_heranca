package br.ueg.programacaoi.main;

import br.ueg.programacaoi.modelo.Produto;
import br.ueg.programacaoi.modelo.Produto1;
import javax.swing.JOptionPane;

public class Executar {
    public static void main(String[] args) {
        Produto p = new Produto();
        Produto1 p1 = new Produto1();
        try{
            p.setPreco(-1D);
        }catch(RuntimeException ex){
            JOptionPane
         .showMessageDialog
        (null, 
         ex.getMessage(), 
         "Mensagem do sistema!!!!!!!!!",
         JOptionPane.ERROR_MESSAGE);
        }
        p1.preco = -1D;
        
        p.setPreco(p.getPreco() * 2);
        
        System.out.println("p.getPreco() -> " + p.getPreco());
        System.out.println("p1.preco -> "+ p1.preco);
        
        
    }
}
