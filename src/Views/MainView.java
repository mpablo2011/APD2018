package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
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
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Usuarios");
		menuBar.add(mnMenu);
		
		JMenuItem mntmAltaDeUsuarios = new JMenuItem("Alta de usuario");
		mntmAltaDeUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AltaUsuarioView auv = new AltaUsuarioView();
				auv.setVisible(true);
				MainView.this.setVisible(false);
				
			}
		});
		mnMenu.add(mntmAltaDeUsuarios);
		
		JMenuItem mntmBajaDeUsuarios = new JMenuItem("Baja de usuario");
		mnMenu.add(mntmBajaDeUsuarios);
		
		JMenu mnNewMenu = new JMenu("Productos");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAltaProducto = new JMenuItem("Alta producto");
		mnNewMenu.add(mntmAltaProducto);
		
		JMenu mnNewMenu_1 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNuevaVenta = new JMenuItem("Nueva Venta");
		mnNewMenu_1.add(mntmNuevaVenta);
		
		JMenuItem mntmListarVtasX = new JMenuItem("Ventas por usuario");
		mnNewMenu_1.add(mntmListarVtasX);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}