package EX1_Slide56;
/*
 * 1) Criar uma classe chamada Pessoa com 2 construtores, um que receba o nome e a idade da pessoa e outro 
 * recebendo apenas a idade. 
 * Solicite ao usu�rio qual dos construtores ele gostaria de utilizar na instancia��o da classe. Al�m de 
 * receber  par�metros, os construtores imprimem na tela o conte�do dos par�metros recebidos. 
 */

public class Pessoa {
	int idade;
	String nome;

	Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
		System.out.println("O nome da pessoa �: " + this.nome + " e a idade �: " + this.idade);
	}

	Pessoa(int idade) {
		this.idade = idade;
		System.out.println("A idade da Pessoa �: " + this.idade);
	}

}
