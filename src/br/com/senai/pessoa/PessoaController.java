package br.com.senai.pessoa;
import java.util.List;
import java.util.Scanner;

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
		System.out.println("|-------------- MENU --------------|");
		System.out.println("|1 -> Cadastrar Pessoas            |");
		System.out.println("|2 -> Lista de Pessoas Cadastradas |");
		System.out.println("|3 -> Cadastrar Produto            |");
		System.out.println("|4 -> Listar Produtos cadastrados  |");
		System.out.println("|9 -> Sair do Sistema              |");
		System.out.println("|----------------------------------|");
		System.out.println("\n");
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
		
		System.out.print("Informe o pa�s: ");
		tec.nextLine();
		pessoa.setNomeDoPais(tec.nextLine());
		
		System.out.print("Informe a sigla do P�is: ");
		pessoa.setUfDoPais(tec.nextLine());
		
		System.out.print("Informe o Estado: ");
		pessoa.setNomeDoEstado(tec.nextLine());
		
		System.out.print("Informe a sigla do Estado: ");
		pessoa.setUfDoEstado(tec.nextLine());
		
		System.out.print("Informe o nome da Cidade: ");
		pessoa.setNomeDaCidade(tec.nextLine());
		
		System.out.print("Informe a Rua: ");
		pessoa.setRua(tec.nextLine());
		
		System.out.print("Informe o Bairro: ");
		pessoa.setBairro(tec.nextLine());
		
		System.out.print("Informe o numero da casa: ");
		pessoa.setNumero(tec.nextLine());
		
		System.out.print("Informe o complemento: ");
		pessoa.setComplemento(tec.nextLine());
		return pessoa;
	}
	
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		System.out.println("\n");
		System.out.println("---- PESSOAS CADASTRADADS ----");
		System.out.println("\n");
		
		System.out.printf("| %20s | %4s | %5s | %4s | %10s | %10s | %20s | %10s | %20s | %10s | %10s | %10s | %10s |\n" , 
				"Nome" , "Ano" , "Idade" , "Altura", "Pa�s", "Sigla do pais", "Estado", "Sigla do Estado", "Nome da Cidade","Rua","Bairro","Numero da casa","Complemento");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %20s | %4d | %5d | %6.2f | %10s | %10s | %20s | %10s | %20s | %10s | %10s | %10s | %10s |\n" , 
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDoPais(),
					pessoas.get(i).getUfDoPais(),
					pessoas.get(i).getNomeDoEstado(),
					pessoas.get(i).getUfDoEstado(),
					pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getRua(),
					pessoas.get(i).getBairro(),
					pessoas.get(i).getNumero(),
					pessoas.get(i).getComplemento());
		}
		System.out.println("\n");
		return pessoas;
	}
}