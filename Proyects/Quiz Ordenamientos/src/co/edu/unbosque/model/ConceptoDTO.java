package co.edu.unbosque.model;

import java.io.Serializable;

public class ConceptoDTO implements Serializable{
	private String palabra;
	private String definicion;
	private String idioma;
	
	public ConceptoDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param palabra
	 * @param definicion
	 * @param idioma
	 */
	public ConceptoDTO(String palabra, String definicion, String idioma) {
		super();
		this.palabra = palabra;
		this.definicion = definicion;
		this.idioma = idioma;
	}
	
	@Override
	public String toString() {
		return palabra+": "+definicion+" idioma: "+idioma+"\n";
	}

	/**
	 * @return the palabra
	 */
	public String getPalabra() {
		return palabra;
	}

	/**
	 * @param palabra the palabra to set
	 */
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	/**
	 * @return the definicion
	 */
	public String getDefinicion() {
		return definicion;
	}

	/**
	 * @param definicion the definicion to set
	 */
	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	/**
	 * @return the idioma
	 */
	public String getIdioma() {
		return idioma;
	}

	/**
	 * @param idioma the idioma to set
	 */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
}
