package DeberGUIS;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class Estudiantes extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Estudiantes() {
		setLayout(null);
		
		JPanel panel_datosGnerales = new JPanel();
		panel_datosGnerales.setBounds(24, 12, 542, 174);
		add(panel_datosGnerales);
		panel_datosGnerales.setLayout(null);
		
		JTextArea textArea_direccion = new JTextArea();
		textArea_direccion.setBounds(319, 71, 194, 91);
		panel_datosGnerales.add(textArea_direccion);
		
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setBounds(12, 52, 70, 15);
		panel_datosGnerales.add(lbl_nombre);
		
		JLabel lbl_nombre_1 = new JLabel("Apellido");
		lbl_nombre_1.setBounds(274, 27, 70, 15);
		panel_datosGnerales.add(lbl_nombre_1);
		
		JLabel lbl_telefono = new JLabel("Telefono");
		lbl_telefono.setBounds(12, 98, 70, 15);
		panel_datosGnerales.add(lbl_telefono);
		
		JLabel lbl_carnet = new JLabel("carnet");
		lbl_carnet.setBounds(12, 12, 70, 15);
		panel_datosGnerales.add(lbl_carnet);
		
		textField = new JTextField();
		textField.setBounds(86, 50, 114, 19);
		panel_datosGnerales.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(352, 25, 114, 19);
		panel_datosGnerales.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(86, 96, 114, 19);
		panel_datosGnerales.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(54, 10, 114, 19);
		panel_datosGnerales.add(textField_3);
		
		JPanel panel_control = new JPanel();
		panel_control.setBounds(24, 352, 542, 109);
		add(panel_control);
		panel_control.setLayout(null);
		
		table = new JTable();
		table.setBounds(34, 12, 477, 85);
		panel_control.add(table);
		
		JPanel panel_datosRegistrados = new JPanel();
		panel_datosRegistrados.setBounds(78, 235, 462, 52);
		add(panel_datosRegistrados);
		panel_datosRegistrados.setLayout(null);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(0, 12, 89, 25);
		panel_datosRegistrados.add(btnNuevo);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(85, 12, 111, 25);
		panel_datosRegistrados.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(201, 12, 111, 25);
		panel_datosRegistrados.add(btnSalir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(324, 12, 111, 25);
		panel_datosRegistrados.add(btnEliminar);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar.setBounds(24, 476, 51, 17);
		add(scrollBar);

	}
}
