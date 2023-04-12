package Aplicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;

public class VentanaPrincipal {

	private JFrame frmRegistroBetaDiablo;
	private JTextField txtUsuario;
	private JTextField txtExamplemailcom;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private Usuario user=new Usuario();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmRegistroBetaDiablo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmRegistroBetaDiablo = new JFrame();
		frmRegistroBetaDiablo.setTitle("Registro Beta Diablo IV");
		frmRegistroBetaDiablo.setBounds(100, 100, 511, 551);
		frmRegistroBetaDiablo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroBetaDiablo.getContentPane().setLayout(null);
		
		JRadioButton rdbtnMostrarContrasea = new JRadioButton("Mostrar Contraseña");
		rdbtnMostrarContrasea.setForeground(Color.RED);
		rdbtnMostrarContrasea.setOpaque(false);
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
		rdbtnMostrarContrasea.setBounds(272, 206, 156, 23);
		frmRegistroBetaDiablo.getContentPane().add(rdbtnMostrarContrasea);
		
		JLabel lblNewLabel = new JLabel("REGISTRTATE EN LA BETA");
		lblNewLabel.setBounds(142, 11, 224, 14);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(90, 75, 91, 14);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo electronico");
		lblNewLabel_2.setBounds(90, 109, 112, 14);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña");
		lblNewLabel_3.setBounds(90, 140, 112, 14);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Repite Contraseña");
		lblNewLabel_4.setBounds(90, 172, 112, 14);
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Conectate");
		btnNewButton.setBounds(188, 317, 102, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Login frame = new Login();
					frame.setVisible(true);
					frmRegistroBetaDiablo.setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.RED);
		frmRegistroBetaDiablo.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrate");
		btnNewButton_1.setBounds(188, 258, 102, 23);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String icono = "/img/icono.png";
                ImageIcon icon = new ImageIcon(getClass().getResource(icono));

				if(passwordField.getText().equals(passwordField_1.getText()) && !txtUsuario.getText().isEmpty() && !txtExamplemailcom.getText().isEmpty() && !passwordField.getText().isEmpty() && !passwordField_1.getText().isEmpty() && txtExamplemailcom.getText().contains("@") && txtExamplemailcom.getText().contains(".")) {
					JOptionPane.showMessageDialog(frmRegistroBetaDiablo, "Te has registrado correctamente", "Registro correcto",
                            JOptionPane.INFORMATION_MESSAGE,icon);
					VentanaBienvenida frame = new VentanaBienvenida();
					user.registrar(txtUsuario.getText(), passwordField.getText(), txtExamplemailcom.getText());
					frame.setVisible(true);
					frmRegistroBetaDiablo.setVisible(false);	
				}else {
					if(txtUsuario.getText().isEmpty() && txtExamplemailcom.getText().isEmpty() && passwordField.getText().isEmpty() && passwordField_1.getText().isEmpty()) {
						JOptionPane.showMessageDialog(frmRegistroBetaDiablo,"Por favor, intorduce los datos del formulario","Formulario vacio",JOptionPane.WARNING_MESSAGE);
						passwordField.setBackground(Color.RED);
						passwordField.setForeground(Color.BLACK);
						passwordField_1.setBackground(Color.RED);
						passwordField_1.setForeground(Color.BLACK);
						txtUsuario.setForeground(Color.BLACK);
						txtUsuario.setBackground(Color.RED);
						txtExamplemailcom.setBackground(Color.RED);
						txtExamplemailcom.setForeground(Color.BLACK);
					}else if(!passwordField.getText().equals(passwordField_1.getText())) {
						JOptionPane.showMessageDialog(frmRegistroBetaDiablo,"Introduce la misma contraseña en ambos campos","Contraseña no coincide",JOptionPane.ERROR_MESSAGE);
						passwordField.setBackground(Color.RED);
						passwordField.setForeground(Color.BLACK);
						passwordField_1.setBackground(Color.RED);
						passwordField_1.setForeground(Color.BLACK);
					}else if(txtUsuario.getText().isEmpty()) {
						JOptionPane.showMessageDialog(frmRegistroBetaDiablo,"Introduce un usuario","Usuario vacio",JOptionPane.WARNING_MESSAGE);
						txtUsuario.setForeground(Color.BLACK);
						txtUsuario.setBackground(Color.RED);
					}else if(txtExamplemailcom.getText().isEmpty()){
						JOptionPane.showMessageDialog(frmRegistroBetaDiablo,"Introduce un correo","Email vacio",JOptionPane.WARNING_MESSAGE);
						txtExamplemailcom.setBackground(Color.RED);
						txtExamplemailcom.setForeground(Color.BLACK);
					}else if(!txtExamplemailcom.getText().contains("@") && !txtExamplemailcom.getText().contains(".")){
						JOptionPane.showMessageDialog(frmRegistroBetaDiablo,"Introduce un email que sea válido","Email no válido",JOptionPane.ERROR_MESSAGE);
						txtExamplemailcom.setBackground(Color.RED);
						txtExamplemailcom.setForeground(Color.BLACK);
					}else {
						JOptionPane.showMessageDialog(frmRegistroBetaDiablo,"Introduce una contraseña","Contraseña vacia",JOptionPane.WARNING_MESSAGE);
						passwordField.setBackground(Color.RED);
						passwordField.setForeground(Color.BLACK);
						passwordField_1.setBackground(Color.RED);
						passwordField_1.setForeground(Color.BLACK);
					}
					
				}
			}
			
		});
		frmRegistroBetaDiablo.getContentPane().add(btnNewButton_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(272, 72, 156, 20);
		txtUsuario.setForeground(Color.RED);
		txtUsuario.setBackground(Color.BLACK);
		txtUsuario.setFont(new Font("Tahoma", Font.ITALIC, 11));
		frmRegistroBetaDiablo.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtExamplemailcom = new JTextField();
		txtExamplemailcom.setBounds(272, 106, 156, 20);
		txtExamplemailcom.setBackground(Color.BLACK);
		txtExamplemailcom.setForeground(Color.RED);
		txtExamplemailcom.setFont(new Font("Tahoma", Font.ITALIC, 11));
		frmRegistroBetaDiablo.getContentPane().add(txtExamplemailcom);
		txtExamplemailcom.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(272, 169, 156, 20);
		passwordField.setBackground(Color.BLACK);
		passwordField.setForeground(Color.RED);
		frmRegistroBetaDiablo.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(272, 137, 156, 20);
		passwordField_1.setBackground(Color.BLACK);
		passwordField_1.setForeground(Color.RED);
		frmRegistroBetaDiablo.getContentPane().add(passwordField_1);
		
		JLabel lblNewLabel_5 = new JLabel("¿Ya tienes una cuenta?");
		lblNewLabel_5.setBounds(169, 292, 156, 14);
		lblNewLabel_5.setForeground(Color.RED);
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBackground(new Color(240, 240, 240));
		lblNewLabel_6.setBounds(0, 0, 495, 511);
		lblNewLabel_6.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Diablo IV.jpg")));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_6);
	}
}
