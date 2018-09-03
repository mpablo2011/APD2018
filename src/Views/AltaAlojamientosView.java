package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaAlojamientosView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaAlojamientosView frame = new AltaAlojamientosView();
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
	public AltaAlojamientosView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcion = new JLabel("Descripcion: ");
		lblDescripcion.setBounds(23, 23, 68, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblFechaDesde = new JLabel("Fecha desde: ");
		lblFechaDesde.setBounds(23, 48, 83, 14);
		contentPane.add(lblFechaDesde);
		
		JLabel lblFechaHasta = new JLabel("Fecha hasta: ");
		lblFechaHasta.setBounds(23, 73, 67, 14);
		contentPane.add(lblFechaHasta);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(23, 99, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrecio = new JLabel("Precio: ");
		lblPrecio.setBounds(23, 124, 73, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblUbicacion = new JLabel("Ubicacion: ");
		lblUbicacion.setBounds(23, 152, 58, 14);
		contentPane.add(lblUbicacion);
		
		textField = new JTextField();
		textField.setBounds(101, 20, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 45, 144, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 70, 144, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(101, 96, 144, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(101, 121, 144, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(101, 149, 144, 20);
		contentPane.add(textField_5);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(51, 204, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaAlojamientosView.this.setVisible(false);
				AltaProductosView view = new AltaProductosView();
         		view.setVisible(true);
			}
		});
		btnCancelar.setBounds(165, 204, 89, 23);
		contentPane.add(btnCancelar);
	}

}
