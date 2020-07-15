package xadrez;

import tabuleirodejogo.Posicao;
import tabuleirodejogo.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		initialSetup();
	}
	
	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0 ; i<tabuleiro.getLinhas() ; i++) {
			for(int j=0 ; j<tabuleiro.getColunas() ; j++) {
				mat[i][j] = (PecaXadrez)tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		tabuleiro.lugarPeca(new Torre(tabuleiro,Cor.RED),new Posicao(2,1));
		tabuleiro.lugarPeca(new Rei(tabuleiro,Cor.BLUE),new Posicao(0,4));
		tabuleiro.lugarPeca(new Rei(tabuleiro,Cor.RED),new Posicao(7,4));
	}
}
