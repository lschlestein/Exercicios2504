package EX2_Slide66;

/*
 * Uma empresa est� cadastrando seus funcion�rios em sua base de dados. Sabendo que Funcionario � uma Pessoa,
 *  e que pessoas possuem (nome, idade e telefone), e que seus funcion�rios s�o divididos por (setor, cargo e fun��o). 
 *  Crie uma classe execut�vel, e cadastre 3 funcion�rios, preferencialmente solicitando as informa��es via console ao usu�rio. 
 *  Ap�s esse cadastro, exiba esses funcion�rios na tela. 
 * A classe Funcionario deve herdar as caracter�sticas da classe Pessoa. 
 */

public class Pessoa {
	String nome;
	int idade;
	String telefone;
	
	public void atribuirValores(String nome, int idade, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}
}
