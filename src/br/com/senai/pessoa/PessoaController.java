package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;

public class PessoaController {

	private Scanner tec;
	
	public PessoaController(){
		tec = new Scanner(System.in);
	}
	
	public int leOpcao(){
		System.out.print("Informe a op��o desejada -> ");
		return tec.nextInt();
	} 
	
	public void menu() {
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> Cadastrar Pessoas             |");
		System.out.println("|2 -> Lista de Pessoas Cadastradas  |");
	}
	
	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("---- Cadastrar Pessoas ----");
		System.out.println("\n");
		
		System.out.print("Informe o seu nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());
		
		System.out.print("Informe o seu Ano de Nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());
		
		System.out.print("Informe a sua altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe o Pa�s que voc� mora: ");
		tec.nextLine();
		pessoa.setNomeDoPais(tec.nextLine());
		
		System.out.print("Informe a Sigla do Pa�s que voc� vive: ");
		pessoa.setSiglaDoPais(tec.nextLine());
		
		System.out.print("Informe o Estado em que voc� reside: ");
		pessoa.setNomeDoEstado(tec.nextLine());
		
		System.out.print("Informe o UF: ");
		pessoa.setUf(tec.nextLine());
		
		System.out.print("Informe a Cidade que voc� reside: ");
		pessoa.setNomeDaCidade(tec.nextLine());
		
		System.out.print("Informe o nome da Rua que voc� mora: ");
		pessoa.setNomeDaRua(tec.nextLine());
		
		System.out.print("Informe o Bairro: ");
		pessoa.setBairro(tec.nextLine());
		
		System.out.print("Complemento: ");
		pessoa.setComplemento(tec.nextLine());
		
		System.out.print("N�mero: ");
		pessoa.setNumero(tec.nextLine());
		System.out.println("\n");
		
		return pessoa;
	}
	
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		
		if(pessoas.isEmpty()) {
			System.out.println(" N�o existem dados cadastrados");
			return null;
		}
	
		
		
		System.out.println("\n");
		System.out.println("----------------- PESSOAS CADASTRADADS ---------------");
		System.out.println("\n");
		
		System.out.printf("| %2s | %20s | %4s | %5s | %4s | %10s | %10s | %15s| %2s | %15s | %17s | %20s| %10s| %5s| \n" ,
				"Id","Nome" , "Ano" , "Idade" , "Altura", "Pa�s" , "Sigla P�is", "Estado" , "UF" , "Cidade" , "Rua" , "Bairro" , "Complemento" , "N�mero");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %2d | %20s | %4d | %5d | %6.2f | %10s | %10s | %10s | %2s | %13s | %10s | %10s | %10s | %5s| \n" ,
					i, 
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDoPais(),
					pessoas.get(i).getSiglaDoPais(),
					pessoas.get(i).getNomeDoEstado(),
					pessoas.get(i).getUf(),
					pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getNomeDaRua(),
					pessoas.get(i).getBairro(),
					pessoas.get(i).getComplemento(),
					pessoas.get(i).getNumero());
		}
		System.out.println("\n");

		return pessoas;
	}
	public List<Pessoa> editarPessoa (List<Pessoa> pessoas) {
		
		
		
		if(pessoas.isEmpty()) {
			System.out.println("\n");
			System.out.println("N�o tem pessoas cadastrados");
			System.out.println("\n");
			return null;
			
			
		}
		
		Pessoa pessoa = new Pessoa();
		listarPessoas(pessoas);
		
		System.out.print("Informe o ID do pessoa para editar -> ");
		int idPessoa = tec.nextInt() ;
		System.out.println("\n");
		
		System.out.println("|--- Campos a serem editados ---|");
		System.out.println("|1 -> Nome da pessoa            |");
		System.out.println("|2 -> Ano de nascimento         |");
		System.out.println("|3 -> Altura                    |");
		
		System.out.println("\n");
		System.out.print("Informe o campo que deseja editar -> ");
		int opcao = tec.nextInt();
		System.out.println("\n");
		switch (opcao) {
		
		case 1:
			System.out.println("---- Editar o nome da pessoa ----");
			System.out.println("\n");
			System.out.print("Informe novamente o nome da pessoa -> ");
			pessoa.setNome(tec.next());
			
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			
			pessoas.set(idPessoa, pessoa);
			
			System.out.println("\n");
			break;
			
		case 2:
			System.out.println("---- Editar Ano de Nascimento ----");
			System.out.println("\n");
			System.out.print("Informe novamente o ano de nascimento -> ");
			pessoa.setAnoDeNascimento(tec.nextInt ());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			
			pessoas.set(idPessoa, pessoa);
			
			System.out.println("\n");
			break;
		
		case 3:
			System.out.println("---- Editar a Altura ----");
			System.out.println("\n");
			System.out.print("Informe novamente a altura -> ");
			pessoa.setAltura(tec.nextDouble());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			
			pessoas.set(idPessoa, pessoa);
			
			System.out.println("\n");
			break;
			
		default:
			System.out.println("Op��o Inv�lida!!!!");
			break;
		
		}
		return pessoas;
	
	
	}
public void excluirPessoa(List<Pessoa> pessoas) {
		
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PESSOA ---");
		
		System.out.println("Informe o Id do produto para excluir: ");
		int idPessoa = tec.nextInt();
		
		if(pessoas.size() <= idPessoa) {
			System.out.println("Pessoa n�o cadastrado");
			return;
		}
		
		pessoas.remove(idPessoa);	
}
}