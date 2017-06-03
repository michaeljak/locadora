package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EstadoDAO {
    
     private Connection conexao;
    
    public EstadoDAO(Connection conexao){
        this.conexao=conexao;  
    }
    
    public ResultSet retrive(int id) throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs;
    String sql = "SELECT ID,NOME FROM ESTADO WHERE FK_PAIS="+id;
    rs = stm.executeQuery(sql);
    return rs;
    }
    
    public ResultSet retriveN(int id) throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs;
    String sql = "SELECT NOME FROM ESTADO WHERE ID="+id;
    rs = stm.executeQuery(sql);
    return rs;
    }
    
    public int retriveid (String nome) throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs;
    int i=-1;
    String sql = "SELECT ID FROM ESTADO WHERE NOME='"+nome+"'";
    rs = stm.executeQuery(sql);
    while(rs.next()){
        i = rs.getInt("id");
    }
    return i;
    }
    
}
