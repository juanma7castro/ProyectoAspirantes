package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.AspirantesDTO;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.AspirantesDAO;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal vp;
	private ArrayList<AspirantesDTO> aspirantesDTO;
	private AspirantesDAO aspirantesDAO;
	private Archivo archivo;
	private int op;
	/**
	 * Este metodo es el constructor de la clase y permite inicializar la instancia de las variables.
	 * <b>pre</b>La clase correspondiente se cren y se instanciaron los atributos y/o variables.<br>
	 * <b>post</b> Se inicializaron las variables.<br> 
	 */
	public Controller() {
		vp = new VentanaPrincipal();
		ActionListener();
		aspirantesDTO = new ArrayList<AspirantesDTO>();
		archivo = new Archivo();
		aspirantesDTO = archivo.leerArchivo();
		aspirantesDAO = new AspirantesDAO(archivo);

	}
	/**
	 * Este metodo permite que el Controlador identifique las acciones que se estnn realizando con los botones. 
	 * <b>pre</b>Hay botones creados<br>
	 * <b>post</b> El botnn es capaz de identificar lo que estn pasando con los botones llamados.<br> 
	 */
	public void ActionListener() {
		vp.getCrear().addActionListener(this);
		vp.getVer().addActionListener(this);
		vp.getActualizar().addActionListener(this);
		vp.getBorrar().addActionListener(this);

	}

	public ArrayList<AspirantesDTO> getAspirantesDTO() {
		return aspirantesDTO;

	}
	/**
	 * Este metodo nos permite actualizar el nombre de un aspirante en lista. 
	 * <b>pre</b>Hay una lista creada de aspirantes y tiene elementos<br>
	 * <b>post</b> Se ha actualizado el nombre de un aspirante ya inscrito.<br>
	 * @param cedula. Es la cedula que se introducira para buscar a ese aspirante y cambiar su nombre. 
	 */
	public void actualizarNombre(String cedula) {
		for (int i = 0; i < getAspirantesDTO().size(); i++) {
			if ((getAspirantesDTO().get(i).getCedula().equals(cedula))) {
				String nombre = vp.captureData("Ingrese el nuevo nombre del aspirante: ", "nombre");
				String apellido = getAspirantesDTO().get(i).getApellido();
				int edad = getAspirantesDTO().get(i).getEdad();
				String cargo = getAspirantesDTO().get(i).getCargo();
				aspirantesDAO.modificarCandidatos(cedula, nombre, apellido, cedula, edad, cargo, getAspirantesDTO());
			}
		}
	}
	/**
	 * Este metodo nos permite actualizar la cedula de un aspirante en lista. 
	 * <b>pre</b>Hay una lista creada de aspirantes y tiene elementos<br>
	 * <b>post</b> Se ha actualizado la cedula de un aspirante ya inscrito.<br>
	 * @param cedula. Es la cedula que se introducira para buscar a ese aspirante y cambiar su cedula. 
	 */
	public void actualizarCedula(String cedula) {
		for (int i = 0; i < getAspirantesDTO().size(); i++) {
			if (!(getAspirantesDTO().get(i).getCedula().equals(cedula))) {
				String apellido = getAspirantesDTO().get(i).getApellido();
				String nombre = getAspirantesDTO().get(i).getNombre();
				int edad = getAspirantesDTO().get(i).getEdad();
				String cargo = getAspirantesDTO().get(i).getCargo();
				String cedulaNew = vp.captureData("Ingrese la nueva cedula del candidato: ", "cedula");
				aspirantesDAO.modificarCandidatos(cedula, nombre, apellido, cedulaNew, edad, cargo, getAspirantesDTO());
			}
		}

	}
	/**
	 * Este metodo nos permite actualizar el apellido de un aspirante en lista. 
	 * <b>pre</b>Hay una lista creada de aspirantes y tiene elementos<br>
	 * <b>post</b> Se ha actualizado el apellido de un aspirante ya inscrito.<br>
	 * @param cedula. Es la cedula que se introducira para buscar a ese aspirante y cambiar su apellido. 
	 */
	public void actualizarApellido(String cedula) {

		for (int i = 0; i < getAspirantesDTO().size(); i++) {
			if (getAspirantesDTO().get(i).getCedula().equals(cedula)) {
				String apellido = vp.captureData("Ingrese el nuevo apellido del candidato: ", "apelllido");
				String nombre = getAspirantesDTO().get(i).getNombre();
				int edad = getAspirantesDTO().get(i).getEdad();
				String cargo = getAspirantesDTO().get(i).getCargo();
				aspirantesDAO.modificarCandidatos(cedula, nombre, apellido, cedula, edad, cargo, getAspirantesDTO());
			}
		}
	}
	/**
	 * Este metodo nos permite actualizar la edad de un aspirante en lista. 
	 * <b>pre</b>Hay una lista creada de aspirantes y tiene elementos<br>
	 * <b>post</b> Se ha actualizado la edad de un aspirante ya inscrito.<br>
	 * @param cedula. Es la cedula que se introducira para buscar a ese aspirante y cambiar su edad. 
	 */
	public void actualizarEdad(String cedula) {

		for (int i = 0; i < getAspirantesDTO().size(); i++) {
			if ((getAspirantesDTO().get(i).getCedula().equals(cedula))) {
				String apellido = getAspirantesDTO().get(i).getApellido();
				String nombre = getAspirantesDTO().get(i).getNombre();
				int edad = getAspirantesDTO().get(i).getEdad();
				String cargo = vp.captureData("Ingrese el nuevo cargo del candidato: ", "cargo");
				aspirantesDAO.modificarCandidatos(cedula, nombre, apellido, cedula, edad, cargo, getAspirantesDTO());
			}
		}
	}
	
	/**
	 * Este metodo nos permite actualizar cargo de un aspirante en lista. 
	 * <b>pre</b>Hay una lista creada de aspirantes y tiene elementos<br>
	 * <b>post</b> Se ha actualizado el cargo de un aspirante ya inscrito.<br>
	 * @param cedula. Es la cedula que se introducira para buscar a ese aspirante y cambiar su cargo. 
	 */
	public void actualizarCargo(String cedula) {
		
		for (int i = 0; i < getAspirantesDTO().size(); i++) {
			if((getAspirantesDTO().get(i).getCedula().equals(cedula))) {
				String apellido = getAspirantesDTO().get(i).getApellido();
				String nombre = getAspirantesDTO().get(i).getNombre();
				int edad = getAspirantesDTO().get(i).getEdad();
				String cargo = vp.captureData("Ingrese el nuevo cargo del candidato: ", "cargo");
				aspirantesDAO.modificarCandidatos(cedula, nombre, apellido, cedula, edad, cargo, getAspirantesDTO());
			}
	    }		
	}
	/**
	 * Este metodo nos permite actualizar todos los datos de un aspirante en lista. 
	 * <b>pre</b>Hay una lista creada de aspirantes y tiene elementos<br>
	 * <b>post</b> Se ha actualizado toda la informacion de un aspirante ya inscrito.<br>
	 * @param cedula. Es la cedula que se introducira para buscar a ese aspirante y cambiar sus datos. 
	 */
	public void actualizarTodo(String cedula) {

		for (int i = 0; i < getAspirantesDTO().size(); i++) {
			if ((getAspirantesDTO().get(i).getCedula().equals(cedula))) {
				String nombre = vp.captureData("Ingrese el nuevo nombre del candidato: ", "nombre");
				String apellido = vp.captureData("Ingrese el nuevo apellido del candidato: ", "apelllido");
				String cedulaNew = vp.captureData("Ingrese la nueva cedula del candidato: ", "cedula");
				int edad = Integer.parseInt(vp.captureData("Ingrese la nueva edad del candidato: ", "edad"));
				String cargo = vp.captureData("Ingrese el nuevo cargo del candidato: ", "cargo");
				aspirantesDAO.modificarCandidatos(cedula, nombre, apellido, cedulaNew, edad, cargo, getAspirantesDTO());
			}
		}
	}
	 
	/**
	 * Este metodo emite las reacciones ante una previa accinn sobre un botnn. 
	 * <b>pre</b>Hay botones creados<br>
	 * <b>post</b> Se ha ejecutado la accinn correspondiente al botnn seleccionado.<br> 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
	
		String command = e.getActionCommand();

		if (command.equals("Crear")) {
			String nombre = vp.captureData("Ingrese el nombre del candidato: ", "nombre");
			String apellido = vp.captureData("Ingrese el apellido del candidato: ", "apellido");
			String cedula = vp.captureData("Ingrese la cedula del candidato: ", "cedula");
			int edad = Integer.parseInt(vp.captureData("Ingrese la edad del candidato", "edad"));
			String cargo = vp.captureData("Ingrese el cargo del candidato: ", "cargo");
			aspirantesDAO.agregarCandidatos(nombre, apellido, cedula, edad, cargo, getAspirantesDTO());
		}

		if (command.equals("Ver")) {

			String[] botons = { "Ver todos los candidatos", "Buscar un candidato" };
			op = JOptionPane.showOptionDialog(null, " ", " ", 0, JOptionPane.QUESTION_MESSAGE, null, botons, botons);

			if (op == 1) {
				String cedula = vp.captureData("Ingrese la cedula del candidato que busca: ", "cedula");
				if (aspirantesDAO.buscarCandidatos(cedula, getAspirantesDTO()) != null) {
					vp.mostrarMensaje("" + aspirantesDAO.buscarCandidatos(cedula, getAspirantesDTO()), "");
				} else {
					vp.mostrarMensaje("No existe un candidato con cedula " + cedula, "");
				}

			} else {
				vp.mostrarMensaje(aspirantesDAO.verCandidatos(), "");
			}
		}

		if (command.equals("Actualizar")) {

			String cedula = vp.captureData("Ingrese la cedula del candidato que desea modificar: ", "cedula");
			int hay = 0;

			for (int i = 0; i < getAspirantesDTO().size(); i++) {
				if ((getAspirantesDTO().get(i).getCedula().equals(cedula))) {
					hay = 1;

				} else {
					hay = 0;
				}
			}

			if (hay == 1) {
				String[] botons = { "nombre", "apellido", "cedula", "edad", "cargo", "todo" };
				op = JOptionPane.showOptionDialog(null, "Que desea modificar del candidato: ", " ", 0,
						JOptionPane.QUESTION_MESSAGE, null, botons, botons);
			} else {
				vp.mostrarMensaje("No exite un candidato con la cedula : " + cedula, "");
			}

			if (op == 0) {
				actualizarNombre(cedula);
			} else if (op == 1) {
				actualizarApellido(cedula);
			} else if (op == 2) {
				actualizarCedula(cedula);
			} else if (op == 3) {
				actualizarEdad(cedula);
			} else if (op == 4) {
				actualizarCargo(cedula);
			} else {
				actualizarTodo(cedula);
			}
		}

		if (command.equals("Borrar")) {

			String cedula = vp.captureData("Ingrese la cedula del candidato que desea eliminar: ", "cedula");
			aspirantesDAO.eliminarCandidatos(cedula, getAspirantesDTO());
		}

	}
}
