package Views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class AltaPaquetesView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1001316259881786173L;

	private JPanel contentPane;
	private JTextField textFieldAlumno;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaPaquetesView frame = new AltaPaquetesView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JTextField textFieldCarrera;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public AltaPaquetesView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 466, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAlumno = new JLabel("Descripcion:");
		lblAlumno.setBounds(28, 73, 61, 16);
		contentPane.add(lblAlumno);

		textFieldAlumno = new JTextField();
		textFieldAlumno.setBounds(135, 68, 130, 26);
		contentPane.add(textFieldAlumno);
		textFieldAlumno.setColumns(10);

		JButton btnRealizarAlta = new JButton("Realizar alta");
		btnRealizarAlta.setBounds(59, 300, 117, 29);
		contentPane.add(btnRealizarAlta);
		btnRealizarAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(220, 300, 117, 29);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		JLabel lblCarrera = new JLabel("Descuento:");
		lblCarrera.setBounds(28, 124, 74, 16);
		contentPane.add(lblCarrera);

		textFieldCarrera = new JTextField();
		textFieldCarrera.setBounds(135, 119, 130, 26);
		contentPane.add(textFieldCarrera);
		textFieldCarrera.setColumns(10);

		JLabel lblIngreseLosDatos = new JLabel("Ingrese los datos para generar el paquete");
		lblIngreseLosDatos.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblIngreseLosDatos.setBounds(46, 17, 353, 16);
		contentPane.add(lblIngreseLosDatos);

		JButton btnBuscar = new JButton("Buscar Producto");
		btnBuscar.setBounds(288, 162, 130, 29);
		contentPane.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(135, 223, 117, 29);
		contentPane.add(btnAgregar);
		
		JLabel lblProducto = new JLabel("Producto: ");
		lblProducto.setBounds(30, 169, 72, 14);
		contentPane.add(lblProducto);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 166, 130, 26);
		contentPane.add(textField);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}
