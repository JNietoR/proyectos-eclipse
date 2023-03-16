package Aplicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaPrincipal {

	private JFrame frmRegistroBetaDiablo;
	private JTextField txtUsuario;
	private JTextField txtExamplemailcom;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	static ArrayList<String> usuarios=new ArrayList<String>();
	static ArrayList<String> contraseñas=new ArrayList<String>();;
	static ArrayList<String> emails=new ArrayList<String>();;
	
	
	

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
		
		JLabel lblNewLabel = new JLabel("REGISTRTATE EN LA BETA");
		lblNewLabel.setBounds(142, 11, 224, 14);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(110, 78, 91, 14);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo electronico");
		lblNewLabel_2.setBounds(110, 109, 112, 14);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña");
		lblNewLabel_3.setBounds(110, 140, 112, 14);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Repite Contraseña");
		lblNewLabel_4.setBounds(110, 171, 112, 14);
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Conectate");
		btnNewButton.setBounds(201, 271, 89, 23);
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
		btnNewButton_1.setBounds(201, 212, 89, 23);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().equals(passwordField_1.getText()) && !txtUsuario.getText().isEmpty() && !txtExamplemailcom.getText().isEmpty() && !passwordField.getText().isEmpty() && !passwordField_1.getText().isEmpty()) {
					usuarios.add(txtUsuario.getText());
					contraseñas.add(passwordField.getText());	
					emails.add(txtExamplemailcom.getText());
					VentanaBienvenida frame = new VentanaBienvenida();
					frame.setVisible(true);
					frmRegistroBetaDiablo.setVisible(false);	
				}else {
					if(!passwordField.getText().equals(passwordField_1.getText())) {
						JOptionPane.showMessageDialog(frmRegistroBetaDiablo,"Contraseña no coincide","ERROR",JOptionPane.WARNING_MESSAGE);
						passwordField.setBackground(Color.RED);
						passwordField.setForeground(Color.BLACK);
						passwordField_1.setBackground(Color.RED);
						passwordField_1.setForeground(Color.BLACK);
					}else if(txtUsuario.getText().isEmpty()) {
						JOptionPane.showMessageDialog(frmRegistroBetaDiablo,"Usuario vacio","ERROR",JOptionPane.WARNING_MESSAGE);
						txtUsuario.setForeground(Color.BLACK);
						txtUsuario.setBackground(Color.RED);
					}else if(txtExamplemailcom.getText().isEmpty()){
						JOptionPane.showMessageDialog(frmRegistroBetaDiablo,"Email vacio","ERROR",JOptionPane.WARNING_MESSAGE);
						txtExamplemailcom.setBackground(Color.RED);
						txtExamplemailcom.setForeground(Color.BLACK);
					}else {
						JOptionPane.showMessageDialog(frmRegistroBetaDiablo,"Campo de contraseña vacio","ERROR",JOptionPane.WARNING_MESSAGE);
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
		txtUsuario.setBounds(296, 75, 133, 20);
		txtUsuario.setForeground(Color.RED);
		txtUsuario.setBackground(Color.BLACK);
		txtUsuario.setFont(new Font("Tahoma", Font.ITALIC, 11));
		frmRegistroBetaDiablo.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtExamplemailcom = new JTextField();
		txtExamplemailcom.setBounds(296, 106, 133, 20);
		txtExamplemailcom.setBackground(Color.BLACK);
		txtExamplemailcom.setForeground(Color.RED);
		txtExamplemailcom.setFont(new Font("Tahoma", Font.ITALIC, 11));
		frmRegistroBetaDiablo.getContentPane().add(txtExamplemailcom);
		txtExamplemailcom.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(296, 168, 133, 20);
		passwordField.setBackground(Color.BLACK);
		passwordField.setForeground(Color.RED);
		frmRegistroBetaDiablo.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(296, 137, 133, 20);
		passwordField_1.setBackground(Color.BLACK);
		passwordField_1.setForeground(Color.RED);
		frmRegistroBetaDiablo.getContentPane().add(passwordField_1);
		
		JLabel lblNewLabel_5 = new JLabel("¿Ya tienes una cuenta?");
		lblNewLabel_5.setBounds(188, 246, 121, 14);
		lblNewLabel_5.setForeground(Color.RED);
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(0, 0, 495, 511);
		lblNewLabel_6.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/Diablo IV.jpg")));
		frmRegistroBetaDiablo.getContentPane().add(lblNewLabel_6);
	}
}
