package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class AltaVentasView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaVentasView frame = new AltaVentasView();
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
	public AltaVentasView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(12, 24, 56, 16);
		contentPane.add(lblCliente);
		
		textField = new JTextField();
		textField.setBounds(80, 21, 202, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(302, 20, 151, 25);
		contentPane.add(btnBuscar);
		
		JButton btnAlta = new JButton("Nuevo Cliente");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlta.setBounds(302, 58, 151, 25);
		contentPane.add(btnAlta);
		
		table = new JTable();
		table.setBounds(12, 115, 460, 131);
		contentPane.add(table);
		
		JLabel lblProductos = new JLabel("Productos");
		lblProductos.setBounds(12, 88, 56, 16);
		contentPane.add(lblProductos);
		
		JButton btnAgregarProducto = new JButton("Agregar Producto");
		btnAgregarProducto.setBounds(12, 259, 469, 25);
		contentPane.add(btnAgregarProducto);
		
		JLabel lblPrecioTotal = new JLabel("Precio total:");
		lblPrecioTotal.setBounds(12, 317, 81, 16);
		contentPane.add(lblPrecioTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 314, 148, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(12, 386, 185, 25);
		contentPane.add(btnVolver);
		
		JButton btnRegistrarVenta = new JButton("Registrar Venta");
		btnRegistrarVenta.setBounds(253, 386, 200, 25);
		contentPane.add(btnRegistrarVenta);
	}
}
