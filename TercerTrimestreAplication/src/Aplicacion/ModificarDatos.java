package Aplicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ModificarDatos extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtExamplemailcom;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	static Login loginV = new Login();
	static CambiarContraseña cambiarcontra = new CambiarContraseña();
	static ModificarDatos modificarD = new ModificarDatos();
	static VentanaBienvenida bienvenida = new VentanaBienvenida();
	private Usuario user = new Usuario();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modificarD = new ModificarDatos();
					modificarD.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ModificarDatos() {
		setTitle("Modificar Datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("¿Volver a conectarte?");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(181, 283, 141, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Conectate");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				modificarD.setVisible(false);
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setBounds(191, 308, 102, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String icono = "/img/icono.png";
                ImageIcon icon = new ImageIcon(getClass().getResource(icono));
				
				if(passwordField.getText().equals(passwordField_1.getText()) && !txtUsuario.getText().isEmpty() && !txtExamplemailcom.getText().isEmpty() && !passwordField.getText().isEmpty() && !passwordField_1.getText().isEmpty() && txtExamplemailcom.getText().contains("@") && txtExamplemailcom.getText().contains(".")) {
						JOptionPane.showMessageDialog(contentPane, "Datos modificados correctamente", "Datos modificados",JOptionPane.INFORMATION_MESSAGE,icon);
						user.modificarDatos(passwordField.getText(), txtExamplemailcom.getText(),txtUsuario.getText());
					}else {
						if(txtUsuario.getText().isEmpty() && txtExamplemailcom.getText().isEmpty() && passwordField.getText().isEmpty() && passwordField_1.getText().isEmpty()) {
							JOptionPane.showMessageDialog(contentPane,"Por favor, intorduce los datos del formulario","Formulario vacio",JOptionPane.WARNING_MESSAGE);
							passwordField.setBackground(Color.RED);
							passwordField.setForeground(Color.BLACK);
							passwordField_1.setBackground(Color.RED);
							passwordField_1.setForeground(Color.BLACK);
							txtUsuario.setForeground(Color.BLACK);
							txtUsuario.setBackground(Color.RED);
							txtExamplemailcom.setBackground(Color.RED);
							txtExamplemailcom.setForeground(Color.BLACK);
						}else if(!passwordField.getText().equals(passwordField_1.getText())) {
							JOptionPane.showMessageDialog(contentPane,"Introduce la misma contraseña en ambos campos","Contraseña no coincide",JOptionPane.ERROR_MESSAGE);
							passwordField.setBackground(Color.RED);
							passwordField.setForeground(Color.BLACK);
							passwordField_1.setBackground(Color.RED);
							passwordField_1.setForeground(Color.BLACK);
						}else if(txtUsuario.getText().isEmpty()) {
							JOptionPane.showMessageDialog(contentPane,"Introduce un usuario","Usuario vacio",JOptionPane.WARNING_MESSAGE);
							txtUsuario.setForeground(Color.BLACK);
							txtUsuario.setBackground(Color.RED);
						}else if(txtExamplemailcom.getText().isEmpty()){
							JOptionPane.showMessageDialog(contentPane,"Introduce un correo","Email vacio",JOptionPane.WARNING_MESSAGE);
							txtExamplemailcom.setBackground(Color.RED);
							txtExamplemailcom.setForeground(Color.BLACK);
						}else if(!txtExamplemailcom.getText().contains("@") && !txtExamplemailcom.getText().contains(".")){
							JOptionPane.showMessageDialog(contentPane,"Introduce un email que sea válido","Email no válido",JOptionPane.ERROR_MESSAGE);
							txtExamplemailcom.setBackground(Color.RED);
							txtExamplemailcom.setForeground(Color.BLACK);
						}else {
							JOptionPane.showMessageDialog(contentPane,"Introduce una contraseña","Contraseña vacia",JOptionPane.WARNING_MESSAGE);
							passwordField.setBackground(Color.RED);
							passwordField.setForeground(Color.BLACK);
							passwordField_1.setBackground(Color.RED);
							passwordField_1.setForeground(Color.BLACK);
						}
				}
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(193, 249, 102, 23);
		contentPane.add(btnNewButton_1);
		
		JRadioButton rdbtnMostrarContrasea = new JRadioButton("Mostrar Contraseña");
		rdbtnMostrarContrasea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnMostrarContrasea.isSelected()==true) {
					passwordField.setEchoChar((char) 0);
					passwordField_1.setEchoChar((char) 0);
				}else {
					passwordField.setEchoChar('●');      
					passwordField_1.setEchoChar('●');   
				} 
			}
		});
		rdbtnMostrarContrasea.setOpaque(false);
		rdbtnMostrarContrasea.setForeground(Color.RED);
		rdbtnMostrarContrasea.setBounds(279, 219, 156, 23);
		contentPane.add(rdbtnMostrarContrasea);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setForeground(Color.RED);
		passwordField_1.setBackground(Color.BLACK);
		passwordField_1.setBounds(279, 192, 156, 20);
		contentPane.add(passwordField_1);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.RED);
		passwordField.setBackground(Color.BLACK);
		passwordField.setBounds(279, 164, 156, 20);
		contentPane.add(passwordField);
		
		txtExamplemailcom = new JTextField();
		txtExamplemailcom.setForeground(Color.RED);
		txtExamplemailcom.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtExamplemailcom.setColumns(10);
		txtExamplemailcom.setBackground(Color.BLACK);
		txtExamplemailcom.setBounds(279, 136, 156, 20);
		contentPane.add(txtExamplemailcom);
		
		txtUsuario = new JTextField();
		txtUsuario.setForeground(Color.RED);
		txtUsuario.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtUsuario.setColumns(10);
		txtUsuario.setBackground(Color.BLACK);
		txtUsuario.setBounds(279, 111, 156, 20);
		contentPane.add(txtUsuario);
		
		JLabel lblNewLabel_3 = new JLabel("Nueva contraseña");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(101, 167, 112, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nueva contraseña");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(101, 195, 112, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Nuevo correo");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(101, 139, 112, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(101, 114, 91, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(ModificarDatos.class.getResource("/img/Diablo IV.jpg")));
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBackground(SystemColor.menu);
		lblNewLabel_6.setBounds(0, 0, 468, 530);
		contentPane.add(lblNewLabel_6);
	}
}
