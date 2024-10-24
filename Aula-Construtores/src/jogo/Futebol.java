package jogo;

import jogo.misc.Bola;
import jogo.misc.Quadra;
import jogo.pessoas.Juiz;

public class Futebol {
	private Juiz juiz;
	private Quadra quadra;
	private Bola bola;
	private Equipe mandante;
	private Equipe visitante;
	
	public Futebol(Juiz juiz, Quadra quadra, Bola bola, Equipe mandante, Equipe visitante) {
		super();
		this.juiz = juiz;
		this.quadra = quadra;
		this.bola = bola;
		this.mandante = mandante;
		this.visitante = visitante;
	}
	public Juiz getJuiz() {
		return juiz;
	}
	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}
	public Quadra getQuadra() {
		return quadra;
	}
	public void setQuadra(Quadra quadra) {
		this.quadra = quadra;
	}
	public Bola getBola() {
		return bola;
	}
	public void setBola(Bola bola) {
		this.bola = bola;
	}
	public Equipe getMandante() {
		return mandante;
	}
	public void setMandante(Equipe mandante) {
		this.mandante = mandante;
	}
	public Equipe getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipe visitante) {
		this.visitante = visitante;
	}
}
