//definición package
package com.ipartek.formacion.capitulo3;

//import (ahora mismo no tenemos ninguno)

//definición Clase
public class Mesa {

	// precio en €
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int PRECIO_MATERIAL_ACERO = 6;
	final int PRECIO_MATERIAL_ALUMINIO = 5;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;

	final String PRECIO_COLOR_NAME_CUSTOM = "custom";

	final int PRECIO_MADERA = 1;
	final int PRECIO_ACERO = 2;
	final int PRECIO_ALUMINIO = 3;
	final int PRECIO_PLASTICO = 4;

	// atributos
	// siempre privados para mantener la encapsulación
	private int numeroPatas;
	private int dimension;// m2
	private String color;
	private int material;

	/*
	 * 5. Métodos 5.1 Constructores 5.2 Getters y Setters 5.3 Otros
	 */

	/**
	 * sirve para documenta JavaDoc
	 * 
	 * @author para firmar
	 * @param numeroPatas
	 *            int en caso de ser negativo se inicializa con 0
	 */

	public Mesa() {
		super();
		// this.numeroPatas = 4;
		this.setNumeroPatas(numeroPatas);
	}

	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + "]";
	}

	public Mesa(int numeroPatas) {
		super();
		this.numeroPatas = numeroPatas;
	}

	/* getters y setters */

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		// si numero de patas es menos que cero, me devuelves un cero, si no las
		// patas q me pases
		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}

}
