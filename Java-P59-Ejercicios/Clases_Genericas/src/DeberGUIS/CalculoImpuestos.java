package DeberGUIS;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculoImpuestos extends JPanel {
	private JTextField txt_marca;
	private JTextField txtlinea;
	private JTextField text_modelo;
	private JTextField txt_valor;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public CalculoImpuestos() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JPanel panel_datosVehiculo = new JPanel();
		panel_datosVehiculo.setBounds(66, 39, 344, 163);
		add(panel_datosVehiculo);
		panel_datosVehiculo.setLayout(null);
		
		JLabel lblLinea = new JLabel("Linea");
		lblLinea.setBounds(49, 39, 49, 15);
		panel_datosVehiculo.add(lblLinea);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(39, 12, 49, 15);
		panel_datosVehiculo.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(49, 80, 65, 15);
		panel_datosVehiculo.add(lblModelo);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(49, 123, 65, 15);
		panel_datosVehiculo.add(lblValor);
		
		txt_marca = new JTextField();
		txt_marca.setBounds(164, 10, 114, 19);
		panel_datosVehiculo.add(txt_marca);
		txt_marca.setColumns(10);
		
		txtlinea = new JTextField();
		txtlinea.setColumns(10);
		txtlinea.setBounds(164, 37, 114, 19);
		panel_datosVehiculo.add(txtlinea);
		
		text_modelo = new JTextField();
		text_modelo.setColumns(10);
		text_modelo.setBounds(164, 78, 114, 19);
		panel_datosVehiculo.add(text_modelo);
		
		txt_valor = new JTextField();
		txt_valor.setEditable(false);
		txt_valor.setHorizontalAlignment(SwingConstants.CENTER);
		txt_valor.setText("0,0");
		txt_valor.setBackground(Color.LIGHT_GRAY);
		txt_valor.setColumns(10);
		txt_valor.setBounds(164, 109, 114, 19);
		panel_datosVehiculo.add(txt_valor);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(164, 136, 114, 15);
		panel_datosVehiculo.add(btnBuscar);
		
		JLabel lblDatos = new JLabel("Datos del vehiculo");
		lblDatos.setBounds(34, 12, 150, 15);
		add(lblDatos);
		
		JLabel lblDatos_1 = new JLabel("Descuentos");
		lblDatos_1.setBounds(34, 212, 118, 15);
		add(lblDatos_1);
		
		JLabel lblDatos_1_1 = new JLabel("Total");
		lblDatos_1_1.setBounds(34, 435, 70, 15);
		add(lblDatos_1_1);
		
		JPanel panel_descuentos = new JPanel();
		panel_descuentos.setBounds(66, 239, 344, 177);
		add(panel_descuentos);
		panel_descuentos.setLayout(null);
		
		JCheckBox chckbx_prontoPago = new JCheckBox("Pronto Pago");
		chckbx_prontoPago.setBounds(19, 23, 129, 23);
		panel_descuentos.add(chckbx_prontoPago);
		
		JCheckBox chckbx_trasladoCuenta = new JCheckBox("Traslado de Cuenta");
		chckbx_trasladoCuenta.setBounds(152, 23, 164, 23);
		panel_descuentos.add(chckbx_trasladoCuenta);
		
		JCheckBox chckbx_servicioPublico = new JCheckBox("Servicio Publico");
		chckbx_servicioPublico.setBounds(19, 104, 154, 23);
		panel_descuentos.add(chckbx_servicioPublico);
		
		JPanel panel = new JPanel();
		panel.setBounds(66, 462, 344, 109);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblTotalAPagar = new JLabel("Total a Pagar");
		lblTotalAPagar.setBounds(12, 36, 95, 15);
		panel.add(lblTotalAPagar);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("0,00");
		textField.setBounds(12, 65, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnLipiar = new JButton("Limpiar");
		btnLipiar.setBounds(181, 31, 95, 20);
		panel.add(btnLipiar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setBounds(181, 62, 95, 20);
		panel.add(btnCalcular);

	}
}
