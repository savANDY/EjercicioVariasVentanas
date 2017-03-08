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

public class PRINCIPAL {

	private JFrame frame;

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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(65, 108, 113, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnAbrirFormulario = new JButton("Abrir formulario");
		btnAbrirFormulario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//DATOS hija = new DATOS(this,true);
				
			}
		});
		btnAbrirFormulario.setBounds(57, 176, 134, 23);
		frame.getContentPane().add(btnAbrirFormulario);
		
		JTextPane txtListaDeArboles = new JTextPane();
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
		mnGestion.add(mntmInsertar);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mnGestion.add(mntmBorrar);
		
		JMenuItem mntmBorrarTodos = new JMenuItem("Borrar todos");
		mnGestion.add(mntmBorrarTodos);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PRINCIPAL.class.getResource("/imagenes/background-grande.jpg")));
		label.setBounds(0, 0, 237, 261);
		frame.getContentPane().add(label);
	}
}
