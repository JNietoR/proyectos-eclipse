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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	static Login loginV;
	

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
				if(!passwordField.getText().isEmpty() && !textField.getText().isEmpty()) {
					VentanaBienvenida frame = new VentanaBienvenida();
					frame.setVisible(true);
					loginV.setVisible(false);
				}else if(textField.getText().isEmpty()){
					JOptionPane.showMessageDialog(contentPane,"Usuario vacio","ERROR",JOptionPane.WARNING_MESSAGE);
					textField.setForeground(Color.BLACK);
					textField.setBackground(Color.RED);
				}else {
					JOptionPane.showMessageDialog(contentPane,"Campo de contraseña vacio","ERROR",JOptionPane.WARNING_MESSAGE);
					passwordField.setForeground(Color.BLACK);
					passwordField.setBackground(Color.RED);
				}
			
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(184, 264, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setBackground(Color.BLACK);
		textField.setBounds(228, 105, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.RED);
		passwordField.setBackground(Color.BLACK);
		passwordField.setBounds(228, 163, 86, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(131, 108, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(131, 166, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/img/Diablo IV.jpg")));
		lblNewLabel_2.setBounds(0, 0, 485, 462);
		contentPane.add(lblNewLabel_2);
	}
}
