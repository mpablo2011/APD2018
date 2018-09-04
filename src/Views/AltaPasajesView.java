package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.MainSistemaDeVentas;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaPasajesView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDesc;
	private JTextField textFieldFecha;
	private JTextField textFieldPrecio;
	private JTextField textFieldAerolinea;
	private JTextField textFieldOrigen;
	private JTextField textFieldDestino;
	
	private MainSistemaDeVentas sis = MainSistemaDeVentas.getInstancia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaPasajesView frame = new AltaPasajesView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AltaPasajesView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(21, 23, 81, 14);
		contentPane.add(lblDescripcion);
		
		textFieldDesc = new JTextField();
		textFieldDesc.setBounds(112, 20, 154, 20);
		contentPane.add(textFieldDesc);
		textFieldDesc.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio: ");
		lblPrecio.setBounds(23, 82, 56, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblFechaPasaje = new JLabel("Fecha Pasaje: ");
		lblFechaPasaje.setBounds(23, 57, 71, 14);
		contentPane.add(lblFechaPasaje);
		
		JLabel lblAerolinea = new JLabel("Aerolinea:");
		lblAerolinea.setBounds(21, 107, 69, 14);
		contentPane.add(lblAerolinea);
		
		JLabel lblOrigen = new JLabel("Origen:");
		lblOrigen.setBounds(21, 132, 46, 14);
		contentPane.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setBounds(21, 157, 46, 14);
		contentPane.add(lblDestino);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setColumns(10);
		textFieldFecha.setBounds(112, 54, 154, 20);
		contentPane.add(textFieldFecha);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(112, 79, 154, 20);
		contentPane.add(textFieldPrecio);
		
		textFieldAerolinea = new JTextField();
		textFieldAerolinea.setColumns(10);
		textFieldAerolinea.setBounds(112, 104, 154, 20);
		contentPane.add(textFieldAerolinea);
		
		textFieldOrigen = new JTextField();
		textFieldOrigen.setColumns(10);
		textFieldOrigen.setBounds(112, 129, 154, 20);
		contentPane.add(textFieldOrigen);
		
		textFieldDestino = new JTextField();
		textFieldDestino.setColumns(10);
		textFieldDestino.setBounds(112, 154, 154, 20);
		contentPane.add(textFieldDestino);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sis.grabarPasaje(textFieldDesc.getText(),textFieldFecha.getText(),
								  textFieldAerolinea.getText(),textFieldOrigen.getText(),
								  textFieldDestino.getText(),Float.parseFloat(textFieldPrecio.getText()));
			}
		});
		btnAceptar.setBounds(55, 214, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaPasajesView.this.setVisible(false);
				AltaProductosView view = new AltaProductosView();
         		view.setVisible(true);
			}
		});
		
		btnCancelar.setBounds(177, 214, 89, 23);
		contentPane.add(btnCancelar);
	}
}
