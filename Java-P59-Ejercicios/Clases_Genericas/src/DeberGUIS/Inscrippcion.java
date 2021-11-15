package DeberGUIS;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;

public class Inscrippcion extends JPanel {
	private JTextField txt_nombreAlumno;

	/**
	 * Create the panel.
	 */
	public Inscrippcion() {
		setLayout(null);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(28, 38, 70, 24);
		add(lblCurso);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setBounds(28, 96, 70, 15);
		add(lblProfesor);
		
		JLabel lblNombreAlumno = new JLabel("Nombre Alumno:");
		lblNombreAlumno.setBounds(52, 148, 137, 15);
		lblNombreAlumno.setFont(new Font("Dialog", Font.BOLD, 13));
		add(lblNombreAlumno);
		
		JLabel lbl_titulo = new JLabel("Inscripción");
		lbl_titulo.setBounds(28, 0, 114, 15);
		add(lbl_titulo);
		
		txt_nombreAlumno = new JTextField();
		txt_nombreAlumno.setBounds(189, 146, 155, 19);
		add(txt_nombreAlumno);
		txt_nombreAlumno.setColumns(10);
		
		JLabel lbl_nombreCurso = new JLabel("Algoritmos3");
		lbl_nombreCurso.setBounds(104, 43, 129, 15);
		add(lbl_nombreCurso);
		
		JLabel lbl_nombreCurso_1 = new JLabel("Gabriel Yanez");
		lbl_nombreCurso_1.setBounds(110, 96, 129, 15);
		add(lbl_nombreCurso_1);
		
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_buscar.setBounds(199, 177, 145, 21);
		add(btn_buscar);
		
		JList list = new JList();
		list.setBackground(Color.LIGHT_GRAY);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Alumno\t                              Legajo", "Josue Muñoz                      4778", "Daniela Montalvo            23124"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(28, 272, 272, 60);
		add(list);
		
		JButton btn_inscribir = new JButton("Inscribir Nuevo");
		btn_inscribir.setBounds(82, 345, 145, 21);
		add(btn_inscribir);
		
		JButton btn_eliminar1 = new JButton("Eliminar");
		btn_eliminar1.setBounds(305, 268, 102, 25);
		add(btn_eliminar1);
		
		JButton btn_eliminar2 = new JButton("Eliminar");
		btn_eliminar2.setBounds(305, 305, 102, 25);
		add(btn_eliminar2);

	}
}
