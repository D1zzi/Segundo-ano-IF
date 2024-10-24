package jogo;

import jogo.misc.Bola;
import jogo.misc.Quadra;
import jogo.pessoas.Jogador;
import jogo.pessoas.Juiz;
import jogo.pessoas.Treinador;

public class Exemplo02 {

	public static void main(String[] args) {
		
		Treinador t1 = new Treinador();
		t1.setNome("Renatão da massa");
		Jogador j11 = new Jogador();
		j11.setNome("Trump");
		Jogador j12 = new Jogador();
		j12.setNome("Chirstiano");
		Jogador j13 = new Jogador();
		j13.setNome("Frentista");
		Jogador j14 = new Jogador();
		j14.setNome("Juan");
		Jogador j15 = new Jogador();
		j15.setNome("Newton");
		
		Equipe mandante = new Equipe();
		mandante.setNome("Grêmio");
		mandante.setTreinador(t1);
		mandante.setGoleiro(j11);
		mandante.setAlaDireito(j12);
		mandante.setAlaEsquerdo(j13);
		mandante.setFixo(j14);
		mandante.setPivo(j15);
		
		
		Treinador t2 = new Treinador();
		t2.setNome("Robson, o grande");
		Jogador j21 = new Jogador();
		j21.setNome("Jonas");
		Jogador j22 = new Jogador();
		j22.setNome("Ronílson");
		Jogador j23 = new Jogador();
		j23.setNome("Pedreiro");
		Jogador j24 = new Jogador();
		j24.setNome("Torrone");
		Jogador j25 = new Jogador();
		j25.setNome("Einstein");
		
		Equipe visitante = new Equipe();
		visitante.setNome("Botafogo");
		visitante.setTreinador(t2);
		visitante.setGoleiro(j21);
		visitante.setAlaDireito(j22);
		visitante.setAlaEsquerdo(j23);
		visitante.setFixo(j24);
		visitante.setPivo(j25);
		
		
		Juiz juiz = new Juiz();
		juiz.setNome("Froid");
		
		Bola bola = new Bola();
		bola.setMarca("Razer");
		
		Quadra quadra = new Quadra();
		quadra.setComprimento(40);
		quadra.setLargura(20);
		
		
		Futebol f = new Futebol();
		f.setBola(bola);
		f.setJuiz(juiz);
		f.setMandante(mandante);
		f.setVisitante(visitante);
		f.setQuadra(quadra);
		
		// Daqui em diante, usaremos apenas o objeto "f"
		
		System.out.println(f.getMandante().getTreinador().getNome());
		System.out.println(f.getQuadra().getLargura());
		System.out.println(f.getVisitante().getGoleiro().getNome());

	}

}
