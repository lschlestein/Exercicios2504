package EX1_Slide56;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int opcao = -1, idade;
		String nome;
		Pessoa pessoa;
		
		System.out.println("Deseja criar objeto Pessoa?");
		System.out.println("Digite 1 para nome e idade");
		System.out.println("Digite 2 idade");
		
		opcao = leitura.nextInt();
		
		if (opcao == 1) {
			System.out.println("Digite a idade da Pessoa:");
			idade = leitura.nextInt();
			System.out.println("Digite o nome da Pessoa");
			nome = leitura.nextLine();
			nome = leitura.nextLine();
			pessoa = new Pessoa(idade, nome);
		} else if (opcao == 2) {
			System.out.println("Digite a idade da Pessoa:");
			idade = leitura.nextInt();
			pessoa = new Pessoa(idade);
		}else {
			System.out.println("Opção Inválida!");
		}
		
		leitura.close();

	}
}
