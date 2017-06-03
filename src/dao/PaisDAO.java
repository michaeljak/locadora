package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PaisDAO {
     private Connection conexao;
    
    public PaisDAO(Connection conexao){
        this.conexao=conexao;  
    }
    
    public ResultSet retrive() throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs;
    String sql = "SELECT ID,NOME FROM PAIS";
    rs = stm.executeQuery(sql);
    return rs;
    }
    
    public int retriveid (String nome) throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs;
    int i=-1;
    String sql = "SELECT ID FROM PAIS WHERE NOME='"+nome+"'";
    rs = stm.executeQuery(sql);
    while(rs.next()){
        i = rs.getInt("id");
    }
    return i;
    }
    
}
