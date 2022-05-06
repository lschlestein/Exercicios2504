package EX4;

import java.util.Scanner;

/*
Crie uma classe chamada Moto com tr�s atributos (marca, modelo e cilindradas) e dois m�todos (atribuir valores e retornar valores).  
Na classe LocadoraVeiculos, crie um objeto do tipo Carro e dois objetos do tipo Moto, sendo que os objetos ser�o criados de acordo com a solicita��o desses dados ao usu�rio, via linha de execu��o, conforme exemplo abaixo (vide material fornecido).  
Ap�s a cria��o dos objetos, utilize o m�todo para retornar valores e exiba na tela o conte�do dos objetos criados 
 */

public class LocadoraVeiculos {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Carro carro = new Carro();
		Moto moto1 = new Moto();
		Moto moto2 = new Moto();
		
		String marca, modelo, cilindradas;
		System.out.println("Insira a marca da moto");
		marca = leitura.nextLine();
		System.out.println("Insira o modelo da moto");
		modelo = leitura.nextLine();
		System.out.println("Insira a cilindrada da moto");
		cilindradas = leitura.nextLine();
		
		moto1.atribuirValores(marca, modelo, cilindradas);

		System.out.println("Insira a marca da moto");
		marca = leitura.nextLine();
		System.out.println("Insira o modelo da moto");
		modelo = leitura.nextLine();
		System.out.println("Insira a cilindrada da moto");
		cilindradas = leitura.nextLine();
		
		moto2.atribuirValores(marca, modelo, cilindradas);
		
		System.out.println("Insira a marca do carro");
		marca = leitura.nextLine();
		System.out.println("Insira o modelo do carro");
		modelo = leitura.nextLine();
		leitura.close();
		
		carro.atribuirValores(marca, modelo);
		
		moto1.exibirValores();
		moto2.exibirValores();
		carro.exibirValores();

	}

}
