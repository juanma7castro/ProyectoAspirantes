package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.AspirantesDTO;

public class Archivo {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
//	private File archivo = new File("c:\\datos\\basedatos.dat");
	private File archivo = new File("datos/basedatos.dat");
	/**
	 * Este metodo es el constructor de la clase y permite inicializar la instancia de las variables.
	 * <b>pre</b>La clase correspondiente se creo y se instanciaron los atributos y/o variables.<br>
	 * <b>post</b> Se inicializaron las variables.<br> 
	 */
	public Archivo() {
		if(archivo.exists()) {
			System.out.println("El archivo ya existe");
		} else {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * Este metodo permite escribir en el archivo. 
	 * <b>pre</b>El archivo está creado y la lista tambien<br>
	 * <b>post</b> Se escribio en el archivo.<br> 
	 * @param ArrayList<MujerDTO>
	 * @param File
	 */
	public void escribirArchivo(ArrayList<AspirantesDTO> candidatos) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(candidatos);
			salida.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Este metodo permite leer los datos del archivo
	 * <b>pre</b>El archivo está creado y contiene datos<br>
	 * <b>post</b> Se leyeron los datos del archivo.<br>
	 * return candidatos
	 */
	public ArrayList<AspirantesDTO> leerArchivo(){
		ArrayList<AspirantesDTO> candidatos = new ArrayList<AspirantesDTO>();
		if(archivo.length()!=0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));
				candidatos = (ArrayList<AspirantesDTO>) entrada.readObject();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return candidatos;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindaran su valor actual <br>
	 * @return the entrada
	 */
	public ObjectInputStream getEntrada() {
		return entrada;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * @param entrada the entrada to set
	 */
	public void setEntrada(ObjectInputStream entrada) {
		this.entrada = entrada;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindaran su valor actual <br>
	 * @return the salida
	 */
	public ObjectOutputStream getSalida() {
		return salida;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * @param salida the salida to set
	 */
	public void setSalida(ObjectOutputStream salida) {
		this.salida = salida;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindaran su valor actual <br>
	 * @return the archivo
	 */
	public File getArchivo() {
		return archivo;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * @param archivo the archivo to set
	 */
	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}
	 
}
