package br.com.fiap.jogo2;

public class BolaDeFogo implements Movivel {
    private int poder;

    public BolaDeFogo(int poder) {
        this.poder = poder;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public void mover(int x, int y) {
        
    }

	@Override
	public void exibir() {
		
	}
}

