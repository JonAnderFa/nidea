package com.iparek.formacion.nidea.pojo;

public class Alert {
	private String mensaje;
	private String tipo;
	// Tipos de alertas
	public static final String TIPO_DANGER = "danger";
	public static final String TIPO_WARNING = "warning";
	public static final String TIPO_PRIMARY = "primary";

	public Alert() {
		super();
		this.mensaje = "Sentimos las molestias, tenemos un error inexperado";
		this.tipo = TIPO_DANGER;
	}

	public Alert(String mensaje) {
		this();
		this.mensaje = mensaje;
	}

	public Alert(String mensaje, String tipo) {
		this(mensaje);
		this.tipo = tipo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "alert [mensaje=" + mensaje + ", tipo=" + tipo + "]";
	}

}
