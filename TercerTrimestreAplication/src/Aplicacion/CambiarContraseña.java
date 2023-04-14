package Aplicacion;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CambiarContraseña extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	static Login loginV = new Login();
	static CambiarContraseña cambiarcontra = new CambiarContraseña();
	static ModificarDatos modificarD = new ModificarDatos();
	static VentanaBienvenida bienvenida = new VentanaBienvenida();
	private Usuario user = new Usuario();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cambiarcontra = new CambiarContraseña();
					cambiarcontra.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CambiarContraseña() {
		setTitle("Reestablecer Contraseña");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnMostrarContrasea = new JRadioButton("Mostrar Contraseña");
		rdbtnMostrarContrasea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnMostrarContrasea.isSelected()==true) {
					passwordField_1.setEchoChar((char) 0);
					passwordField.setEchoChar((char) 0);
					}else {
					passwordField_1.setEchoChar('●');    
					passwordField.setEchoChar('●');  
					} 
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Conectate");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				cambiarcontra.setVisible(false);
			}
		});
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textField.setColumns(10);
		textField.setBackground(Color.BLACK);
		textField.setBounds(236, 66, 131, 20);
		contentPane.add(textField);
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setBounds(194, 320, 102, 23);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("¿Volver a conectarte?");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(184, 295, 141, 14);
		contentPane.add(lblNewLabel_1_1);
		rdbtnMostrarContrasea.setOpaque(false);
		rdbtnMostrarContrasea.setForeground(Color.RED);
		rdbtnMostrarContrasea.setBounds(236, 158, 141, 20);
		contentPane.add(rdbtnMostrarContrasea);
		
		JLabel lblNewLabel_3_1 = new JLabel("Usuario");
		lblNewLabel_3_1.setForeground(Color.RED);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(99, 69, 112, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnReestablecer = new JButton("Reestablecer");
		btnReestablecer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String icono = "/img/icono.png";
                ImageIcon icon = new ImageIcon(getClass().getResource(icono));
                
				if(passwordField.getText().equals(passwordField_1.getText())) {
					JOptionPane.showMessageDialog(contentPane, "Contraseña modificada correctamente", "Contraseña modificada",
                            JOptionPane.INFORMATION_MESSAGE,icon);
					user.modificarContraseña(passwordField.getText(), textField.getText());
				}else {
					JOptionPane.showMessageDialog(contentPane,"Introduce la misma contraseña en ambos campos","Contraseña no coincide",JOptionPane.ERROR_MESSAGE);
					passwordField.setBackground(Color.RED);
					passwordField.setForeground(Color.BLACK);
					passwordField_1.setBackground(Color.RED);
					passwordField_1.setForeground(Color.BLACK);
				}
				
			}
		});
		btnReestablecer.setBackground(Color.RED);
		btnReestablecer.setBounds(184, 255, 131, 23);
		contentPane.add(btnReestablecer);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setForeground(Color.RED);
		passwordField_1.setBackground(Color.BLACK);
		passwordField_1.setBounds(236, 131, 131, 20);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_4 = new JLabel("Repite Contraseña");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(99, 134, 112, 14);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.RED);
		passwordField.setBackground(Color.BLACK);
		passwordField.setBounds(236, 100, 131, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Nueva contraseña");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(99, 103, 112, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(CambiarContraseña.class.getResource("/img/Diablo IV.jpg")));
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBackground(SystemColor.menu);
		lblNewLabel_6.setBounds(0, 0, 495, 501);
		contentPane.add(lblNewLabel_6);
	}
}
