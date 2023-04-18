package br.edu.ufam.icomp.lab_excecoes;

public class Exception extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public String s;
	public Exception() {
		this("Arquivo texto não encontrado");

		// TODO Auto-generated constructor stub
	}
	public Exception(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	

}