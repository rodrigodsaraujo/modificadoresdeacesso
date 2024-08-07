package Aula3;

public class AlunoTestar {

	public static void main(String[] args) {
		//instanciando a classe
		
		Aluno aluno1 = new Aluno();
		
		// ira apresentar um erro ao inserir
		//private no atributo  nome 
		// aluno1.nome = "Rodrigo";
		
		aluno1.setNome("Rodrigo");
		
		System.out.println(aluno1.getnome());
		
		//aluno.idade = 135;
		
		aluno1.setidade(135);

	}

}
