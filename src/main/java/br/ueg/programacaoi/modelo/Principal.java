package br.ueg.programacaoi.modelo;

public class Principal {

    public static void main(String[] args) {
        Principal p = new Principal();
        Cachorro c = new Cachorro("M");
        Gato g = new Gato("F");
        Macaco m = new Macaco("M");
        
        System.out.println("IMPRIMINDO O CACHORRO");
        p.imprimeMamiferos(c);
        System.out.println("\n\n\n\n");
        System.out.println("IMPRIMINDO O GATO");
        p.imprimeMamiferos(g);
        System.out.println("\n\n\n\n");
        System.out.println("IMPRIMINDO O MACACO");
        p.imprimeMamiferos(m);
    }

    public void imprimeMamiferos(Animal animal) {
        if(animal instanceof Mamifero){
            System.out.println("É UMA INSTANCIA DA CLASSE Mamifero");
        }
        
        if(animal instanceof Cachorro){
            
        }
        
        System.out.println("GRUPO -> " + animal.getGrupo());
        System.out.println("DESCRICAO -> " + animal.getDescricao());
        System.out.println("PARTICULARIDADE -> " + animal.getParticularidade());
        System.out.println("LOCOMOCAO -> " + animal.getLocomocao());
        System.out.println("SEXO -> " + animal.getSexo());
    }
}
