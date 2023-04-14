package Aplicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
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
			String icono = "/img/icono.png";
            ImageIcon icon = new ImageIcon(getClass().getResource(icono));
            int respuesta = JOptionPane.showOptionDialog(null,
                    "¿Desea iniciar sesión?",
                    "Inicio de Sesión",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Sí", "No"},
                    "Sí");
				if(passwordField.getText().isEmpty() && textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(contentPane,"Por favor, introduce los datos del login","Formulario vacio",JOptionPane.ERROR_MESSAGE);
					textField.setForeground(Color.BLACK);
					textField.setBackground(Color.RED);
					passwordField.setForeground(Color.BLACK);
					passwordField.setBackground(Color.RED);
				}else {
					if(user.comprobarDatos(textField.getText(), passwordField.getText()) == 1) {	
						JOptionPane.showMessageDialog(contentPane, "Te has logeado correctamente", "Login correcto",JOptionPane.INFORMATION_MESSAGE,icon);
						VentanaBienvenida frame = new VentanaBienvenida();
						frame.setVisible(true);
						loginV.setVisible(false);
					}else {
						JOptionPane.showMessageDialog(contentPane,"Usuario / contraseña incorrecta","Datos erroneos",JOptionPane.ERROR_MESSAGE);
						textField.setForeground(Color.BLACK);
						textField.setBackground(Color.RED);
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
		
		JButton btnNewButton_1 = new JButton("Adjunta un archivo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
                // Hacemos que aparezca un fichero por defecto
                fileChooser.setSelectedFile(new File("fichero.txt"));
                // Cambiamos el título de la ventana
                fileChooser.setDialogTitle("Selecciona un fichero");
                // Agregamos dos filtros al selecctor de ficheros
                // Mostramos la ventana de seleccionar el fichero
                int resultado = fileChooser.showOpenDialog(null);
                // Si se ha seleccionado un fichero, si se pulsa cancelar no se ejecuta
                if (resultado == JFileChooser.APPROVE_OPTION){
	                // Obtenemos la ruta del fichero seleccionado
	                String ruta = fileChooser.getSelectedFile().getAbsolutePath();
                }
			}
		});
		
		JButton btnReestablecer = new JButton("Reestablecer");
		btnReestablecer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CambiarContraseña contra = new CambiarContraseña();
				contra.setVisible(true);
				loginV.setVisible(false);
			}
		});
		btnReestablecer.setForeground(Color.BLACK);
		btnReestablecer.setBackground(Color.RED);
		btnReestablecer.setBounds(184, 323, 113, 23);
		contentPane.add(btnReestablecer);
		
		JLabel lblNewLabel_5 = new JLabel("¿No recuerdas la contraseña?");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(145, 298, 196, 14);
		contentPane.add(lblNewLabel_5);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(228, 193, 140, 23);
		contentPane.add(btnNewButton_1);
		rdbtnNewRadioButton.setForeground(Color.RED);
		rdbtnNewRadioButton.setBackground(SystemColor.desktop);
		rdbtnNewRadioButton.setBounds(228, 163, 140, 23);
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
		passwordField.setBounds(228, 136, 140, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(119, 108, 58, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(119, 139, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/img/login.jpg")));
		lblNewLabel_2.setBounds(0, 0, 485, 462);
		contentPane.add(lblNewLabel_2);
	}
}
