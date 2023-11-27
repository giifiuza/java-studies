package connectionDB;
import classes.Usuario;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioConn {

    Connection conn;

    public ResultSet autenticacaoUser(Usuario objusuario) {
        conn = new ConexaoDAO().conectaBD();

        try{
            String sql = "select * from usuario where user = ? and senha = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuario.getUser());
            pstm.setString(2, objusuario.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException error){
            JOptionPane.showMessageDialog(null, "UsuarioConn" + error);
            return null;
        }
    }
}
