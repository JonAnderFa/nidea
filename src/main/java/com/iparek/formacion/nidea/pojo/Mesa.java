//Definicion package
package com.iparek.formacion.nidea.pojo;
//Import => ahora mismo no tenemos ninguno

//Definicion Clase
public class Mesa {

	// precio en �
	public static final int PRECIO_PATA = 1;
	public static final int PRECIO_M2 = 5;
	public static final int PRECIO_MATERIAL_MADERA = 4;
	public static final int PRECIO_MATERIAL_ACERO = 6;
	public static final int PRECIO_MATERIAL_ALUMINIO = 5;
	public static final int PRECIO_MATERIAL_PLASTICO = 2;
	public static final int PRECIO_COLOR_CUSTOM = 23;
	public static final String PRECIO_COLOR_NAME_CUSTOM = "custom";

	public static final int MATERIAL_MADERA = 1;
	public static final int MATERIAL_ACERO = 2;
	public static final int MATERIAL_ALUMINO = 3;
	public static final int MATERIAL_PLASTICO = 4;
	public static final String[] MATERIAL_LISTA = { "Madera", "Acero", "Aluminio", "Plastico" };
	public static final int[] MATERIAL_LISTA_CODIGO = { 1, 2, 3, 4 };

	// Atributos siempre en private para mantener la encapsulacion
	private int numeroPatas;
	private int dimension; // metros cuadrados
	private String color;
	private int material;
	private boolean custom;

	/*
	 * Metodos Constructores Getters y setters Otros Metodos
	 */

	// Constructor Vacio
	/*
	 * POr defecto las mesas tienen 4 patas blancas 1m2 y de madera
	 */
	public Mesa() {
		super();
		this.setNumeroPatas(4);
		this.setDimension(1);
		this.setColor("#ffffff");
		this.setMaterial(1);
		this.setCustom(false);
	}

	public Mesa(int material) {
		this();
		this.setMaterial(material);
	}

	// Constructor con atributos
	public Mesa(int numeroPatas, int dimension, String color, int material) {
		this(material);
		this.setNumeroPatas(numeroPatas);
		this.setDimension(dimension);
		this.setColor(color);
	}

	// Getter
	public boolean isCustom() {
		return custom;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public int getDimension() {
		return dimension;
	}

	public String getColor() {
		return color;
	}

	public int getMaterial() {
		return material;
	}

	// Setter
	public void setCustom(boolean custom) {
		this.custom = custom;
	}

	/**
	 * Sirve para documentar con JavaDoc
	 * 
	 * @author Jon Ander
	 * @param numeroPatas
	 *            en caso de ser negativo se inicializa en 1
	 */
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = (numeroPatas <= 0) ? 1 : numeroPatas;
	}

	public void setDimension(int dimension) {
		this.dimension = (dimension <= 0) ? 1 : dimension;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Sirve para que material en caso de no pasarle bien los argumentos inserte
	 * madera
	 * 
	 * @param material
	 *            1 Madera 2 Acero 3 Aluminio 4 Plastico
	 */
	public void setMaterial(int material) {
		if (material > 0 || material <= 4) {
			this.material = material;
		} else {
			this.material = 1;
		}
	}

	// Otros metodos
	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + "]";
	}

	public int getPrecio() {
		int precio = 0;
		// Empezamos sumando las patas
		precio = precio + (getNumeroPatas() * PRECIO_PATA);
		// Sumamos las dimensiones
		precio = precio + (getDimension() * PRECIO_M2);
		// color
		if (isCustom()) {
			precio = precio + PRECIO_COLOR_CUSTOM;

		}
		// Material
		String mate = "";
		int material = this.getMaterial();
		switch (material) {
		case 1: {
			precio = precio + PRECIO_MATERIAL_MADERA;
			mate = "Madera";
			break;
		}
		case 2: {
			precio = precio + PRECIO_MATERIAL_ACERO;
			mate = "Acero";
			break;
		}
		case 3: {
			precio = precio + PRECIO_MATERIAL_ALUMINIO;
			mate = "Aluminio";
			break;
		}
		case 4: {
			precio = precio + PRECIO_MATERIAL_PLASTICO;
			mate = "Platisco";

			break;
		}

		}
		// System.out.println("El precio total de su mesa de " + getNumeroPatas() + "
		// patas , de " + getDimension()
		// + " m2 y de " + mate + " es de: " + precio + "�");
		return precio;
	}

}
