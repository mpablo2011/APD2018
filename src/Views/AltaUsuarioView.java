package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaUsuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField nombreField;
	private JTextField dniField;
	private JTextField telefonoField;
	private JTextField mailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaUsuarioView frame = new AltaUsuarioView();
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
	public AltaUsuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 10, 100, 20);
		contentPane.add(lblNombre);
		
		nombreField = new JTextField();
		nombreField.setBounds(135, 10, 180, 20);
		contentPane.add(nombreField);
		nombreField.setColumns(10);
		
		JLabel lblDNI = new JLabel("DNI:");
		lblDNI.setBounds(10, 50, 100, 20);
		contentPane.add(lblDNI);
		
		dniField = new JTextField();
		dniField.setColumns(10);
		dniField.setBounds(135, 50, 180, 20);
		contentPane.add(dniField);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 90, 100, 20);
		contentPane.add(lblTelefono);
		
		telefonoField = new JTextField();
		telefonoField.setColumns(10);
		telefonoField.setBounds(135, 90, 180, 20);
		contentPane.add(telefonoField);
		
		JLabel lblMail = new JLabel("Mail:");
		lblMail.setBounds(10, 130, 100, 20);
		contentPane.add(lblMail);
		
		mailField = new JTextField();
		mailField.setColumns(10);
		mailField.setBounds(135, 130, 180, 20);
		contentPane.add(mailField);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(218, 170, 97, 25);
		contentPane.add(btnAceptar);
		
		JButton volverButton = new JButton("Volver");
		volverButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainView mvw = new MainView();
				mvw.setVisible(true);
				AltaUsuarioView.this.setVisible(false);
			}
		});
		volverButton.setBounds(109, 170, 97, 25);
		contentPane.add(volverButton);
	}
}