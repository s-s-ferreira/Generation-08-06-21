package br.com.generation.poo;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente ();
		
		paciente.setNome("Lucas Almeida");
		paciente.setIdade(25);
		paciente.setDiagnostico("COVID");
		paciente.setAlta("01/04/21");
		
		System.out.println("Paciente: " + paciente.getNome());
		System.out.println("Idade: " + paciente.getIdade());
		System.out.println("Diagnóstico: " + paciente.getDiagnostico());
		System.out.println("Data da alta: " + paciente.getAlta());
		

	}

}
