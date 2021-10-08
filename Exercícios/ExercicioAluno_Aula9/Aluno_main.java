package ExercicioAluno_Aula9;

import java.util.ArrayList;
import java.util.List;

public class Aluno_main {

	public static void main(String[] args) throws AlunoException {
		
		Aluno a1 = new Aluno("Ana", 2.0, 7.0);
		Aluno a2 = new Aluno("Bia", 7.0, 10.0);
		Aluno a3 = new Aluno("Jorge", -3.0, 0.0);
		Aluno a4 = new Aluno("Carlos", 9.0, 10.0);
		
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		listaAluno.add(a1);
		listaAluno.add(a2);
		listaAluno.add(a3);
		listaAluno.add(a4);
		
		
		//System.out.println(listaAluno.toString());
		
		for (int i = 0; i < listaAluno.size(); i++) {
			
			Aluno estudante = (Aluno)listaAluno.get(i);
			System.out.println(estudante.toString());
				
		}
	
	}

}
