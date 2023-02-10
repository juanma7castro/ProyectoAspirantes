package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.AspirantesDTO;

public class AspirantesDAO {

	private Archivo archivo;
	/**
	 * Este metodo es el constructor de la clase y permite inicializar la instancia de las variables.
	 * <b>pre</b>La clase correspondiente se creo y se instanciaron los atributos y/o variables.<br>
	 * <b>post</b> Se inicializaron las variables.<br> 
	 * @param archivo
	 */
	public AspirantesDAO(Archivo archivo) {
		this.archivo = archivo;
	}
	/**
	 * Este metodo nos permite agregar aspirantes a la lista.
	 * <b>pre</b>Hay una lista creada donde almacenaremos los aspirantes creados<br>
	 * <b>post</b> Se ha agregado un aspirante a la lista.<br> 
	 * @param nombre Es el nombre de la persona. nombre != null, nombre != " "
	 * @param apellido Es el apellido de la persona. apellido != null, apellido != " "
	 * @param cedula Es el cedula de la persona. cedula != null, cedula != " "
	 * @param edad Es la edad de la persona.
	 * @param cargo Es el cargo de la persona. 
	 * @param ArrayList<AspirantesDTO>, file
	 */
	public void agregarCandidatos(String nombre, String apellido, String cedula, int edad, String cargo, ArrayList<AspirantesDTO> lista) {

		AspirantesDTO agragar = new AspirantesDTO(nombre, apellido, cedula, edad, cargo);
		lista.add(agragar);
		archivo.escribirArchivo(lista);
		JOptionPane.showMessageDialog(null, "Candidato agregado con cedula : "+cedula);

	}
	/**
	 * Este metodo nos permite ver la lista.
	 * <b>pre</b>Hay una lista creada de aspirantes y cada uno tiene toda su informacion<br>
	 * <b>post</b> Se ha devuelto la lista.<br> 
	 * return 
	 */
	public String verCandidatos() {
		ArrayList<AspirantesDTO> candidatos = archivo.leerArchivo();
		String texto  ="";
		for (int i = 0; i < candidatos.size(); i++) {
			texto = texto.concat(candidatos.get(i).toString()+"\n");
		}
		return "Candidatos: \n"+texto;
	}
	/**
	 * Este metodo nos permite buscar aspirantes a la lista.
	 * <b>pre</b>Hay una lista creada donde almacenamos los aspirantes creados<br>
	 * <b>post</b> Se devuelve el aspirante buscado.<br> 
	 * @param cedula Es el cedula de la persona. cedula != null, cedula != " "
	 * @param ArrayList<AspirantesDTO>, file
	 */
	public AspirantesDTO buscarCandidatos(String cedula, ArrayList<AspirantesDTO> lista) {
		AspirantesDTO encontrado=null;
		if(!lista.isEmpty()) {
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getCedula().equals(cedula)) {
					encontrado = lista.get(i);
					return encontrado;
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "No hay candidatos ");
		}
		return encontrado;
	}
	/**
	 * Este metodo nos permite eliminar aspirantes a la lista.
	 * <b>pre</b>Hay una lista creada donde almacenamos los aspirantes creados<br>
	 * <b>post</b> Se elimino el aspirante buscado.<br> 
	 * @param cedula Es el cedula de la persona. cedula != null, cedula != " "
	 * @param ArrayList<AspirantesDTO>, file
	 */
	public void eliminarCandidatos(String cedula, ArrayList<AspirantesDTO> lista) {

		if(buscarCandidatos(cedula, lista)!=null) {
			try {
				AspirantesDTO candidato = buscarCandidatos(cedula, lista);
				lista.remove(candidato);
				archivo.getArchivo().delete();
				archivo.getArchivo().createNewFile();
				archivo.escribirArchivo(lista);
				JOptionPane.showMessageDialog(null, "Candidato eliminado con cedula : "+cedula);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null, "No exite un candidato con la cedula : "+cedula);
		}

	}
	/**
	 * Este metodo nos permite modificar datos de los aspirantes de la lista.
	 * <b>pre</b>Hay una lista creada<br>
	 * <b>post</b> Se ha eliminado un aspirante de la lista.<br> 
	 * @param nombre Es el nombre de la persona. nombre != null, nombre != " "
	 * @param apellido Es el apellido de la persona. apellido != null, apellido != " "
	 * @param cedula Es el cedula de la persona. cedula != null, cedula != " "
	 * @param edad Es la edad de la persona.
	 * @param cargo Es el cargo de la persona. 
	 * @param ArrayList<AspirantesDTO>, file
	 */
	public void modificarCandidatos(String cedula1, String nombre, String apellido ,String cedula, int edad, String cargo, ArrayList<AspirantesDTO> lista) {

		if(buscarCandidatos(cedula, lista)!=null) {
			try {
				AspirantesDTO candidato = buscarCandidatos(cedula1, lista);
				lista.remove(candidato);
				archivo.getArchivo().delete();
				archivo.getArchivo().createNewFile();
				archivo.escribirArchivo(lista);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null, "No existe un candidato con la cedula : "+cedula);
		}

		AspirantesDTO agragar = new AspirantesDTO(nombre, apellido, cedula, edad, cargo);
		lista.add(agragar);
		archivo.escribirArchivo(lista);

		JOptionPane.showMessageDialog(null, "Candidato modificado con cedula : "+cedula);

	}


}

