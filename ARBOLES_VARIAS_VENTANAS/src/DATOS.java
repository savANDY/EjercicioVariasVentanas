import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class DATOS extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nombre;
	private JTextField zona;
	private JTextField altura;


	/**
	 * Create the dialog.
	 */

	public DATOS(javax.swing.JFrame parent, boolean modal) {
		
		super(parent,modal);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DATOS.class.getResource("/imagenes/sec.png")));
		setTitle("Datos");
		
		setBounds(650, 350, 250, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JTextPane txtpnNombre = new JTextPane();
			txtpnNombre.setText("NOMBRE:");
			txtpnNombre.setOpaque(false);
			txtpnNombre.setFont(new Font("Consolas", Font.BOLD, 15));
			txtpnNombre.setEditable(false);
			txtpnNombre.setBounds(68, 82, 60, 20);
			contentPanel.add(txtpnNombre);
		}
		{
			JTextPane txtpnZona = new JTextPane();
			txtpnZona.setText("ZONA:");
			txtpnZona.setOpaque(false);
			txtpnZona.setFont(new Font("Consolas", Font.BOLD, 15));
			txtpnZona.setEditable(false);
			txtpnZona.setBounds(78, 113, 46, 20);
			contentPanel.add(txtpnZona);
		}
		{
			JTextPane txtpnAlturaMedia = new JTextPane();
			txtpnAlturaMedia.setText("ALTURA MEDIA:");
			txtpnAlturaMedia.setOpaque(false);
			txtpnAlturaMedia.setFont(new Font("Consolas", Font.BOLD, 15));
			txtpnAlturaMedia.setEditable(false);
			txtpnAlturaMedia.setBounds(25, 144, 110, 20);
			contentPanel.add(txtpnAlturaMedia);
		}
		{
			nombre = new JTextField();
			nombre.setBounds(138, 85, 86, 20);
			contentPanel.add(nombre);
			nombre.setColumns(10);
		}
		{
			zona = new JTextField();
			zona.setColumns(10);
			zona.setBounds(138, 116, 86, 20);
			contentPanel.add(zona);
		}
		{
			altura = new JTextField();
			altura.setColumns(10);
			altura.setBounds(138, 147, 86, 20);
			contentPanel.add(altura);
		}
		{
			JTextPane txtpnIntroduccinDeDatos = new JTextPane();
			txtpnIntroduccinDeDatos.setText("Introducci\u00F3n de datos");
			txtpnIntroduccinDeDatos.setOpaque(false);
			txtpnIntroduccinDeDatos.setFont(new Font("Ebrima", Font.BOLD, 15));
			txtpnIntroduccinDeDatos.setEditable(false);
			txtpnIntroduccinDeDatos.setBounds(32, 27, 181, 20);
			contentPanel.add(txtpnIntroduccinDeDatos);
		}
		{
			JButton btnInsertarrbol = new JButton("Insertar \u00E1rbol");
			btnInsertarrbol.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					accion();
					
				}
			});
			btnInsertarrbol.setBounds(61, 204, 123, 23);
			contentPanel.add(btnInsertarrbol);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(DATOS.class.getResource("/imagenes/background-grande.jpg")));
			label.setBounds(0, 0, 234, 261);
			contentPanel.add(label);
		}
	}


	public void accion() {
		
		ARBOL arbol = new ARBOL(nombre.getText(),zona.getText(),Double.parseDouble(altura.getText()));
				
		((PRINCIPAL) this.getParent()).aniadir(arbol);
		this.dispose();
		
	}

}
