package exemplos;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.nome = "Renato";
		a1.sobrenome = "Garcia";
		a1.idade = 28;
		a1.matricula = 666219093;
		
		Aluno a2 = new Aluno();
		a1.nome = "Diogo";
		a1.sobrenome = "Vettorazzi";
		a1.idade = 17;
		a1.matricula = 2022305390;
		
		Professor p1 = new Professor();
		p1.nome = "Moser";
		p1.sobrenome = "Fagundes";
		p1.idade = 41;
		p1.area = "Programação <3";
		
		Disciplina d1 = new Disciplina();
		d1.nome = "Programação";
		d1.ano = 1;
		d1.professor = p1;
		d1.alunos.add(a1);
		d1.alunos.add(a2);
		
		// Imprimir todos os dados usando apenas d1
		
		System.out.println(d1.nome + "\n" + 
				d1.ano + "\n" +
				"\n" +
				"PROFESSOR:\n" +
				d1.professor.nome + "\n" +
				d1.professor.sobrenome + "\n" +
				d1.professor.idade + "\n" +
				d1.professor.area + "\n");
				
		for (int i = 0; i < d1.alunos.size(); i++) {
			System.out.println("ALUNO " + (i+1) + ":");
			System.out.println(d1.alunos.get(i).nome);
			System.out.println(d1.alunos.get(i).sobrenome);
			System.out.println(d1.alunos.get(i).idade);
			System.out.println(d1.alunos.get(i).matricula);
		}
		
	}

}
