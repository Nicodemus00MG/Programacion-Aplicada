package Ejer5Autoboxing;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JComponent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;

public class PanelConversor extends JPanel {

	public JLabel lblValor;
	public JLabel lblCambio;
	public JLabel lblDenominaci;
	public JLabel lblTotal;
	public JComboBox cmb_denominacion;
	public JComboBox cmb_cambio;
	public CasaCambio cc;
	public JTextField txt_valor;
	public JTextField txt_total;
	private JButton btnOk;
	
	

	
	public PanelConversor() {
		setBackground(Color.BLACK);
		setLayout(null);
	
		
		

		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(30, 26, 395, 242);
	
	
		add(panel);
		panel.setLayout(null);

		lblValor = new JLabel("Valor");
		lblValor.setBounds(43, 29, 72, 33);
		panel.add(lblValor);

		lblCambio = new JLabel("Cambio");
		lblCambio.setBounds(34, 112, 70, 15);
		panel.add(lblCambio);

		lblDenominaci = new JLabel("Denominación");
		lblDenominaci.setBounds(152, 29, 100, 33);
		panel.add(lblDenominaci);

		lblTotal = new JLabel("Total");
		lblTotal.setBounds(149, 185, 41, 15);
		panel.add(lblTotal);

		cmb_denominacion = new JComboBox();
		cmb_denominacion.setBounds(270, 33, 108, 24);
		
		panel.add(cmb_denominacion);
	

		cmb_cambio = new JComboBox();
		cmb_cambio.setBounds(96, 107, 86, 24);
		
		panel.add(cmb_cambio);

		txt_valor = new JTextField();
		txt_valor.setBounds(23, 74, 114, 19);
		txt_valor.setText("0,0");
		panel.add(txt_valor);
		txt_valor.setColumns(10);

		txt_total = new JTextField();
		txt_total.setForeground(Color.WHITE);
		txt_total.setFont(new Font("Dialog", Font.PLAIN, 12));
		txt_total.setBackground(Color.DARK_GRAY);
		txt_total.setBounds(200, 196, 114, 19);
		txt_total.setText("0,0");
		txt_total.setColumns(10);
		panel.add(txt_total);
		
		btnOk = new JButton("OK!");
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_total.setText(toString().valueOf((Double)cc.conversorMoneda()));;
				
			}
		});
		btnOk.setBounds(43, 180, 72, 25);
		panel.add(btnOk);
		
		JLabel lbl_titulo = new JLabel("CONVERTIDOR DE MONEDA");
		lbl_titulo.setForeground(Color.WHITE);
		lbl_titulo.setBounds(140, 12, 201, 15);
		add(lbl_titulo);
		
		
		//Estableszco una comunicacion en mis paneles, clases a traves de referencias por argumentos 
		//lo logro a traves de mis constructores y establezco la instancia en el mismo
		
		cc=new CasaCambio(this);
		
		

	}
	
	
	
}
	
	
		
		
	


