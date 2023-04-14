package Aplicacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Usuario {
	private Conexion conexion = new Conexion();
	private Connection cn = null;
	private Statement stm = null;
	private ResultSet rs = null;
	
	public void registrar(String Usuario, String Contraseña, String Email) {
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("INSERT INTO usuarios(Usuario,Contraseña,Email) VALUES (?,?,?)");
			stm2.setString(1 , Usuario);
			stm2.setString(2 , Contraseña);
			stm2.setString(3, Email);
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void modificarDatos(String Contraseña, String Email, String Usuario) {
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement(" UPDATE usuarios SET Contraseña = ?, Email = ?  WHERE Usuario = ? ");
			stm2.setString(1, Contraseña);
			stm2.setString(2, Email);
			stm2.setString(3, Usuario);

			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void modificarContraseña(String Contraseña, String Usuario) {
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("UPDATE usuarios SET Contraseña = ? WHERE Usuario = ?");
			stm2.setString(1, Contraseña);
			stm2.setString(2, Usuario);

			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void eliminarUsuario(String Usuario) {
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("DELETE FROM usuarios WHERE Usuario = ?");
			stm2.setString(1, Usuario);
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public int comprobarDatos(String usuario, String contraseña) {
        int resultado = 0;
        try {
            cn = conexion.conectar();
            PreparedStatement stm = cn.prepareStatement("SELECT * FROM usuarios WHERE USUARIO = ? AND CONTRASEÑA= ? ");
            stm.setString(1, usuario);
            stm.setString(2, contraseña);

            rs = stm.executeQuery();
            if(rs.next()) {
                resultado =1;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (stm != null) {
                    stm.close();
                }

                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return resultado;
    }
	public DefaultTableModel rellenarTabla() {
		String[] columnas = {"TAG", "Usuario", "Contraseña","Email"};
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		try {
			String consulta = "SELECT TAG, Usuario, Contraseña, Email FROM usuarios";
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement(consulta);
			rs =stm2.executeQuery(consulta);
			modelo.addRow(columnas);
			while (rs.next()) {
			    int TAG = rs.getInt("TAG");
			    String Usuario = rs.getString("Usuario");
			    String Contraseña = rs.getString("Contraseña");
			    String Email = rs.getString("Email");
			    Object[] fila = {TAG, Usuario, Contraseña,Email};
			    
			    modelo.addRow(fila);
			}
			
		
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return modelo;
	}
	
}
