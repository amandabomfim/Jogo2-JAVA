package br.com.fiap.jogo2;

public class Jogo {
    public static void main(String[] args) {
        Fase fase = new Fase();

        Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago(10);
        BolaDeFogo bolaDeFogo = new BolaDeFogo(5);
        Dragao dragao = new Dragao();
        
        fase.carregar(guerreiro); 
        fase.carregar(mago); 
        fase.carregar(bolaDeFogo);
        fase.carregar(dragao); 
        
	}

}

