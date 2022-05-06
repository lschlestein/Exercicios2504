package EX2_Slide66;

/*
 * Uma empresa está cadastrando seus funcionários em sua base de dados. Sabendo que Funcionario é uma Pessoa,
 *  e que pessoas possuem (nome, idade e telefone), e que seus funcionários são divididos por (setor, cargo e função). 
 *  Crie uma classe executável, e cadastre 3 funcionários, preferencialmente solicitando as informações via console ao usuário. 
 *  Após esse cadastro, exiba esses funcionários na tela. 
 * A classe Funcionario deve herdar as características da classe Pessoa. 
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
