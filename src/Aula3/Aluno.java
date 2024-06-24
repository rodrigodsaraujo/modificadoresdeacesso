package Aula3;

public class Aluno {
	private String nome;
	private int idade;
	
	// criando metodo para acessar o atributo atraves 
	// da classe
	// metodo get set 
	public void setNome(String nome){
		this.nome = nome;
		
	}
	
	// nesse caso nao é retorno vazio,estou utilizando o metodo tipo string
	//porque eu quero retornar o nome que esta privado
	public String getnome() {
		return nome;
		
	}
	
	public void setidade(int idade) {
		//criando condições 
		//estruturas condicionias 
		if (idade>0 && idade < 130) {
			this.idade = idade;
			System.out.println("Idade cadastrada com sucesso!!!");
		}
		else {
			System.out.println("idade invalida!");
		}
		
		
	}
	

}
