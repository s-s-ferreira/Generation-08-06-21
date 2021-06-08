package br.com.generation.poo;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario dev = new Funcionario ();
		
		dev.setNome("Sara Ferreira");
		dev.setIdade(22);
		dev.setLocal("São Paulo");
		dev.setCargo("Desenvolvedor Java Júnior");
		dev.setSalario(2500);
		
		System.out.println("Funcionário (a): " + dev.getNome());
		System.out.println("Idade: " + dev.getIdade());
		System.out.println("Local: " + dev.getLocal());
		System.out.println("Cargo: " + dev.getCargo());
		System.out.println("Salário: " + dev.getSalario());
		
	}

}
