package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.VentaController;
import bean.Views.VentaView;

import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class AltaVentasView extends JFrame {

	private JPanel contentPane;
	private JTextField dniField;
	private JTable table;
	private JTextField precioTotField;

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
		
		dniField = new JTextField();
		dniField.setBounds(80, 21, 202, 22);
		contentPane.add(dniField);
		dniField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dniStr = dniField.getText();

				if (dniStr.isEmpty()) {
	            	JOptionPane pane = new JOptionPane("Complete el DNI");
	            	pane.setBackground(Color.RED);
	                JDialog d = pane.createDialog(new JFrame(), "OK");
	                d.setLocation(100,100);
	                d.setVisible(true);
				}
				else {
					
					int dni = Integer.parseInt(dniField.getText());
					
					VentaController vtc = VentaController.getInstancia();
					
					int resultado = vtc.VincularClienteAVenta(dni);
					
					if (resultado == 1) {
		            	JOptionPane pane = new JOptionPane("Cliente vinculado de forma correcta");
		            	pane.setBackground(Color.GREEN);
		                JDialog d = pane.createDialog(new JFrame(), "OK");
		                d.setLocation(100,100);
		                d.setVisible(true);
					}
					if (resultado == -1) {
		            	JOptionPane pane = new JOptionPane("Cliente inexistente.");
		            	pane.setBackground(Color.RED);
		                JDialog d = pane.createDialog(new JFrame(), "OK");
		                d.setLocation(100,100);
		                d.setVisible(true);
					}
					
				}
			}
		});
		btnBuscar.setBounds(302, 20, 151, 25);
		contentPane.add(btnBuscar);
		
		JButton btnAlta = new JButton("Nuevo Cliente");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaClienteView acv = new AltaClienteView();
				acv.setVisible(true);
				AltaVentasView.this.setVisible(false);
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
		btnAgregarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buscarProductoView bpv = new buscarProductoView();
				bpv.setVisible(true);
				AltaVentasView.this.setVisible(false);
			}
		});
		btnAgregarProducto.setBounds(12, 259, 469, 25);
		contentPane.add(btnAgregarProducto);
		
		JLabel lblPrecioTotal = new JLabel("Precio total:");
		lblPrecioTotal.setBounds(12, 317, 81, 16);
		contentPane.add(lblPrecioTotal);
		
		precioTotField = new JTextField();
		precioTotField.setEditable(false);
		precioTotField.setBounds(134, 314, 148, 22);
		contentPane.add(precioTotField);
		precioTotField.setColumns(10);
		VentaView vw = VentaController.getInstancia().getVentaView();
		if (vw == null) 
		{
			precioTotField.setText("0");
		}
		else
		{
			float precioTotal = vw.getTotalVenta();
			precioTotField.setText(Float.toString(precioTotal));
		}
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainView mv = new MainView();
				mv.setVisible(true);
				AltaVentasView.this.setVisible(false);
			}
		});
		btnVolver.setBounds(12, 386, 185, 25);
		contentPane.add(btnVolver);
		
		JButton btnRegistrarVenta = new JButton("Registrar Venta");
		btnRegistrarVenta.setBounds(253, 386, 200, 25);
		contentPane.add(btnRegistrarVenta);
	}
}
