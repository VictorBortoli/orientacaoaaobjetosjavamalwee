package br.com.senai.exemplo;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.setNome("Victor");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("M");
		
		pessoa2.setNome("Carlos");
		pessoa2.setAnoDeNascimento(2001);
		pessoa2.setSexo("M");
		
		pessoa3.setNome("Gabriel");
		pessoa3.setAnoDeNascimento(2004);
		pessoa3.setSexo("M");
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		System.out.println("---PESSOAS CADASTRADAS COM FOR EACH---");
		for(Pessoa people : pessoas) {
			System.out.println(people);
			System.out.println(people);
			System.out.println(people);
			System.out.println("-------------------------");

		}
		
		System.out.println("---PESSOAS CADASTRADAS com FOR---");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
			System.out.println("*************************");
		}
		System.out.println("PESSOA CADASTRADAS COM FOR EACH LAMBDA");
		pessoas.forEach(alunos -> {
			System.out.println(alunos);
			System.out.println(alunos);
			System.out.println(alunos);
			System.out.println("##########################");
			
		});
		Scanner tec = new Scanner(System.in);
		MetodoController metodoController = new MetodoController();
		
		
		System.out.println("---TABUADA---");
		metodoController.multiplicar();
		
		System.out.println("---SOMA DE DOIS VALORES");
		System.out.println("A soma dá:" + metodoController.somar());
		
		System.out.println("---SUBTRAÇÂO DE VALORES por parametro---");
		System.out.println("Informe o primeiro valor");
		int valor1 = tec.nextInt();
		System.out.println("Informe o segundo valor");
		int valor2 = tec.nextInt();
		
		System.out.println("A Subtração dá: "
		+ metodoController.subtrair(valor1, valor2));
		
		
		
		
		
	}
}
