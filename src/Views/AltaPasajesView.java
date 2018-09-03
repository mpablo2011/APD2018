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

public class AltaPasajesView extends JFrame {

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
		
		textField = new JTextField();
		textField.setBounds(112, 20, 154, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(112, 54, 154, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(112, 79, 154, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(112, 104, 154, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(112, 129, 154, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(112, 154, 154, 20);
		contentPane.add(textField_5);
		
		JButton btnAceptar = new JButton("Aceptar");
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
