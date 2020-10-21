package carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carro_App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		List<Peca> pecas = new ArrayList<>();
		List<Fornecedor> fornecedores = new ArrayList<>();
		List<Carro> carros = new ArrayList<>();
		
		//Fornecedores
		Fornecedor f = new Fornecedor("12345678/0001-90", "Jos� AutoPe�as");
		fornecedores.add(f);
		f = new Fornecedor("91287463/0001-15", "AutoPe�as S�o Jo�o");
		fornecedores.add(f);
		f = new Fornecedor("68219014/0002-05", "Maria AutoPe�as");
		fornecedores.add(f);
		
		/*for (Fornecedor fd : fornecedores) {
			System.out.println(fd);
		}*/
		
		//Pe�as
		Peca p = new Peca(12, "Volante");
		pecas.add(p);
		p = new Peca(9, "Banco de Couro");
		pecas.add(p);
		p = new Peca(34, "Roda Aro 17");
		pecas.add(p);
		p = new Peca(51, "Pneu");
		pecas.add(p);
		p = new Peca(67, "Motor");
		pecas.add(p);
		
		/*for (Peca pe : pecas) {
			System.out.println(pe);
		}*/
		
		//Carros
		Carro c = new Carro("Fiat", "Argo", "9BFAG7AG5DP001234", 2020);
		carros.add(c);
		c = new Carro("Volkswagen", "Polo", "9BVPL8PL4TC026981", 2020);
		carros.add(c);
		c = new Carro("Honda", "City", "9BHCT4CT1SL007531", 2020);
		carros.add(c);
		
		int carroEncontrado = 0;
		int pecaEncontrada = 0;
		int fornecedorEncontrado = 0;
		//Itens
		System.out.println("Inserir item: ");
		System.out.print("Qual o chassi do carro? ");
		String chassi = ler.nextLine();
		for (Carro ca : carros) {
			if (ca.getChassi().equals(chassi)) {
				System.out.println("Carro encontrado.");
				carroEncontrado = 1;
				System.out.print("Qual o c�digo da pe�a a ser inserida? ");
				int cod = ler.nextInt();
				for (Peca pe : pecas) {
					if (pe.getCodigo() == cod) {
						System.out.println("Pe�a encontrada.");
						pecaEncontrada = 1;
						ler.nextLine();
						System.out.print("Qual o CNPJ do fornecedor da pe�a? ");
						String CNPJ = ler.nextLine();
						for (Fornecedor forn : fornecedores) {
							if (forn.getCNPJ().equals(CNPJ)) {
								System.out.println("Fornecedor encontrado.");
								fornecedorEncontrado = 1;
								System.out.print("Qual a quantidade da pe�a? ");
								int qnt = ler.nextInt();
								ler.nextLine();
								System.out.print("Qual a cor da pe�a? ");
								String cor = ler.nextLine();
								System.out.print("Qual o pre�o unit�rio da pe�a? ");
								double pu = ler.nextDouble();
								Item i = new Item(qnt, cor, pu, forn, pe);
								ca.getItens().add(i);
								ca.calcPrecoCusto();
								break;
							} 						
						}
						break;
					} 				
				}
				System.out.println();
				System.out.println(ca);
				break;
			} 
		}
		if (carroEncontrado == 0 ) {
			System.out.println("Carro n�o encontrado.");
		}
		if (pecaEncontrada == 0 ) {
			System.out.println("Pe�a n�o encontrada.");
		}
		if (fornecedorEncontrado == 0) {
			System.out.println("Fornecedor n�o encontrado.");
		}
		
		ler.close();
	}

}
