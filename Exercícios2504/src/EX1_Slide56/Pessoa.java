package EX1_Slide56;
/*
 * 1) Criar uma classe chamada Pessoa com 2 construtores, um que receba o nome e a idade da pessoa e outro 
 * recebendo apenas a idade. 
 * Solicite ao usuário qual dos construtores ele gostaria de utilizar na instanciação da classe. Além de 
 * receber  parâmetros, os construtores imprimem na tela o conteúdo dos parâmetros recebidos. 
 */

public class Pessoa {
	int idade;
	String nome;

	Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
		System.out.println("O nome da pessoa é: " + this.nome + " e a idade é: " + this.idade);
	}

	Pessoa(int idade) {
		this.idade = idade;
		System.out.println("A idade da Pessoa é: " + this.idade);
	}

}
