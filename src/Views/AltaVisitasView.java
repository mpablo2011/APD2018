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

public class AltaVisitasView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(21, 104, 72, 14);
		contentPane.add(lblPrecio);
		
		textField = new JTextField();
		textField.setBounds(124, 26, 142, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 51, 142, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 76, 142, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 101, 142, 20);
		contentPane.add(textField_3);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(52, 210, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaVisitasView.this.setVisible(false);
				AltaProductoView view = new AltaProductoView();
         		view.setVisible(true);
			}
		});
		btnCancelar.setBounds(178, 210, 89, 23);
		contentPane.add(btnCancelar);
	}

}
