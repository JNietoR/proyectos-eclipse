package Aplicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;



public class TablaUsuarios extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Usuario user = new Usuario();

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
		
		table = new JTable();
		table.setModel(user.rellenarTabla());
		table.setBounds(10, 207, 415, 128);
		contentPane.add(table);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(TablaUsuarios.class.getResource("/img/Diablo IV.jpg")));
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBackground(SystemColor.menu);
		lblNewLabel_6.setBounds(-21, 0, 456, 492);
		contentPane.add(lblNewLabel_6);
		
		


	    
	}
}

