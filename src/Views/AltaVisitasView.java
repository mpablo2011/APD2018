package Views;

import java.awt.BorderLayout;
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

public class AltaVisitasView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDesc;
	private JTextField textFieldFecha;
	private JTextField textFieldNombre;
	private JTextField textFieldPrecio;
	
	private MainSistemaDeVentas sis = MainSistemaDeVentas.getInstancia();
	private JTextField textFieldUbicacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaVisitasView frame = new AltaVisitasView();
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
	public AltaVisitasView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(21, 29, 72, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(21, 54, 59, 14);
		contentPane.add(lblFecha);
		
		JLabel lblNombreGuia = new JLabel("Nombre Guia: ");
		lblNombreGuia.setBounds(21, 79, 85, 14);
		contentPane.add(lblNombreGuia);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(22, 129, 72, 14);
		contentPane.add(lblPrecio);
		
		textFieldDesc = new JTextField();
		textFieldDesc.setBounds(124, 26, 142, 20);
		contentPane.add(textFieldDesc);
		textFieldDesc.setColumns(10);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setColumns(10);
		textFieldFecha.setBounds(124, 51, 142, 20);
		contentPane.add(textFieldFecha);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(124, 76, 142, 20);
		contentPane.add(textFieldNombre);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(124, 128, 142, 20);
		contentPane.add(textFieldPrecio);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sis.grabarVisita(textFieldDesc.getText(),textFieldFecha.getText(),
								 textFieldNombre.getText(),textFieldUbicacion.getText(),Float.parseFloat(textFieldPrecio.getText()));
			}
		});
		btnAceptar.setBounds(52, 210, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaVisitasView.this.setVisible(false);
				AltaProductosView view = new AltaProductosView();
         		view.setVisible(true);
			}
		});
		btnCancelar.setBounds(178, 210, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblUbicacion = new JLabel("Ubicacion: ");
		lblUbicacion.setBounds(20, 104, 73, 14);
		contentPane.add(lblUbicacion);
		
		textFieldUbicacion = new JTextField();
		textFieldUbicacion.setBounds(124, 101, 142, 20);
		contentPane.add(textFieldUbicacion);
		textFieldUbicacion.setColumns(10);
	}
}
