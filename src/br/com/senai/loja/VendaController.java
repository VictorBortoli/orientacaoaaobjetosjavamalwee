package br.com.senai.loja;

import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;

public class VendaController {

	
private Scanner tec;
	
	public VendaController(){
		tec = new Scanner(System.in);
	}
	
	public int leOpcao(){
		System.out.print("Informe a op��o desejada -> ");
		return tec.nextInt();
	} 
	
	public void menu() {
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> Cadastrar Produtos            |");
		System.out.println("|2 -> Lista de Produtos Cadastrados |");
		System.out.println("|9 -> Sair do Sistema               |");
		System.out.println("|-----------------------------------|");
		System.out.println("\n");
	}
	
//	public Venda cadastrarProduto() {
//		Venda produto = new Venda();
//		
//		System.out.println("---- Cadastrar Produtos ----");
//		System.out.println("\n");
//		
//		System.out.print("Informe o nome do produto: ");
//		tec.nextLine();
//		produto.set(tec.nextLine());
//		
//		System.out.print("Informe o valor unit�rio do produto: ");
//		produto.setAnoDeNascimento(tec.nextInt());
//		
//		System.out.print("Informe a sua altura: ");
//		produto.setAltura(tec.nextDouble());
//		
//		System.out.print("Informe a quantidade comprada do produto: ");
//		tec.nextLine();
//		produto.setNomeDoPais(tec.nextLine());
//		
//		System.out.print("Informe a Sigla do Pa�s que voc� vive: ");
//		produto.setSiglaDoPais(tec.nextLine());
//		
//		System.out.print("Informe o Estado em que voc� reside: ");
//		produto.setNomeDoEstado(tec.nextLine());
//		
//		System.out.print("Informe o UF: ");
//		produto.setUf(tec.nextLine());
//		
//		System.out.print("Informe a Cidade que voc� reside: ");
//		produto.setNomeDaCidade(tec.nextLine());
//		
//		System.out.print("Informe o nome da Rua que voc� mora: ");
//		produto.setNomeDaRua(tec.nextLine());
//		
//		System.out.print("Informe o Bairro: ");
//		produto.setBairro(tec.nextLine());
//		
//		System.out.print("Complemento: ");
//		produto.setComplemento(tec.nextLine());
//		
//		System.out.print("N�mero: ");
//		produto.setNumero(tec.nextLine());
//		System.out.println("\n");
//		
//		return produto;
//	}
}
