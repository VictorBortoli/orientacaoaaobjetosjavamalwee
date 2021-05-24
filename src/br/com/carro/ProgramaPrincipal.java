package br.com.carro;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.setMarca("BMW");
		carro1.setModelo("M4");
		carro1.setAno(2021);
		carro1.setQtdPortas("4");
		
		carro2.setMarca("Ferrari");
		carro2.setModelo("Italia 458");
		carro2.setAno(2019);
		carro2.setQtdPortas("2");
		
		carro3.setMarca("Lamborghini");
		carro3.setModelo("Huracan");
		carro3.setAno(2021);
		carro3.setQtdPortas("2");
		
		System.out.println("--- CARRO 1 ---");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getQtdPortas());
		System.out.println("---------------");
		
		System.out.println("--- CARRO 2 ---");
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getQtdPortas());
		System.out.println("---------------");
		
		System.out.println("--- CARRO 3 ---");
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAno());
		System.out.println(carro3.getQtdPortas());
		System.out.println("---------------");
		
	}
}
