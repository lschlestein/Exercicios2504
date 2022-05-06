package EX2_Slide66;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();

		String nome, telefone, setor, cargo, funcao;
		int idade;

		Scanner leitura = new Scanner(System.in);

		f1.atribuirValores("João", 25, "55 99999-0000", "Compras", "Comprador", "Funcionario 1");

		System.out.println("Insira o nome");
		nome = leitura.nextLine();
		System.out.println("Insira a idade");
		idade = Integer.parseInt(leitura.nextLine());
		System.out.println("Insira o telefone");
		telefone = leitura.nextLine();
		System.out.println("Insira o Setor");
		setor = leitura.nextLine();
		System.out.println("Insira o Cargo");
		cargo = leitura.nextLine();
		System.out.println("Insira a Função");
		funcao = leitura.nextLine();
		f2.atribuirValores(nome, idade, telefone, setor, cargo, funcao);
		f3.atribuirValores(nome, idade, telefone, setor, cargo, funcao);

		f1.exibirValores();
		f2.exibirValores();
		f3.exibirValores();
	}

}
