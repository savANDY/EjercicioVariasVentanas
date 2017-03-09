import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PRINCIPAL extends JFrame {

	private JFrame frame;
	private JButton btnInsertarArbol;
	private JTextPane txtListaDeArboles;
	private JComboBox lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRINCIPAL window = new PRINCIPAL();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PRINCIPAL() {
		initialize();
	}


	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 253, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lista = new JComboBox();
		lista.setBounds(31, 108, 177, 20);
		frame.getContentPane().add(lista);
		
		btnInsertarArbol = new JButton("Insertar arbol");
		btnInsertarArbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				accion();
			}
		});
		btnInsertarArbol.setBounds(31, 176, 177, 23);
		frame.getContentPane().add(btnInsertarArbol);
		
		txtListaDeArboles = new JTextPane();
		txtListaDeArboles.setFont(new Font("Consolas", Font.BOLD, 15));
		txtListaDeArboles.setEditable(false);
		txtListaDeArboles.setText("LISTA DE ARBOLES");
		txtListaDeArboles.setOpaque(false);
		txtListaDeArboles.setBounds(49, 60, 142, 20);
		frame.getContentPane().add(txtListaDeArboles);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 237, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnGestion = new JMenu("Gestion");
		menuBar.add(mnGestion);
		
		JMenuItem mntmInsertar = new JMenuItem("Insertar");
		mntmInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				accion();
				
			}
		});
		mntmInsertar.addMouseListener(new MouseAdapter() {
		});
		mnGestion.add(mntmInsertar);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mnGestion.add(mntmBorrar);
		
		JMenuItem mntmBorrarTodos = new JMenuItem("Borrar todos");
		mnGestion.add(mntmBorrarTodos);
		
		JButton btnBorrarArbolSeleccionado = new JButton("Borrar arbol seleccionado");
		btnBorrarArbolSeleccionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBorrarArbolSeleccionado.setBounds(31, 210, 177, 23);
		frame.getContentPane().add(btnBorrarArbolSeleccionado);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PRINCIPAL.class.getResource("/imagenes/background-grande.jpg")));
		label.setBounds(0, 0, 237, 261);
		frame.getContentPane().add(label);
	}

	public void accion() {
		
		DATOS hija = new DATOS(this, true);
		hija.setVisible(true);
		
	}

	public void aniadir(ARBOL arbol) {
		
		lista.addItem(arbol.nombre + " " + arbol.zona + " " + arbol.altura);
		
	}
}
