package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class AltaProductoView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaProductoView frame = new AltaProductoView();
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
	public AltaProductoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(125, 49, 156, 20);
		comboBox.addItem("");
		comboBox.addItem("Pasajes");
		comboBox.addItem("Alojamiento");
		comboBox.addItem("Visitas Turisticas");
		
		contentPane.add(comboBox);
		
		comboBox.addActionListener(new ActionListener(){
             @Override public void actionPerformed(ActionEvent e) {
            	 String tipo = (String) comboBox.getSelectedItem();
            	 
            	 if (tipo.equals("Pasajes"))
            	 {
            		AltaPasajesView view = new AltaPasajesView();
            		view.setVisible(true);
            		AltaProductoView.this.setVisible(false);
            	 }
            	 
            	 if (tipo.equals("Alojamiento"))
            	 {
            		AltaAlojamientosView view = new AltaAlojamientosView();
             		view.setVisible(true);
             		AltaProductoView.this.setVisible(false);
            	 }
            	 
            	 if (tipo.equals("Visitas Turisticas"))
            	 {
            		AltaVisitasView view = new AltaVisitasView();
              		view.setVisible(true);
              		AltaProductoView.this.setVisible(false);
            	 }
            	        
             }
		});
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(31, 49, 46, 14);
		contentPane.add(lblTipo);
	}
}
