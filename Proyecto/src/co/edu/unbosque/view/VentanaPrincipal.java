package co.edu.unbosque.view;

import java.awt.GridLayout;
//import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = -6769638857830900014L;
	private JButton crear;
	private JButton Ver;
	private JButton Actualizar;
	private JButton Borrar;
	/**
	 * Este metodo es el constructor de la clase y permite inicializar la instancia de las variables.
	 * <b>pre</b>La clase correspondiente se creo y se instanciaron los atributos y/o variables.<br>
	 * <b>post</b> Se inicializaron las variables.<br> 
	 */
	public VentanaPrincipal() {

		setTitle("Aspirantes");
		setSize(650, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2,15,15));
		initializeComponents();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * Este metodo nos permite inicializar lo componentes que deseamos tener en la VP.
	 * <b>pre</b>La clase correspondiente se creo y se instanciaron los atributos y/o variables.<br>
	 * <b>post</b> Se inicializaron las variables.<br> 
	 */

	public void initializeComponents() {

		crear = new JButton("Crear");
		crear.setActionCommand("Crear");
		add(crear);

		Ver = new JButton("Ver");
		Ver.setActionCommand("Ver");
		add(Ver);

		Actualizar = new JButton("Actualizar");
		Actualizar.setActionCommand("Actualizar");
		add(Actualizar);

		Borrar = new JButton("Borrar");
		Borrar.setActionCommand("Borrar");
		add(Borrar);

	}
	/**
	 * Este metodo nos permite mostrar mensajes al usuario.
	 * <b>pre</b>La clase con la que interactuaremos con el usuario esta creada<br>
	 * <b>post</b> Se mostro mensaje<br> 
	 * @param mensaje
	 * @param titulo
	 */
	public void mostrarMensaje(String message, String tittle) {
		JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
	}
	/**
	 * Este metodo nos permite capturar mensajes del usuario.
	 * <b>pre</b>La clase con la que interactuaremos con el usuario esta creada<br>
	 * <b>post</b> Se mostro mensaje<br> 
	 * @param mensaje
	 * @param titulo
	 */
	public String captureData(String message, String tittle) {
		return JOptionPane.showInputDialog(null, message, tittle, JOptionPane.QUESTION_MESSAGE);
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindara su valor actual <br>
	 * @return the crear
	 */
	public JButton getCrear() {
		return crear;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * 
	 * @param crear. boton para anadir un aspirante
	 */
	public void setCrear(JButton crear) {
		this.crear = crear;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindara su valor actual <br>
	 * @return the ver
	 */
	public JButton getVer() {
		return Ver;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * 
	 * @param ver boton para ver la lista
	 */
	public void setVer(JButton ver) {
		Ver = ver;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindara su valor actual <br>
	 * @return the actualizar
	 */
	public JButton getActualizar() {
		return Actualizar;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * 
	 * @param actualizar boton para modificar info
	 */
	public void setActualizar(JButton actualizar) {
		Actualizar = actualizar;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor
	 * <b>pre</b> la variable esta instanciada e inicializada <br>
	 * <b>post</b> Brindara su valor actual <br>
	 * @return the borrar
	 */
	public JButton getBorrar() {
		return Borrar;
	}
	/**
	 * Este metodo permite setear el valor de la variable 
	 * <b>pre</b> la variable esta inicializada <br>
	 * <b>post</b> Asignara un nuevo valor a la variable <br>
	 * 
	 * @param borrar boton para eliminar a un aspirante
	 */
	public void setBorrar(JButton borrar) {
		Borrar = borrar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}