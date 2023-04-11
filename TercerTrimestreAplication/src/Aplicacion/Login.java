package Aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	static Login loginV;
	private Usuario user = new Usuario();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginV = new Login();
					loginV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Conectate");
		btnNewButton.addActionListener(e -> {			
				if(passwordField.getText().isEmpty() && textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(contentPane,"Por favor, introduce los datos del login","Formulario vacio",JOptionPane.ERROR_MESSAGE);
					textField.setForeground(Color.BLACK);
					textField.setBackground(Color.RED);
					passwordField.setForeground(Color.BLACK);
					passwordField.setBackground(Color.RED);
				}else {
					if(!passwordField.getText().isEmpty() && !textField.getText().isEmpty()) {
						VentanaBienvenida frame = new VentanaBienvenida();
						frame.setVisible(true);
						loginV.setVisible(false);
					}else if(textField.getText().isEmpty()){
						JOptionPane.showMessageDialog(contentPane,"Introduce un usuario","Usuario vacio",JOptionPane.WARNING_MESSAGE);
						textField.setForeground(Color.BLACK);
						textField.setBackground(Color.RED);
					}else {
						JOptionPane.showMessageDialog(contentPane,"Introduce una contraseña","Contraseña vacia",JOptionPane.WARNING_MESSAGE);
						passwordField.setForeground(Color.BLACK);
						passwordField.setBackground(Color.RED);
					}
				}
		});
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mostrar contraseña");
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnNewRadioButton.isSelected()==true) {
					passwordField.setEchoChar((char) 0);
					}else {
					passwordField.setEchoChar('●');      
					} 
			}
		});
		rdbtnNewRadioButton.setForeground(Color.RED);
		rdbtnNewRadioButton.setBackground(SystemColor.desktop);
		rdbtnNewRadioButton.setBounds(228, 199, 140, 23);
		contentPane.add(rdbtnNewRadioButton);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(184, 264, 113, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setBackground(Color.BLACK);
		textField.setBounds(228, 105, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.RED);
		passwordField.setBackground(Color.BLACK);
		passwordField.setBounds(228, 163, 140, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(119, 108, 58, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(119, 166, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/img/login.jpg")));
		lblNewLabel_2.setBounds(0, 0, 485, 462);
		contentPane.add(lblNewLabel_2);
	}
}
