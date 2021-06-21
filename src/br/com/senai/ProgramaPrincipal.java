package br.com.senai;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<>();

		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();

		boolean sair = false;

		do {

			pessoaController.menu();
			produtoController.menu();

			int opcao = pessoaController.leOpcao();
//			int opcao2 = produtoController.leOpcao();

			switch (opcao) {
			
			case 1:
				System.out.println("\n");
				pessoas.add(pessoaController.cadastrarPessoa());
				
				break;

			case 2:
				if (pessoas.isEmpty()) {
					System.out.println("\n");
					System.out.println("A lista est� vazia, cadastre alguma pessoa!");
					System.out.println("\n");
				} else {
					pessoaController.listarPessoas(pessoas);
				}
				
				break;
				
			case 3:
				System.out.println("\n");
				produtos.add(produtoController.cadastrarProduto());
				
				break;

			case 4:
				if (produtos.isEmpty()) {
					System.out.println("\n");
					System.out.println("A lista est� vazia, cadastre algum produto!");
					System.out.println("\n");
				} else {
					produtoController.listarProdutos(produtos);
				}

				break;
			
			case 5:
				produtoController.editarProduto(produtos);
				break;
				
			case 9:
				sair = true;
				
				break;

			default:
				System.out.println("\n");
				System.out.println("Op��o Inv�lida!!");
				
				break;

			}
		} while (!sair);

		System.out.println("\n");
		System.out.println("Sistema Finalizado!!!");
	}
}