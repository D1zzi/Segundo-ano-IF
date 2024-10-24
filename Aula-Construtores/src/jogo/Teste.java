package jogo;

import jogo.misc.Bola;
import jogo.misc.Quadra;
import jogo.pessoas.Jogador;
import jogo.pessoas.Juiz;
import jogo.pessoas.Treinador;

public class Teste {

	public static void main(String[] args) {
		
		Jogador j11 = new Jogador("Roger");
		Jogador j12 = new Jogador("Gabriel");
		Jogador j13 = new Jogador("Freud");
		Jogador j14 = new Jogador("Benjamin");
		Jogador j15 = new Jogador("Trevor");
		
		Jogador j21 = new Jogador("Eduardo");
		Jogador j22 = new Jogador("Pablo");
		Jogador j23 = new Jogador("Enrico");
		Jogador j24 = new Jogador("Pedro");
		Jogador j25 = new Jogador("Jonas");
		
		Juiz x1 = new Juiz("Frederico");
		Bola b1 = new Bola("Nike");
		Quadra q1 = new Quadra(20,40);
		
		Treinador t1 = new Treinador("Homes");
		Treinador t2 = new Treinador("Trovador");
		
		Equipe gremio = new Equipe("Grêmio",t1,j11,j12,j13,j14,j15);
		Equipe inter = new Equipe("Inter",t2,j21,j22,j23,j24,j25);
		
		Futebol jogo = new Futebol(x1,q1,b1,inter,gremio);
		
		System.out.println(jogo.getBola().getMarca());
		System.out.println(jogo.getQuadra().getComprimento());
		System.out.println(jogo.getQuadra().getLargura());
		System.out.println(jogo.getJuiz().getNome());
		
		System.out.println(jogo.getMandante().getNome());
		System.out.println(jogo.getMandante().getAlaDireito().getNome());
		System.out.println(jogo.getMandante().getAlaEsquerdo().getNome());
		System.out.println(jogo.getMandante().getFixo().getNome());
		System.out.println(jogo.getMandante().getGoleiro().getNome());
		System.out.println(jogo.getMandante().getPivo().getNome());
		System.out.println(jogo.getMandante().getTreinador().getNome());
		
		System.out.println(jogo.getVisitante().getNome()	);
		System.out.println(jogo.getVisitante().getAlaDireito().getNome());
		System.out.println(jogo.getVisitante().getAlaEsquerdo().getNome());
		System.out.println(jogo.getVisitante().getFixo().getNome());
		System.out.println(jogo.getVisitante().getGoleiro().getNome());
		System.out.println(jogo.getVisitante().getPivo().getNome());
		System.out.println(jogo.getVisitante().getTreinador().getNome());
		
	}

}
