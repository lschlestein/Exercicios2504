package EX2_Slide66;

/*
 * Uma empresa está cadastrando seus funcionários em sua base de dados. Sabendo que Funcionario é uma Pessoa,
 *  e que pessoas possuem (nome, idade e telefone), e que seus funcionários são divididos por (setor, cargo e função). 
 *  Crie uma classe executável, e cadastre 3 funcionários, preferencialmente solicitando as informações via console ao usuário. 
 *  Após esse cadastro, exiba esses funcionários na tela. 
 * A classe Funcionario deve herdar as características da classe Pessoa. 
 */
public class Funcionario extends Pessoa {// A clase Funcionario herda os atributos e métodos da classe Pessoa

	String setor;
	String cargo;
	String funcao;

	public void atribuirValores(String nome, int idade, String telefone, String setor, String cargo, String funcao) {
		super.nome = nome;//Super - Faz referência a superclasse Pessoa
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
		System.out.println("Funçâo: " + this.funcao);
		System.out.println();
	}

}
