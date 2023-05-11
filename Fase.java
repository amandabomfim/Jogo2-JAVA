package br.com.fiap.jogo2;

public class Fase {
    public void carregar(Movivel elemento) {
    	    elemento.exibir();

    	    if (elemento instanceof Dragao) {
    	        System.out.println("Um novo dragão foi exibido");
    	    }
    	}
}




