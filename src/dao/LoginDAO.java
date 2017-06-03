package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LoginDAO {
     private Connection conexao;
    
    
    public LoginDAO(Connection conexao){
        this.conexao=conexao;  
        
    }
    
    public int autentica(String unidade, String senha) throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs;
    String sql = "SELECT * FROM unidade where nome = '"+unidade+"'";
    rs = stm.executeQuery(sql);
    
    String senhabd = null, nomebd = null;
    int referencia = -1;
    while(rs.next()){
        senhabd = rs.getString("senha");
        nomebd = rs.getString("nome");
        referencia = rs.getInt("referencia");
    }
    
    if(senhabd.equals(senha)){
        return referencia;
    }else {
        return -1;
    }
   
    }
    
    
    public String retriveNome(int fk_unidade) throws SQLException {
         Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT NOME FROM UNIDADE WHERE referencia = "+fk_unidade+"";
            rs = stm.executeQuery(sql);
            
            String nome = null;
            while(rs.next()){
                nome = rs.getString("nome");
            }
            return nome;
    }
    
   
    
}
