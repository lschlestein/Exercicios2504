package EX2_Slide66;

/*
 * Uma empresa est� cadastrando seus funcion�rios em sua base de dados. Sabendo que Funcionario � uma Pessoa,
 *  e que pessoas possuem (nome, idade e telefone), e que seus funcion�rios s�o divididos por (setor, cargo e fun��o). 
 *  Crie uma classe execut�vel, e cadastre 3 funcion�rios, preferencialmente solicitando as informa��es via console ao usu�rio. 
 *  Ap�s esse cadastro, exiba esses funcion�rios na tela. 
 * A classe Funcionario deve herdar as caracter�sticas da classe Pessoa. 
 */
public class Funcionario extends Pessoa {// A clase Funcionario herda os atributos e m�todos da classe Pessoa

	String setor;
	String cargo;
	String funcao;

	public void atribuirValores(String nome, int idade, String telefone, String setor, String cargo, String funcao) {
		super.nome = nome;//Super - Faz refer�ncia a superclasse Pessoa
		super.idade = idade;
		super.telefone = telefone;
		this.setor = setor;//This - Faz referencia aos atribudos DESSA classe
		this.cargo = cargo;
		this.funcao = funcao;
	}

	public void exibirValores() {
		System.out.println("Nome: " + super.nome);
		System.out.println("Idade: " + super.idade);
		System.out.println("Telefone: " + super.telefone);
		System.out.println("Setor: " + this.setor);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Fun��o: " + this.funcao);
		System.out.println();
	}

}
