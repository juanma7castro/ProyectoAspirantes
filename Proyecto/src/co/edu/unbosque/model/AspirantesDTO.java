package co.edu.unbosque.model;

import java.io.Serializable;

public class AspirantesDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	private String cedula;
	private int edad;
	private String cargo;
	/**
	 * Este metodo es el constructor de la clase y permite inicializar la instancia de las variables.
	 * <b>pre</b>La clase correspondiente se creo y se instanciaron los atributos y/o variables.<br>
	 * <b>post</b> Se inicializaron las variables.<br> 
	 * @param nombre
	 * @param alias
	 * @param correo
	 * @param edad
	 * @param estatura
	 * @param contrasena
	 * @param estado
	 * @param nLikes
	 * @param ingresos
	 */
	public AspirantesDTO(String nombre, String apellido, String cedula, int edad, String cargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.cargo = cargo;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * @return the nombre. Es el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * @param nombre Es el nombre de la persona. nombre != null, nombre != " "
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 *  Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindaran su valor actual <br>
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * @param apellido. es el apellido de la persona
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindaran su valor actual <br>
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * @param cedula. es la cedula del aspirante
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindaran su valor actual <br>
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * @param edad Es la edad de la persona. 
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindaran su valor actual <br>
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * Este metodo permite mostrar todos los valores actuales de los objetos de tipo Persona
	 * <b>pre</b> las variable estan instanciadas e inicializadas <br>
	 * <b>post</b> Brindara sus valores actuales <br>
	 * 
	 * @return String Nombre, apellido, cedula, Edad, cargo.
	 */
	@Override
	public String toString() {
		return "AspirantesDTO [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad
				+ ", cargo=" + cargo + "]";
	}
	
	
}
