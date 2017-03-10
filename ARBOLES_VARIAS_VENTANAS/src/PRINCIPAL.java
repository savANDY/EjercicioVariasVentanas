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

	private JFrame frmListaDeArboles;
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
					//window.setLocationRelativeTo(null); //para ponerla en el centro
					window.frmListaDeArboles.setVisible(true);
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
		frmListaDeArboles = new JFrame();
		frmListaDeArboles.setTitle("Arboles");
		frmListaDeArboles.setBounds(600, 300, 253, 300);
		frmListaDeArboles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListaDeArboles.getContentPane().setLayout(null);
		
		lista = new JComboBox();
		lista.setBounds(31, 108, 177, 20);
		lista.addItem("Pino sur 12.5");
		lista.addItem("Roble norte 7.3");
		frmListaDeArboles.getContentPane().add(lista);
		
		btnInsertarArbol = new JButton("Insertar arbol");
		btnInsertarArbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				accionInsertar();
			}
		});
		btnInsertarArbol.setBounds(31, 176, 177, 23);
		frmListaDeArboles.getContentPane().add(btnInsertarArbol);
		
		txtListaDeArboles = new JTextPane();
		txtListaDeArboles.setFont(new Font("Consolas", Font.BOLD, 15));
		txtListaDeArboles.setEditable(false);
		txtListaDeArboles.setText("LISTA DE ARBOLES");
		txtListaDeArboles.setOpaque(false);
		txtListaDeArboles.setBounds(49, 60, 142, 20);
		frmListaDeArboles.getContentPane().add(txtListaDeArboles);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 237, 21);
		frmListaDeArboles.getContentPane().add(menuBar);
		
		JMenu mnGestion = new JMenu("Gestion");
		menuBar.add(mnGestion);
		
		JMenuItem mntmInsertar = new JMenuItem("Insertar");
		mntmInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				accionInsertar();
				
			}
		});
		mntmInsertar.addMouseListener(new MouseAdapter() {
		});
		mnGestion.add(mntmInsertar);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				borrarArbol();
			}
		});
		mnGestion.add(mntmBorrar);
		
		JMenuItem mntmBorrarTodos = new JMenuItem("Borrar todos");
		mntmBorrarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lista.removeAllItems();
			}
		});
		mnGestion.add(mntmBorrarTodos);
		
		JButton btnBorrarSeleccionado = new JButton("Borrar seleccionado");
		btnBorrarSeleccionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				borrarArbol();
				
			}
		});
		btnBorrarSeleccionado.setBounds(31, 210, 177, 23);
		frmListaDeArboles.getContentPane().add(btnBorrarSeleccionado);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PRINCIPAL.class.getResource("/imagenes/background-grande.jpg")));
		label.setBounds(0, 0, 237, 261);
		frmListaDeArboles.getContentPane().add(label);
	}

	protected void borrarArbol() {
		
		lista.removeItem(lista.getSelectedItem());
		
	}

	public void accionInsertar() {
		
		DATOS hija = new DATOS(this, true);
		hija.setVisible(true);
		
	}

	public void aniadir(ARBOL arbol) {
		
		lista.addItem(arbol.nombre + " " + arbol.zona + " " + arbol.altura);
		
	}
}
