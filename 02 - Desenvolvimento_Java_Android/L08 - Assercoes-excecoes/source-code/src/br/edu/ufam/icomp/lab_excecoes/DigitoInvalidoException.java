package br.edu.ufam.icomp.lab_excecoes;

public class DigitoInvalidoException extends RoverCoordenadaException {
	private static final long serialVersionUID = 1L;

	public DigitoInvalidoException() {
		this( "Digito da coordenada inválido");
		// TODO Auto-generated constructor stub
	}

	public DigitoInvalidoException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	
}