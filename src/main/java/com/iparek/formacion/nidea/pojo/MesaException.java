package com.iparek.formacion.nidea.pojo;

public class MesaException extends Exception {

	private static final long serialVersionUID = 1L;

	public static final String MENSAJE_PATAS = "Minimo debemos tener almenos 1 pata";

	public MesaException(String mensaje) {
		super(mensaje);
	}

}