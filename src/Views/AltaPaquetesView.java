package Views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import app.MainSistemaDeVentas;
import bean.Views.*;

import bean.Views.ProductoView;
import bean.Views.PaqueteView;

public class AltaPaquetesView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1001316259881786173L;

	private JPanel contentPane;
	private JTextField textFieldDesc;
	private MainSistemaDeVentas sis = MainSistemaDeVentas.getInstancia();
	private PaqueteView paqueteView = new PaqueteView();

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

	private JTextField textFieldDescuento;
	private JTextField textFieldProducto;
	
	private static AltaPaquetesView instancia;
	public static AltaPaquetesView getInstancia() {
		if (instancia == null)
			instancia = new AltaPaquetesView();
		return instancia;
	}

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

		textFieldDesc = new JTextField();
		textFieldDesc.setBounds(135, 68, 130, 26);
		contentPane.add(textFieldDesc);
		textFieldDesc.setColumns(10);

		JButton btnRealizarAlta = new JButton("Realizar alta");
		btnRealizarAlta.setBounds(59, 300, 117, 29);
		contentPane.add(btnRealizarAlta);
		btnRealizarAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					if ( !textFieldDesc.getText().equals("") && !textFieldDescuento.getText().equals(""))
					{
						paqueteView.setDescripcion(textFieldDesc.getText());
						paqueteView.setDescuento(Integer.parseInt(textFieldDescuento.getText()));
						sis.grabarPaquete(paqueteView);
						
						JOptionPane pane = new JOptionPane("Paquete dado de alta de forma correcta");
		            	pane.setBackground(Color.GREEN);
		                JDialog d = pane.createDialog(new JFrame(), "OK");
		                d.setLocation(100,100);
		                d.setVisible(true);
					}
					else
						JOptionPane.showMessageDialog(instancia, "Debe Completar el formulario");
				}
				catch(Exception ex)
				{
					JOptionPane pane = new JOptionPane("Ocurrio un error al generar el alta del Paquete");
	            	pane.setBackground(Color.RED);
	                JDialog d = pane.createDialog(new JFrame(), "OK");
	                d.setLocation(100,100);
	                d.setVisible(true);
				}
			}
		});

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(220, 300, 117, 29);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainView view = new MainView();
				view.setVisible(true);
				AltaPaquetesView.this.setVisible(false);
			}
		});

		JLabel lblCarrera = new JLabel("Descuento:");
		lblCarrera.setBounds(28, 124, 74, 16);
		contentPane.add(lblCarrera);

		textFieldDescuento = new JTextField();
		textFieldDescuento.setBounds(135, 119, 130, 26);
		contentPane.add(textFieldDescuento);
		textFieldDescuento.setColumns(10);

		JLabel lblIngreseLosDatos = new JLabel("Ingrese los datos para generar el paquete");
		lblIngreseLosDatos.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblIngreseLosDatos.setBounds(46, 17, 353, 16);
		contentPane.add(lblIngreseLosDatos);

		JButton btnAgregar = new JButton("Agregar Producto");
		btnAgregar.setBounds(135, 223, 130, 29);
		contentPane.add(btnAgregar);
		
		JLabel lblProducto = new JLabel("Producto: ");
		lblProducto.setBounds(30, 169, 72, 14);
		contentPane.add(lblProducto);
		
		textFieldProducto = new JTextField();
		textFieldProducto.setColumns(10);
		textFieldProducto.setBounds(135, 166, 130, 26);
		contentPane.add(textFieldProducto);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ProductoView prod = sis.getProductoPorCodigo(Integer.parseInt(textFieldProducto.getText()));
				
				if (prod != null)				
				{
					if(prod.getEsPaquete())
						JOptionPane.showMessageDialog(instancia, "No es Posible agregar un paquete dentro de otro paquete");
					else
						if (!existeProductoEnPaquete(prod))
						{
							paqueteView.agregarProducto(prod);
							JOptionPane.showMessageDialog(instancia, "Se Ha agregado el producto");
						}
						else
							JOptionPane.showMessageDialog(instancia, "El producto ya se encuentra agregado al paquete");	
				}
				else 
					JOptionPane.showMessageDialog(instancia, "El producto no existe");
			}
		});			
	}
	
	private boolean existeProductoEnPaquete(ProductoView prod)
	{
		for(ProductoView prodVw : this.paqueteView.getProductosView())
		{			
			if (prod.getCodigoProducto() == prodVw.getCodigoProducto())
				return true;			
		}
		return false;
	}
}
