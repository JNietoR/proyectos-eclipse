package Aplicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;



public class TablaUsuarios extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Usuario user = new Usuario();
	private JTextField textField;
	private JLabel lblNewLabel;
	private JPasswordField passwordField;
	String icono = "/img/icono.png";
    ImageIcon icon = new ImageIcon(getClass().getResource(icono));

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablaUsuarios frame = new TablaUsuarios();
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
	public TablaUsuarios() {
		setTitle("TablaUsuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(user.comprobarDatos(textField.getText(), passwordField.getText()) == 1) {
					user.eliminarUsuario(textField.getText());
					table.setModel(user.rellenarTabla());
					JOptionPane.showMessageDialog(contentPane, "Usuario "+textField.getText()+" eliminado correctamente", "Usuario eliminado",
	                        JOptionPane.INFORMATION_MESSAGE,icon);
				}else {
					JOptionPane.showMessageDialog(contentPane,"No Existe un usuario "+textField.getText()+" con contraseña "+passwordField.getText(),"Usuario y contraseña no coinciden",JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Comprobar");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(user.comprobarDatos(textField.getText(), passwordField.getText()) == 1) {
					JOptionPane.showMessageDialog(contentPane, "Existe un usuario "+textField.getText()+" con contraseña "+passwordField.getText(), "Usuario y contraseña coinciden",
	                        JOptionPane.INFORMATION_MESSAGE,icon);
				}else {
					JOptionPane.showMessageDialog(contentPane,"No Existe un usuario "+textField.getText()+" con contraseña "+passwordField.getText(),"Usuario y contraseña no coinciden",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setBounds(214, 126, 113, 23);
		contentPane.add(btnNewButton_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.RED);
		passwordField.setBackground(Color.BLACK);
		passwordField.setBounds(108, 127, 96, 20);
		contentPane.add(passwordField);
		
		lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(119, 102, 112, 14);
		contentPane.add(lblNewLabel);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(337, 126, 88, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textField.setColumns(10);
		textField.setBackground(Color.BLACK);
		textField.setBounds(10, 127, 88, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(29, 102, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		table = new JTable();
		table.setForeground(Color.RED);
		table.setBackground(Color.BLACK);
		table.setModel(user.rellenarTabla());
		table.setBounds(10, 158, 415, 179);
		contentPane.add(table);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(TablaUsuarios.class.getResource("/img/Diablo IV.jpg")));
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBackground(SystemColor.menu);
		lblNewLabel_6.setBounds(-21, 0, 456, 492);
		contentPane.add(lblNewLabel_6);
		
		


	    
	}
}


